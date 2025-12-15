import javax.swing.*;
import java.util.ArrayList;

public class Main {
    ArrayList<String> porteros = new ArrayList<>();
    ArrayList<String> defensas = new ArrayList<>();
    ArrayList<String> delanteros = new ArrayList<>();
    ArrayList<String> centrocampistas = new ArrayList<>();

    public static void main(String[] args) {

        try {

            mostrarMenu();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }



    }

    public static void mostrarMenu() throws Exception{
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Con que grupo quieres trabajar: \n" +
                                                                    "1. Porteros\n" +
                                                                    "2. Defensas\n" +
                                                                    "3. Delanteros\n" +
                                                                    "4. Centrocampistas"));
        switch(opcion){
            case 1:
                porterosOperaciones();
                break;
            case 2:
                defensasOperaciones();
                break;
            case 3:
                delanterosOperaciones();
                break;
            case 4:
                centroCampistasOperaciones();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
        }

    }

    public static void porterosOperaciones() throws Exception{
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Que operacion quieres hacer? \n" +
                                                                    "1. Dar de alta\n" +
                                                                    "2. Dar de baja\n" +
                                                                    "3. Modificar\n"));
        switch(opcion){
            case 1:
                porterosOperaciones();
                break;
            case 2:
                defensasOperaciones();
                break;
            case 3:
                delanterosOperaciones();
                break;
            case 4:
                centroCampistasOperaciones();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion no valida");
        }
    }
    public static void defensasOperaciones() throws Exception{}
    public static void delanterosOperaciones() throws Exception{}
    public static void centroCampistasOperaciones() throws Exception{}


}