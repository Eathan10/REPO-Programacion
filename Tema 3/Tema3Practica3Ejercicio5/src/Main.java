import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Map<String, Double> gastosMensuales = new HashMap<>();
        boolean continuar = true;

        while (continuar) {
            String mes = JOptionPane.showInputDialog(null,
                    "Introduce el MES (o escribe 'salir' para terminar):",
                    "Entrada de Datos", JOptionPane.QUESTION_MESSAGE);


            if (mes == null || mes.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {
                try {
                    String diaStr = JOptionPane.showInputDialog("Introduce el DÍA:");
                    String cantidadStr = JOptionPane.showInputDialog("Introduce la CANTIDAD:");

                    double cantidad = Double.parseDouble(cantidadStr);
                    mes = mes.toLowerCase().trim();

                    gastosMensuales.put(mes, gastosMensuales.getOrDefault(mes, 0.0) + cantidad);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor numérico no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }


        if (!gastosMensuales.isEmpty()) {
            List<Map.Entry<String, Double>> listaOrdenada = new ArrayList<>(gastosMensuales.entrySet());
            listaOrdenada.sort(Map.Entry.comparingByValue());

            StringBuilder resumen = new StringBuilder("--- RESUMEN DE GASTOS ANUALES ---\n");
            for (Map.Entry<String, Double> entrada : listaOrdenada) {
                String mesFormato = entrada.getKey().substring(0, 1).toUpperCase() + entrada.getKey().substring(1);
                resumen.append(String.format("%s: %.2f€\n", mesFormato, entrada.getValue()));
            }

            JOptionPane.showMessageDialog(null, resumen.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No se introdujeron datos.");
        }
    }
}