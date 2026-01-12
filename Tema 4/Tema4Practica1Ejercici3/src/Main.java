import Modelo.Persona;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

    public static void main(String[] args) {

        try {

            llenarDatos();
            mostrarDatosImportantes();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }

    public static void mostrarDatosImportantes() throws Exception{
        StringBuilder mensajeFinal = new StringBuilder();
        String nombreMayorEdad = conseguirPersonaMayorEdad();
        StringBuilder vivenEnElche = conseguirPersonasDeElche();
        int cantidadAdultos = conseguirCuantosAdultos();

        mensajeFinal.append("Nombre dela persona de mayor edad: ").append(nombreMayorEdad).append("\n")
                    .append("Nombre delas personas que viven en Elche: ").append(vivenEnElche).append("\n")
                    .append("Numero de personas mayores de edad: ").append(cantidadAdultos).append("\n");

        JOptionPane.showMessageDialog(null,mensajeFinal.toString());
    }

    public static void llenarDatos() throws Exception{
        boolean masPersonas = false;
        do {

            String nombre = validarsolicitardatos("nombre","^[a-zA-Z]+$","Teclea el nombre de la persona");
            String dNacimiento = validarsolicitardatos("Dia de nacimiento", "","Teclea el dia de nacimiento");
            String mNacimiento = validarsolicitardatos("Mes de nacimiento","","Teclea el mes de nacimiento");
            String aNacimiento = validarsolicitardatos("Año de nacimiento","","Teclea el año de nacimiento");
            String direccion = validarsolicitardatos("Direccion","^[a-zA-Z1-9]+$","Teclea el direccion");
            String codigoPostal = validarsolicitardatos("Codigo postal","^[0-9]{5}$","Teclea el codigo postal");
            String ciudad = validarsolicitardatos("Ciudad","^[a-zA-Z]+$","Teclea la ciudad");

            Persona persona = new Persona(nombre,dNacimiento,mNacimiento,aNacimiento,direccion,codigoPostal,ciudad);

            listaPersonas.add(persona);

            String seguirPidiendo = JOptionPane.showInputDialog("¿Hay mas personas? (si/no)");

            if (seguirPidiendo.equalsIgnoreCase("si")) {
                masPersonas = true;
            }

        }while (masPersonas);
    }

    public static String validarsolicitardatos(String dato, String expresionRegular, String mensaje){
        boolean error;
        String var = "";
        do {
            error = false;
            try {

                var = JOptionPane.showInputDialog(mensaje);

                if (var.trim().isEmpty()) {
                    throw new DatoNoValido(dato + " no puede estar vacio");
                }

                if (dato.equalsIgnoreCase("Dia de nacimiento")){
                    int diaNacimiento = Integer.parseInt(var);
                    if (diaNacimiento < 1 || diaNacimiento > 31) {
                        throw new DatoNoValido(dato + " fuera de rango");
                    }
                }else if (dato.equalsIgnoreCase("Mes de nacimiento")){
                    int mesNacimiento = Integer.parseInt(var);
                    if (mesNacimiento < 1 || mesNacimiento > 12) {
                        throw new DatoNoValido(dato + " fuera de rango");
                    }
                } else if (dato.equalsIgnoreCase("Año de nacimiento")) {
                    int anoNacimiento = Integer.parseInt(var);
                    if (anoNacimiento < 1900 || anoNacimiento > LocalDate.now().getYear()) {
                        throw new DatoNoValido(dato + " fuera de rango");
                    }
                }else{
                    Pattern patron = Pattern.compile(expresionRegular);
                    Matcher mat = patron.matcher(var);

                    if (!mat.matches()) {
                        throw new DatoNoValido(dato + " no tiene un formato valido");
                    }
                }


            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
                error = true;
            }

        }while (error);

        return var;
    }

    public static String conseguirPersonaMayorEdad(){

        String nombreMayor = "";
        LocalDate fechaMasVieja = LocalDate.of(9999, 12, 31);

        for (Persona persona : listaPersonas) {
            LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(persona.getaNacimiento()),
                                                    Integer.parseInt(persona.getmNacimiento()),
                                                    Integer.parseInt(persona.getdNacimiento()));

            if (fechaNacimiento.isBefore(fechaMasVieja)) {
                nombreMayor = persona.getNombre();
                fechaMasVieja = fechaNacimiento;
            }

        }
        return nombreMayor;

    }

    public  static StringBuilder conseguirPersonasDeElche(){
        StringBuilder personasEnElche = new StringBuilder();
        for(Persona persona : listaPersonas){
            if (persona.getCiudad().equalsIgnoreCase("elche")){
                personasEnElche.append(persona.getNombre()).append("\n");
            }
        }
        return personasEnElche;
    }

    public static int conseguirCuantosAdultos(){
        int cuantosAdultos = 0;
        for(Persona persona : listaPersonas){

            LocalDate fechaHoy = LocalDate.now();
            LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(persona.getaNacimiento()),
                    Integer.parseInt(persona.getmNacimiento()),
                    Integer.parseInt(persona.getdNacimiento()));

            Period periodo = Period.between(fechaHoy,fechaNacimiento);

            if (periodo.getYears() >= 18) {
                cuantosAdultos++;
            }
        }
        return cuantosAdultos;
    }

}















