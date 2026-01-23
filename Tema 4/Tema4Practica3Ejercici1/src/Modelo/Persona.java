package Modelo;

import java.time.LocalDate;

public class Persona {

    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String paisNacimiento;


    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento, String paisNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.paisNacimiento = paisNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
}
