import Modelo.Alumno;

import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    public static void main(String[] args) {

        try {

            llevarListaAlumnos();
            buscarAlumnoPorCodigo();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

    }


    public static void llevarListaAlumnos() throws Exception {

        Alumno alumno1 = new Alumno(1,"eathan","Patatas 32 4A",123456789);
        listaAlumnos.add(alumno1);
        Alumno alumno2 = new Alumno(2,"pepe","chachacha 9 99A",987654321);
        listaAlumnos.add(alumno2);
        Alumno alumno3 = new Alumno(3,"lolaaaa","Patatas 32 4A",112233445);
        listaAlumnos.add(alumno3);
        Alumno alumno4 = new Alumno(4,"Zairaaaa","Patatas 32 4A",221133778);
        listaAlumnos.add(alumno4);
        Alumno alumno5 = new Alumno(5,"ñañaaa","Patatas 32 4A",132514280);
        listaAlumnos.add(alumno5);

    }

    public static void buscarAlumnoPorCodigo() throws Exception {
        String otroAlumno;
        do {
            int codBuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del alumno a buscar: "));
            int i;
            for ( i = 0; i < listaAlumnos.size() && codBuscar != listaAlumnos.get(i).getCodigo(); i++) {}

            if (i > listaAlumnos.size()){
                JOptionPane.showMessageDialog(null,"Alumno no encontrado");
            }else {
                Alumno alumno = listaAlumnos.get(i);
                JOptionPane.showMessageDialog(null,"Codigo: " + alumno.getCodigo() +
                                                                            "\nNombre:" + alumno.getNombre() +
                                                                            "\nDireccion: " +  alumno.getDireccion() +
                                                                            "\nTelefono: " + alumno.getTelefono());
            }

            otroAlumno = JOptionPane.showInputDialog("¿Quieres buscar otro alumno?");

        }while (otroAlumno.equalsIgnoreCase("si"));

    }
}