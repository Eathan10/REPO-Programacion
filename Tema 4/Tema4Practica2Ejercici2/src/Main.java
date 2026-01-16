import Modelo.Estudio;
import Modelo.Pelicula;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    public static ArrayList<Estudio> listaEstudios = new ArrayList<>();
    public static void main(String[] args) {


        try {

            llenarDatos();
            conseguirEstudioConPeliMasLarga();
            conseguirEstudioConMasPelis();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }


    }

    public static void llenarDatos() {

        Estudio disney = new Estudio("Disney", "California", "Patata 4izquierdo", "www.disney.com", LocalDate.of(1923, 10, 16), "Estados Unidos", "123456789");
        Estudio dreamworks = new Estudio("DreamWorks", "Nueva York", "Oron 4C", "www.DeamWorks.com", LocalDate.of(1994, 10, 12), "Estados Unidos", "987654321");
        Estudio warner = new Estudio("Warner", "Texas", "Lola 8A", "www.Warner.com", LocalDate.of(1923, 4, 4), "Estados Unidos", "182453671");

        listaEstudios.add(disney);
        listaEstudios.add(dreamworks);
        listaEstudios.add(warner);


        Pelicula titanic = new Pelicula("Titanic", 1999, 160, "Romance", new ArrayList<>(Arrays.asList(disney, dreamworks)));

        Pelicula pecados = new Pelicula("Los 7 pecados", 2006, 138, "Aventura", new ArrayList<>(Arrays.asList(warner)));

        Pelicula minions = new Pelicula("Minions", 2020, 140, "Animado", new ArrayList<>(Arrays.asList(warner)));


        Pelicula shrek2 = new Pelicula("Shrek 2", 2015, 148, "Animado", new ArrayList<>(Arrays.asList(disney, dreamworks, warner)));

        listaPeliculas.add(titanic);
        listaPeliculas.add(pecados);
        listaPeliculas.add(minions);
        listaPeliculas.add(shrek2);


        for (Pelicula p : listaPeliculas) {
            for (Estudio e : p.getListaEstudios()) {
                if (e.getPeliculas() == null) {
                    e.setPeliculas(new ArrayList<>());
                }
                e.getPeliculas().add(p);
            }
        }
    }


    public static void conseguirEstudioConPeliMasLarga(){

        int tiempoMasAlto = 0;

        Pelicula peliMasLarga = new Pelicula();
        ArrayList<Estudio> estudiosConPeliMasLarga = new ArrayList<>();

        for (Pelicula peli : listaPeliculas){
            if (peli.getDuracionMinutos() > tiempoMasAlto){
                tiempoMasAlto = peli.getDuracionMinutos();
                peliMasLarga = peli;
                estudiosConPeliMasLarga.addAll(peli.getListaEstudios());
            }
        }

        StringBuilder stringConEstudios = new StringBuilder("\n");

        for (Estudio estudio : estudiosConPeliMasLarga){
            stringConEstudios.append(estudio.getNombre()).append("\n");
        }

        JOptionPane.showMessageDialog(null,"El o los estudios que tienen la peli mas larga es o son: "
                + stringConEstudios + " con la peli " + peliMasLarga.getTitulo());
    }

    public static void conseguirEstudioConMasPelis(){

        Estudio estudioConMasPelis = new Estudio();

        int numeroPelisMasAlto = 0;

        for (Estudio estudio : listaEstudios){
            if (estudio.getPeliculas().size() > numeroPelisMasAlto){
                numeroPelisMasAlto = estudio.getPeliculas().size();
                estudioConMasPelis = estudio;
            }
        }

        JOptionPane.showMessageDialog(null,"Estudio con mas pelis producidas es: " + estudioConMasPelis.getNombre());

    }

    
}