import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        /* EJERCICIO 1

        */

        String fechaStr = "31/12/9999";

        // Convertir String a LocalDate
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        String nomMasLargo = "";


        String nomCaduca = "";
        LocalDate fechaCadu = LocalDate.parse(fechaStr, formato);

        String nomMasUnidades = "";
        int numMasUnidades = -1;



        boolean error;

        do {
            error = false;
            try {

                for (int i = 0; i <10;i++){

                    String nombre = JOptionPane.showInputDialog("Nombre del producto ");
                    String descripcion = JOptionPane.showInputDialog("Introduce la descripcion del producto");
                    int numUnidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce la unidades del producto"));
                    String fechaCad = JOptionPane.showInputDialog("Introduce la fecha de caducidad del producto(dd/MM/yyyy)");

                    LocalDate fecha = LocalDate.parse(fechaCad,formato);

                    if(nombre.length() > nomMasLargo.length()){
                        nomMasLargo = nombre;
                    }

                    if (fecha.isAfter(fechaCadu)){
                        fechaCadu = fecha;
                        nomCaduca = nombre;
                    }

                    if (numUnidades > numMasUnidades){
                        numMasUnidades = numUnidades;
                        nomMasUnidades = nombre;
                    }

                }


            }catch (Exception e){
                error = true;
            }
        }while (error);

        JOptionPane.showMessageDialog(null, "El producto mas largo es: " + nomMasLargo +
                                                            "\nEl producto que caduca antes es: " + nomCaduca +
                                                            "\nEl producto con mas unidades es: " + nomMasUnidades);


    }
}