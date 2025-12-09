import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        StringBuilder recibo = new StringBuilder();

        String[] opciones = {"Imposicion","Reintegro"};

        boolean salirCliente;
        boolean salirCuenta;
        boolean salirTransaccion;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            recibo = new StringBuilder("");
            salirCliente = true;
            try {

                String nombreCliente = solicitarValidarDatos("Nombre del cliente","Introduce el nombre del cliente","^[a-zA-Z]+$");
                recibo.append("Cliente: " + nombreCliente + "\n");

                do {
                    salirCuenta = true;
                    try {

                        String nCuenta = solicitarValidarDatos("Numero de cuenta", "Introduce el numero de cuenta","^[0-9]{8}$");
                        recibo.append("Cuenta: " + nCuenta + "\n");

                        int saldoInicial = Integer.parseInt(solicitarValidarDatos("Saldo inicial", "Introduce el saldo inicial","^[1-9][0-9]+$"));
                        recibo.append("Saldo inicial: " + saldoInicial + "\n");

                        do {
                            salirTransaccion = true;
                            try {
                                int op = JOptionPane.showOptionDialog(null, "¿Que operacion quieres realizar?","OPERACIONES", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                                LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Introduce la fecha (dd/MM/yyyy)"), dtf);

                                if (op == 0){

                                    

                                }else{


                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, e.getMessage());
                                salirTransaccion = false;
                            }
                        } while (!salirTransaccion);

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        salirCuenta = false;
                    }
                } while (!salirCuenta);

            } catch(Exception e) {
                salirCliente = false;
            }
        } while (!salirCliente);


    }


    public static String solicitarValidarDatos(String dato, String mensaje, String exprecionRegular){
        String var = "";
        boolean error;
        do {
            try {
                var = JOptionPane.showInputDialog(mensaje);

                if(var.isEmpty()){
                    throw new IllegalArgumentException(dato + " es obligatorio");
                }

                Pattern pat = Pattern.compile(exprecionRegular);
                Matcher mat = pat.matcher(var);

                if(!mat.matches()){
                    throw new IllegalArgumentException(dato + " no tiene un formato valido");
                }
                error = false;

            }catch(Exception e) {

                error = true;
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while (error);

        return var;
    }
}