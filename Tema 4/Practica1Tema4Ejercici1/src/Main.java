import Modelo.Circunferencia;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String respuesta = JOptionPane.showInputDialog("Introduce el radio:");
        double radio = Double.parseDouble(respuesta);


        Circunferencia circ = new Circunferencia();
        circ.calcularTodo(radio);


        String resultado = "Longitud: " + circ.getLongitud() +
                "\nÁrea: " + circ.getArea() +
                "\nVolumen: " + circ.getVolumen();


        JOptionPane.showMessageDialog(null, resultado);
    }
}