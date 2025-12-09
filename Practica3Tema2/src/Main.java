import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        /* EJERCICIO 1

        LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormato1 = fechaActual.format(formato1);


        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormato2 = fechaActual.format(formato2);


        DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("MMM dd, yyyy");
        String fechaFormato3 = fechaActual.format(formato3);

        JOptionPane.showMessageDialog(null, fechaFormato3);

         */

        /* EJERCICIO 2
        DateTimeFormatter formarto = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String fecha1Sin = JOptionPane.showInputDialog("Teclea la primera fecha (yyyy-MM-dd): ");
        LocalDate fecha1 = LocalDate.parse(fecha1Sin, formarto);

        String fecha2Sin = JOptionPane.showInputDialog("Teclea la segunda fecha (yyyy-MM-dd): ");
        LocalDate fecha2 = LocalDate.parse(fecha2Sin, formarto);


        if(fecha1.equals(fecha2)){
            JOptionPane.showMessageDialog(null, "Las fechas son iguales");
        } else if (fecha1.isAfter(fecha2)) {
            JOptionPane.showMessageDialog(null, "La primera fecha es anterior a la segunda");
        } else  {
            JOptionPane.showMessageDialog(null, "La segunda fecha es posterior a la primera");
        }
         */

        /* EJERCICIO 5

         */















    }
}