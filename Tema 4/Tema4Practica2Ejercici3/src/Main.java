import Modelo.Directivo;
import Modelo.Empleado;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Directivo d1 = new Directivo("Jefe Garcia", 40, 3000, "A");
        Directivo d2 = new Directivo("Jefa Perez", 45, 3500, "B");


        d1.subordinados.add(new Empleado("Ana", 25, 1200));


        d2.subordinados.add(new Empleado("Pedro", 30, 1300));
        d2.subordinados.add(new Empleado("Luis", 28, 1250));


        Directivo ganador;
        if (d1.subordinados.size() > d2.subordinados.size()) {
            ganador = d1;
        } else {
            ganador = d2;
        }


        JOptionPane.showMessageDialog(null,
                "El directivo con más subordinados es: " + ganador.getNombre() +
                        "\nTiene a cargo: " + ganador.subordinados.size() + " personas.");



    }
}