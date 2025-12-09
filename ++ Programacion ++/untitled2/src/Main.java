import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

       // int codPostal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo postal"));

        //Pattern pat = Pattern.compile("^[0-9]{5}$");



        // 2

        /*
        String codPostal = JOptionPane.showInputDialog("Ingrese el codigo postal");

        Pattern pat = Pattern.compile("^01[0-9]{4}$");

        Matcher mat = pat.matcher(codPostal);

        if (!mat.matches()) {
            JOptionPane.showMessageDialog(null, "El codigo postal no es valido");
        }


         */


        // 3

        /*
        String cadena = JOptionPane.showInputDialog("Ingrese el codigo postal");

        Pattern pat = Pattern.compile("[a-zA-Z ]+");


         */


        // 4

        /*
        String email = JOptionPane.showInputDialog("Ingrese el email");

        Pattern pat = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z]+\.[a-zA-Z]{2,}$");

         */


        // 5


        /*
        String tarjera = JOptionPane.showInputDialog("Ingrese el numero de tarjeta");

        Pattern pat = Pattern.compile("^(\\d{4}(\\s|-)){3}\\d{4}$");

         */



        // 6

        /*

        String tarjera = JOptionPane.showInputDialog("Ingrese el numero de telefono");

        Pattern pat = Pattern.compile("(^\\+34(\\d{3} ){2}[\\d]{3}$|^(\\d{3}-)$)");

        if (!pat.matcher(tarjera).matches()) {
            JOptionPane.showMessageDialog(null, "El numero de telefono es incorrecto");
        }

         */
        //8

        /*

        String tarjera = JOptionPane.showInputDialog("Ingrese el numero de tarjeta");

        Pattern pat = Pattern.compile("^[a-zA-Z]\\w{4,16}");

         */

        // 9



        String tarjera = JOptionPane.showInputDialog("Ingrese el numero de tarjeta");

        Pattern pat = Pattern.compile("([A-Z]+[a-z]+[0-9]+(@\\$%&){8,}");



    }
}