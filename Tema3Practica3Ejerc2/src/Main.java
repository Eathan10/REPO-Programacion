import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static Queue<LocalDate> fechasCaducidad = new LinkedList<>();
    public static Queue<String> nombresProductos = new LinkedList<>();

    public static void main(String[] args) {
        try {
            conseguirProductos();
            pedirFechaDeHoy();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }


    }

    public static void conseguirProductos() throws Exception{
        boolean salir;
        do {
            LocalDate fechaCaducidad = pedirFecha();
            String nombre = pedirNombre();

            fechasCaducidad.add(fechaCaducidad);
            nombresProductos.add(nombre);

            String masProduc = JOptionPane.showInputDialog("¿Hay mas productos? (Si o No)");

            if(masProduc.equalsIgnoreCase("no")){
                salir = true;
            }else {
                salir = false;
            }
        }while (!salir);
    }

    public static LocalDate pedirFecha() throws Exception{

        String fecha = JOptionPane.showInputDialog("Indica la fecha de Caducidad");
        return LocalDate.parse(fecha,formatoFecha);

    }

    public static String pedirNombre() throws Exception{
        return JOptionPane.showInputDialog("Indica el nombre del producto");
    }

    public static void pedirFechaDeHoy() throws Exception{
        String fecha = JOptionPane.showInputDialog("Indica la fecha de hoy");
        LocalDate hoy = LocalDate.parse(fecha,formatoFecha);
    }
}