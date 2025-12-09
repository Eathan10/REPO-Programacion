import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        boolean error;

        StringBuilder factura = new StringBuilder();
        LocalDate fecha = LocalDate.now();
        int totalSinIva = 0;

        do {
            error = false;
            try {

                String nombre = solicitarNombre();

                factura.append("Nombre: " + nombre + " Fecha: " + fecha);

                do {

        try {



                        int cantidad = solicitarCantidad();
                        int precioUnitario = solicitarPrecioUnitario();
                        int porcentajeIva = solicitarPorcentajeDeIva();


                        totalSinIva += cantidad * precioUnitario;

                        factura.append("\n" + cantidad + " x " + precioUnitario + " = " + (cantidad * precioUnitario));


                        //😒capichi



                        String masProductos = JOptionPane.showInputDialog("¿Quieres comprar otro producto? (si o no)");

                        if (masProductos.equalsIgnoreCase("si")) {
                            error = true;
                        } else if (masProductos.equalsIgnoreCase("no")) {
                            error = false;

                            factura.append("\nTotal sin IVA: " + totalSinIva);

                            factura.append("\nTotal IVA " + (totalSinIva * 0.21) + "\nTotal con IVA: " + (totalSinIva - totalSinIva * 0.21));



                        }

                    }catch (Exception e) {
                        error = true;
                    }

                }while (error);




            }catch (Exception e){

                error = true;

            }

        }while (error);

        JOptionPane.showMessageDialog(null, "Factura:\n" + factura);


    }


    public static String solicitarNombre() throws Exception{
        return JOptionPane.showInputDialog("Introduce el nombre del cliente");
    }

    public static int solicitarCantidad() throws Exception{
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad"));
    }

    public static int solicitarPrecioUnitario() throws Exception{
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio unitario"));
    }

    public static int solicitarPorcentajeDeIva() throws Exception{
        return Integer.parseInt(JOptionPane.showInputDialog("Introduce el procentaje de iva (Normal: 21%, Reducido: 10%, Superedicido)"));
    }



}