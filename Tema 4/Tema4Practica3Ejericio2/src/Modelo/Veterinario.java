package Modelo;

import java.util.ArrayList;

public class Veterinario {

    private String dni;
    private String numSegurdadSoci;

    private ArrayList<Mascota> mascotasAsignadas;


    public Veterinario() {
    }

    public Veterinario(String dni, String numSegurdadSoci) {
        this.dni = dni;
        this.numSegurdadSoci = numSegurdadSoci;
    }

    public Veterinario(String dni, String numSegurdadSoci, ArrayList<Mascota> mascotasAsignadas) {
        this.dni = dni;
        this.numSegurdadSoci = numSegurdadSoci;
        this.mascotasAsignadas = mascotasAsignadas;
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumSegurdadSoci() {
        return numSegurdadSoci;
    }

    public void setNumSegurdadSoci(String numSegurdadSoci) {
        this.numSegurdadSoci = numSegurdadSoci;
    }

    public ArrayList<Mascota> getMascotasAsignadas() {
        return mascotasAsignadas;
    }

    public void setMascotasAsignadas(ArrayList<Mascota> mascotasAsignadas) {
        this.mascotasAsignadas = mascotasAsignadas;
    }
}
