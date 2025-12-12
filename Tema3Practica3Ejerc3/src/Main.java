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
        String op = JOptionPane.showInputDialog("Teclea una opcion: " +
                "a) Añadir un libro a la pila: Solicitar al usuario el titulo del libro y colocarlo en la parte superior de la pila." +
                "b) Consultar el libro en la parte superior: Mostrar el titulo del libro que esta en la parte superior sin eliminarlo." +
                "c) Retirar el libro en la parte superior: Eliminar el libro de la parte superior de la pila y mostrar su titulo." +
                "d) Mostrar todos los libros en la pila: Listar todos los libros, desde el mas reciente hasta el m´ as antiguo." +
                "e) Verificar si la pila esta vacia: Informar al usuario si no hay libros en la pila." +
                "f) Salir del programa.");
        gestionarOpcionElegida(op);
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

                break;
            case "d":

                break;
            case "e":

                break;
            case "f":

                break;
        }
    }

    public static void agregarLibro(){
        String titulo = JOptionPane.showInputDialog("Titulo del libro para añadirlo a la pila: ");
        pilaLibros.add(titulo);
    }
    public static void mostrarLibroSuperior(){
        JOptionPane.showMessageDialog(null,pilaLibros);
    }




}