import Modelo.Alumno;
import Modelo.Autor;
import Modelo.Libro;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static ArrayList<Autor> listaAutores = new ArrayList<>();
    public static ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    public static ArrayList<Libro> listaLibros = new ArrayList<>();

    public static void main(String[] args) {

        try {

            llenarDatos();
            mostrarMenu();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public static void llenarDatos() throws Exception {

        // AUTORES
        Autor pepeCuenca = new Autor("Pepe Cuenca", LocalDate.of(1996,10,1),"España");
        Autor sebasHerrera = new Autor("Sebas Herrera", LocalDate.of(2005,5,12),"Colombia");
        Autor marx = new Autor("Marx", LocalDate.of(1824,2,30),"Alemania");
        listaAutores.add(pepeCuenca);
        listaAutores.add(sebasHerrera);
        listaAutores.add(marx);



        // LIBROS
        Libro libro1 = new Libro("El hombre en busca de sentido","Planet",310,3,sebasHerrera);
        Libro libro2 = new Libro("El Capital","Universal",619,3,marx);
        Libro libro3 = new Libro("Sapiens","koket",390,3,pepeCuenca);
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);


        // ALUMNOS

        ArrayList<Libro> librosEathan = new ArrayList<>();
        Alumno eathan = new Alumno("Eathan Garzon",LocalDate.of(2005,10,1),"Colombia","Z0516283A",librosEathan);

        ArrayList<Libro> librosPepe = new ArrayList<>();
        Alumno pepe = new Alumno("Pepe Lopez",LocalDate.of(1991,1,29),"España","J12345678",librosPepe);

        ArrayList<Libro> librosEugenio = new ArrayList<>();
        Alumno eugenio = new Alumno("Eugenio Pachanga",LocalDate.of(1979,11,11),"Mexico","P95134265",librosEugenio);

        listaAlumnos.add(eathan);
        listaAlumnos.add(pepe);
        listaAlumnos.add(eugenio);

    }


    public static void mostrarMenu() throws Exception {
        int op = Integer.parseInt(JOptionPane.showInputDialog("--- MENU BIBLIOTECA ---\n 1. Alquilar libro " +
                                                                                        "\n 2. Devolver " +
                                                                                        "\n 3. Ver datos disponibles \n" +
                                                                                        "0. Salir"));
        gestionarOpcion(op);
    }

    public static void gestionarOpcion(int opcion) throws Exception {
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "Saliendo de la biblioteca...");
                break;
            case 1:
                alquilarLibro();
                break;
            case 2:
                devolverLibro();
                break;
            case 3:
                verDatosDisponibles();
                break;
        }
    }


    public static void alquilarLibro() throws Exception {

        String titulo = JOptionPane.showInputDialog("Titulo del libro que quieres alquilar:");
        int i;
        for (i = 0; i < listaLibros.size() && !titulo.equalsIgnoreCase(listaLibros.get(i).getTitulo()); i++) {}

        if (i == listaLibros.size()) {
            throw new Exception("Libro no encontrado");
        }

        Libro libro = listaLibros.get(i);

        String nombreAlumno = JOptionPane.showInputDialog("Nombre del alumno que quiere alquilar:");

        int x;
        for (x = 0; x < listaAlumnos.size() && !nombreAlumno.equalsIgnoreCase(listaAlumnos.get(x).getNombre()); i++) {}

        if (x == listaAlumnos.size()) {
            throw new Exception("Alumno no encontrado");
        }

        Alumno alumno = listaAlumnos.get(x);

        alumno.getLibrosAlquilados().add(libro);


    }

    public static void devolverLibro() throws Exception {



    }

    public static void verDatosDisponibles() throws Exception {

    }






}