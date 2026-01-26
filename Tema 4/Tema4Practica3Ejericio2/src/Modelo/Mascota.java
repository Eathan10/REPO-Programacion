package Modelo;

import java.time.LocalDate;

public class Mascota {

    private String nombre;
    private String tipo;
    private String raza;
    private LocalDate fechaNacimiento;
    private String sexo;
    private double peso;
    private double longitud;
    private String tipoPelo;

    private Cliente propietario;
    private Veterinario veterinario;


    public Mascota() {
    }

    public Mascota(String nombre, String tipo, String raza, LocalDate fechaNacimiento, String sexo, double peso, double longitud, String tipoPelo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.longitud = longitud;
        this.tipoPelo = tipoPelo;
    }

    public Mascota(String nombre, String tipo, String raza, LocalDate fechaNacimiento, String sexo, double peso, double longitud, String tipoPelo, Cliente propietario, Veterinario veterinario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.longitud = longitud;
        this.tipoPelo = tipoPelo;
        this.propietario = propietario;
        this.veterinario = veterinario;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public void setTipoPelo(String tipoPelo) {
        this.tipoPelo = tipoPelo;
    }

    public Cliente getPropietario() {
        return propietario;
    }

    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
