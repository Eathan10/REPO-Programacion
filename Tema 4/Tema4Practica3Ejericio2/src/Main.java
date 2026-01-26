import Modelo.Cliente;
import Modelo.Mascota;
import Modelo.Veterinario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static List<Cliente> listClientes;
    public static List<Mascota> listMascotas;
    public static List<Veterinario> listVeterinarios;

    public static void main(String[] args) {

        try {

            pedirDatos();


        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }

    public static String validarSolicitarDatos(String dato, String mensaje, String explecionRegular) throws Exception{

        String var = "";
        boolean error;
        do {
            error = false;
            try {

                var = JOptionPane.showInputDialog(mensaje);

                if (var.trim().isEmpty()){
                    throw new Exception(dato + " es obligatorio");
                }

                Pattern pat = Pattern.compile(explecionRegular);
                Matcher mat = pat.matcher(var);

                if (!mat.matches()) {
                    throw new Exception(dato + " no tiene un formato valido");
                }

            }catch (Exception e){
                JOptionPane.showMessageDialog(null,e);
                error = true;
            }

        }while (error);

        return var;
    }


    public static void pedirDatos() throws Exception{

        pedirDatosClientes();
        pedirDatosMascotas();
        llenarDatosVeterinarios();

    }

    public static void pedirDatosClientes() throws Exception{

        listClientes = new ArrayList<>();

        for (int i = 0; i < 2; i++){
            String nombre = validarSolicitarDatos("Nombre","Introduce el nombre del cliente","^[a-zA-Z]+$");
            String direccion = validarSolicitarDatos("Direccion","Introduce la direccion de domicilio","^[a-zA-Z0-9]+$");
            String telefono = validarSolicitarDatos("Telefono","Teclea el telefono del cliente","^[0-9]{9}$");

            Cliente cliente = new Cliente(nombre, direccion, telefono);
            listClientes.add(cliente);
        }

    }

    public static void pedirDatosMascotas() throws Exception{

    }

    public static void llenarDatosVeterinarios() throws Exception{

        listVeterinarios = new ArrayList<>();

        listVeterinarios.add(new Veterinario("12345678A","10827363535426"));
        listVeterinarios.add(new Veterinario("87654321B","10264528192634"));


    }







}