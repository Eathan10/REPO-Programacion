import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

    public static Deque<String> pilaLibros = new LinkedList<>();
    public static void main(String[] args) {

        try {

            mostrarMenu();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

    }

    public static void mostrarMenu(){
        String op;
        do {
            op = JOptionPane.showInputDialog("Teclea una opcion: " +
                    "\na) Añadir un libro a la pila" +
                    "\nb) Consultar el libro en la parte superior" +
                    "\nc) Retirar el libro en la parte superior" +
                    "\nd) Mostrar todos los libros en la pila" +
                    "\ne) Verificar si la pila esta vacia" +
                    "\nf) Salir del programa");
            gestionarOpcionElegida(op);
        }while (!op.equalsIgnoreCase("f"));

    }

    public static void gestionarOpcionElegida(String op){
        switch (op){
            case "a":
                agregarLibro();
                break;
            case "b":
                mostrarLibroSuperior();
                break;
            case "c":
                eliminarLibroSuperiorYmostrarlo();
                break;
            case "d":
                mostrarTodosLosLibros();
                break;
            case "e":
                pilaVaciaOno();
                break;
            case "f":
                JOptionPane.showMessageDialog(null, "Saliendo del programa");
                break;
        }
    }

    public static void agregarLibro(){
        String titulo = JOptionPane.showInputDialog("Titulo del libro para añadirlo a la pila: ");
        pilaLibros.push(titulo);
    }

    public static void mostrarLibroSuperior(){
        JOptionPane.showMessageDialog(null,pilaLibros.peek());
    }

    public static void eliminarLibroSuperiorYmostrarlo(){
        JOptionPane.showMessageDialog(null,pilaLibros.pop());
    }

    public static void mostrarTodosLosLibros(){
        StringBuilder mensaje = new StringBuilder("Todos los libros de la pila son:");
        for(String libro: pilaLibros){
            mensaje.append("\n- " + libro);
        }
        JOptionPane.showMessageDialog(null,mensaje);
    }

    public static void pilaVaciaOno(){
        if (pilaLibros.isEmpty()){
            JOptionPane.showMessageDialog(null,"La pila esta vacia");
        } else {
            JOptionPane.showMessageDialog(null,"La pila SI tiene libros");
        }
    }










}