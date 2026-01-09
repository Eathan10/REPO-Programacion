import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Map<Integer, String> contactos = new HashMap<>();
    public static void main(String[] args) {
        try {
            mostrarMenu();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

    public static void mostrarMenu() throws Exception{

        String op;
        do {
            op = JOptionPane.showInputDialog("Elije una opcion" +
                                            "\n1.- Añadir un nuevo numero." +
                                            "\n2.- Borrar un numero." +
                                            "\n3.- Buscar un numero" +
                                            "\n4.- Borrar por nombre." +
                                            "\n5.- Buscar por nombre." +
                                            "\n6.- Salir.");

            gestionarOpciones(op);
        }while (!op.equalsIgnoreCase("6"));

    }

    public static void gestionarOpciones(String opcion) throws Exception{

        switch (opcion) {
            case "1":
                insertarContacto();
                break;
            case "2":
                borrarPorNumero();
                break;
            case "3":
                buscarPorNumero();
                break;
            case "4":
                borrarPorNombre();
                break;
            case "5":
                buscarPorNombre();
                break;
            case "6":
                JOptionPane.showMessageDialog(null,"Saliendo del programa...");
                break;
            default:
                JOptionPane.showMessageDialog(null,opcion + " no es una opcion valida.");
        }

    }


    public static void insertarContacto() throws Exception{
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));

        contactos.put(numero, nombre);

        JOptionPane.showMessageDialog(null,"Contacto insertado exitosamente.");
    }

    public static void borrarPorNumero() throws Exception{
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quiere eliminar"));
        JOptionPane.showMessageDialog(null,contactos.remove(numero) + " fuel eliminado exitosamente.");
    }

    public static void buscarPorNumero() throws Exception{
        int  numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del contacto que quiere buscar"));
        JOptionPane.showMessageDialog(null,contactos.get(numero));
    }


    public static void borrarPorNombre() throws Exception{
        String nombre = JOptionPane.showInputDialog("Indica el nombre del contacto que quiere borrar");
        for (int clave : contactos.keySet()) {
            if (contactos.get(clave).equals(nombre)) {
                contactos.remove(clave);
                JOptionPane.showMessageDialog(null,"Contacto:\n " + nombre + " - " + clave +
                                                                            "\n ha sido borrado");
            }
        }
    }

    public static void buscarPorNombre() throws Exception{
        String nombre = JOptionPane.showInputDialog("Indica el nombre del contacto que quiere buscar");
        for (int clave : contactos.keySet()) {
            if (contactos.get(clave).equals(nombre)) {
                JOptionPane.showMessageDialog(null,"Contacto:\n " + nombre + " - " + clave);
            }
        }
    }

}