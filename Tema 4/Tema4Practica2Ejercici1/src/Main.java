import Modelo.Estudio;
import Modelo.Pelicula;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

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

    public static void llenarDatos(){

        Estudio estudio1 = new Estudio("Disney","California","Patata 4izquierdo","www.disney.com", LocalDate.of(1886,2,10),"Estados Unidos","123456789");
        listaEstudios.add(estudio1);
        Estudio estudio2 = new Estudio("DreamWorks","Nueva York","Oron 4C","www.DeamWorks.com", LocalDate.of(1950,2,10),"Estados Unidos","987654321");
        listaEstudios.add(estudio2);
        Estudio estudio3 = new Estudio("Warner","Texas","Lola 8A","www.Warner.com", LocalDate.of(1901,2,10),"Estados Unidos","182453671");
        listaEstudios.add(estudio3);



        ArrayList<Estudio> estudiosP1 = new ArrayList<>();
        estudiosP1.add(estudio1);
        estudiosP1.add(estudio2);
        Pelicula peli1 = new Pelicula("Titanic",1999,160,"Romance",estudiosP1);
        listaPeliculas.add(peli1);


        ArrayList<Estudio> estidiosP2 = new ArrayList<>();
        estidiosP2.add(estudio3);
        Pelicula peli2 = new Pelicula("Los 7 pecados",2006,138,"Aventura",estidiosP2);
        listaPeliculas.add(peli2);


        ArrayList<Estudio> estidiosP3 = new ArrayList<>();
        estidiosP3.add(estudio3);
        Pelicula peli3 = new Pelicula("Minions",2020,140,"Animado",estidiosP3);
        listaPeliculas.add(peli3);


        ArrayList<Estudio> estidiosP4 = new ArrayList<>();
        estidiosP4.add(estudio1);
        estidiosP4.add(estudio2);
        estidiosP4.add(estudio3);
        Pelicula peli4 = new Pelicula("Shrek 2",2015,148,"Animado",estidiosP4);
        listaPeliculas.add(peli4);



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
        int contadorDisney = 0;
        int contadorDreamWorks = 0;
        int contadosWarner = 0;

        for (Pelicula peli : listaPeliculas){
            for(Estudio estudio : peli.getListaEstudios()){
                if (estudio.getNombre().equalsIgnoreCase("Disney")){
                    contadorDisney++;
                } else if (estudio.getNombre().equalsIgnoreCase("DreamWorks")){
                    contadorDreamWorks++;
                } else if (estudio.getNombre().equalsIgnoreCase("Warner")){
                    contadosWarner++;
                }
            }
        }

        if(contadorDisney > contadosWarner && contadorDisney > contadorDreamWorks){
            JOptionPane.showMessageDialog(null,"Estudio con mas pelis producidas es: Disney");
        }else if(contadosWarner > contadorDreamWorks && contadosWarner > contadorDisney){
            JOptionPane.showMessageDialog(null,"Estudio con mas pelis producidas es: Warner");
        }else{
            JOptionPane.showMessageDialog(null,"Estudio con mas pelis producidas es: DreamWorks");
        }

    }
}