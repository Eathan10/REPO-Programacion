package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Alumno extends Persona {

    private String dni;
    private ArrayList<Libro> librosAlquilados;

    public Alumno(String nombre, LocalDate fechaNacimiento, String paisNacimiento) {
        super(nombre, fechaNacimiento, paisNacimiento);
    }

    public Alumno(String nombre, LocalDate fechaNacimiento, String paisNacimiento, String dni) {
        super(nombre, fechaNacimiento, paisNacimiento);
        this.dni = dni;
    }

    public Alumno(String dni, ArrayList<Libro> librosAlquilados) {
        this.dni = dni;
        this.librosAlquilados = librosAlquilados;
    }

    public Alumno(String nombre, LocalDate fechaNacimiento, String paisNacimiento, String dni, ArrayList<Libro> librosAlquilados) {
        super(nombre, fechaNacimiento, paisNacimiento);
        this.dni = dni;
        this.librosAlquilados = librosAlquilados;
    }

    public Alumno() {
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Libro> getLibrosAlquilados() {
        return librosAlquilados;
    }

    public void setLibrosAlquilados(ArrayList<Libro> librosAlquilados) {
        this.librosAlquilados = librosAlquilados;
    }
}
