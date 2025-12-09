import javax.swing.*;

public class Main {

    static String texto;
    public static void main(String[] args) {

        /* EJERCICIO 1
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Teclea el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Teclea el segundo numero"));
        int resultado = 0;
        double rc1 = 0;
        double rc2 = 0;

        try {

            resultado = num1 / num2;

            rc1 = Math.sqrt(num1);
            rc2 = Math.sqrt(num2);

            JOptionPane.showMessageDialog(null,"Reices Cuadradas: " + rc1 + " - " + rc2 +
                    " Resultado de la division: " + resultado);

        }catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"No se pudo hacer la division");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error");
        }
         */


        /* EJERCICIO 2

         */

        boolean error;
        boolean salir;

        String op = "";


        do {
            salir = true;
            try {
                op = JOptionPane.showInputDialog("Elija una opcion:\n " +
                        "a) Solicitar una cadena de caracteres.\n " +
                        "b) Visualizar el caracter de la posición x de una cadena de caracteres.\n " +
                        "c) Convertir la cadena de caracteres en un numero entero.\n " +
                        "d) Convertir la cadena de caracteres en una fecha.\n " +
                        "e) Finalizar");



                if (op == null){
                    salir = false;
                    throw new Exception("Operacion cancelada");
                }

                if (!op.equalsIgnoreCase("a") && !op.equalsIgnoreCase("b") && !op.equalsIgnoreCase("c")
                                                        && !op.equalsIgnoreCase("d") && !op.equalsIgnoreCase("e")) {
                    throw new Exception("Opcion invalida");
                }



                switch (op) {
                    case "a":
                        texto = pedirTexto();
                        break;
                    case "b":
                        verCaracterEspecifico();
                        break;
                    case "c":

                        break;
                    case "d":

                        break;
                    case "e":
                        JOptionPane.showMessageDialog(null,"Finalizando programa...");
                        break;
                }



            }catch (Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }while (salir);

    }

    public static String pedirTexto() throws Exception {
        String texto = JOptionPane.showInputDialog("Teclea una cadena de caracteres.");

        if (texto == null){
            throw new Exception("Operación cancelada");
        }

        if (texto.trim().isEmpty()) {
            throw new Exception("El campo no puede estar vacío.");
        }

        return texto;
    }

    public static void verCaracterEspecifico() throws Exception {

        int i = Integer.parseInt(JOptionPane.showInputDialog("Teclea la posición que quieres ver"));

        if (){

        }

        if (i > texto.length()) {
            throw new Exception("Esa posición no existe.");
        }

        char letra = texto.charAt(i - 1);

        JOptionPane.showMessageDialog(null, "El carácter específico que quieres ver es: " + letra );

    }





}