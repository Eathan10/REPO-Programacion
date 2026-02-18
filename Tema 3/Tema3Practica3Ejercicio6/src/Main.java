import javax.swing.*;
import java.util.*;

public class Main {

    public static String[] especiesAceptadas = {"perro", "gato", "conejo", "loro", "tortuga"};
    public static ArrayList<String> animalesRescatados = new ArrayList<>();
    public static Map<String, String> cuidadorPorAnimal = new HashMap<>();
    public static Queue<String> colaAdopcion = new LinkedList<>();


    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {
            String menu = "--- MENÚ DEL REFUGIO ---\n"
                    + "1. Ver especies aceptadas\n"
                    + "2. Agregar animal rescatado\n"
                    + "3. Asignar cuidador a animal\n"
                    + "4. Pasar a cola de adopción\n"
                    + "5. Adoptar (entregar animal)\n"
                    + "6. Listar animales y cuidadores\n"
                    + "7. Salir\n\n Elige una opción:";

            String opcionStr = JOptionPane.showInputDialog(null, menu, "Gestión Refugio", JOptionPane.PLAIN_MESSAGE);

            if (opcionStr == null || opcionStr.equals("7")) {
                continuar = false;
            } else {
                try {
                    int opcion = Integer.parseInt(opcionStr);

                    switch (opcion) {
                        case 1:
                            verEspecies();
                            break;
                        case 2:
                            agregarRescatado();
                            break;
                        case 3:
                            asignarCuidador();
                            break;
                        case 4:
                            pasarAadopcion();
                            break;
                        case 5:
                            adoptar();
                            break;
                        case 6:
                            listar();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opción no válida.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Introduce un número válido.");
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado.");
    }

    public  static void verEspecies() {
        JOptionPane.showMessageDialog(null, "Aceptamos: " + Arrays.toString(especiesAceptadas));
    }

    public static void agregarRescatado() {
        String nombre = JOptionPane.showInputDialog("Nombre del animal:");
        String especie = JOptionPane.showInputDialog("Especie (perro, gato, etc.):");
        if (nombre != null && especie != null) {
            especie = especie.toLowerCase().trim();
            if (Arrays.asList(especiesAceptadas).contains(especie)) {
                animalesRescatados.add(nombre + "-" + especie);
                JOptionPane.showMessageDialog(null, nombre + " ha sido registrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Especie no permitida.", "Error", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void asignarCuidador() {
        String animalBusqueda = JOptionPane.showInputDialog("¿A qué animal asignar cuidador?");
        String nombreCuidador = JOptionPane.showInputDialog("Nombre del cuidador:");

        boolean existe = false;
        for(String s : animalesRescatados) {
            if (s.startsWith(animalBusqueda + "-")){
                existe = true;
            }
        }

        if (existe) {
            cuidadorPorAnimal.put(animalBusqueda, nombreCuidador);
            JOptionPane.showMessageDialog(null, "Asignado: " + nombreCuidador + " cuidará de " + animalBusqueda);
        } else {
            JOptionPane.showMessageDialog(null, "El animal no está en la lista de rescatados.");
        }
    }

    public static void pasarAadopcion() {
        String aPasar = JOptionPane.showInputDialog("Nombre del animal que está listo:");
        String registroEncontrado = null;
        for (String registro : animalesRescatados) {
            if (registro.startsWith(aPasar + "-")) {
                registroEncontrado = registro;
                break;
            }
        }
        if (registroEncontrado != null) {
            animalesRescatados.remove(registroEncontrado);
            colaAdopcion.add(aPasar);
            JOptionPane.showMessageDialog(null, aPasar + " ha pasado a la cola de adopción.");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado.");
        }
    }

    public static void adoptar() {
        if (!colaAdopcion.isEmpty()) {
            String animalAdoptado = colaAdopcion.poll();
            cuidadorPorAnimal.remove(animalAdoptado); // Ya no necesita cuidador en el refugio
            JOptionPane.showMessageDialog(null, "¡Felicidades! " + animalAdoptado + " ha sido adoptado.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay animales listos para adopción.");
        }
    }

    public static void listar() {
        StringBuilder sb = new StringBuilder("--- ESTADO ACTUAL ---\n");
        cuidadorPorAnimal.forEach((ani, cui) -> sb.append(ani).append(" -> Cuidador: ").append(cui).append("\n"));
        JOptionPane.showMessageDialog(null, sb.length() > 22 ? sb.toString() : "No hay cuidadores asignados.");
    }
}