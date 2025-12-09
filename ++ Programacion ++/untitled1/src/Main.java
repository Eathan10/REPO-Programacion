import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {
    public static void main(String[] args) {

        /*  EJERCICIO 3
        int n1 = Integer.parseInt(showInputDialog("Teclea un numero"));

        int n2 = Integer.parseInt(showInputDialog("Teclea un numero"));

        showMessageDialog(null, "El resultado es: " + n1 * n2);
        */

        /* EJERCICIO 4
        int base = Integer.parseInt(showInputDialog("Teclea la base"));

        int altura = Integer.parseInt(showInputDialog("Teclea la altura"));

        base *= 2;
        altura *= 2;


        showMessageDialog(null, "El resultado es: " + (base +  altura) );
        */


        /* EJERCICIO 5
        double radio = Integer.parseInt(showInputDialog("Teclea un radio"));

        double circunferencia = Math.PI * radio * radio;

        showMessageDialog(null, "Su circunferencia es: " +  circunferencia);
         */



        /* EJERCICIO 6

        int nota = Integer.parseInt(JOptionPane.showInputDialog("Teclea una nota"));

        if (nota >= 5) {
            showMessageDialog(null, "Aprovado");
        } else {
            showMessageDialog(null, "No aprovado");
        }
         */


        /* EJERCICIO 7
        int nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Nota: "));

        if (nota < 5) {
            if (nota == 4 || nota == 3) {
                JOptionPane.showMessageDialog(null, "Insuficiente");
            }  else {
                JOptionPane.showMessageDialog(null, "Muy insuficiente");
            }
        }else if (nota == 5) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        } else if (nota == 6 || nota == 7) {
            JOptionPane.showMessageDialog(null, "Bien");
        }  else if (nota == 8 || nota == 9) {
            JOptionPane.showMessageDialog(null, "Notable");
        } else {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }
         */


        /* EJERCICIO 8
        int numeroSemana = Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de la semana: "));

        switch (numeroSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles");
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves");
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "Viernes");
            break;
            case 6:
                JOptionPane.showMessageDialog(null, "Sabado");
            break;
            case 7:
                JOptionPane.showMessageDialog(null, "Domingo");
            break;

        }
         */


        /* EJERCICIO 9
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("Numero 3: "));

        JOptionPane.showMessageDialog(null, "Numero mas pequeño: " + numeroMenor(n1, n2, n3) +
                "\n Numero mas grandre: " + numeroMayor(n1, n2, n3));

         */

        /* EJERCICIO 10

        int consumo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un consumo"));

        double importe = (consumo <= 300)?consumo*0.04
                        :(consumo <= 500)?consumo*0.03
                        :(consumo >= 800)?((consumo-300)*0.02) + (300 * 0.03)
                        :((consumo-300)*0.02+300*0.03)*0.9875;

        JOptionPane.showMessageDialog(null, "Importe a pagar: " + importe);

         */


        /*EJERCICIO 11
        int chicosApt = 0;
        int chicasApt = 0;


        for (int i = 0; i < 30;i++){

            JOptionPane.showMessageDialog(null, "Datos del deportista numero: " + (i + 1));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese peso: "));
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad: "));
            String nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
            String sexo = JOptionPane.showInputDialog("Ingrese sexo: ");
            Double estatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese estatura: "));

            if (sexo.equals("hombre")){
                if (estatura > 1.70 && peso > 70){
                    chicosApt++;
                }
            } else {
                if (estatura > 1.60 && peso > 60){
                    chicasApt++;
                }
            }
        }

        JOptionPane.showMessageDialog(null,"Niños aptos" + chicosApt + "\nNiñas Aptas: " +  chicasApt);

         */


        /* EJERCICIO 12
        String continuar;
        int contadorAprobados = 0;

        do {
            double nota = Integer.parseInt(showInputDialog("Ingrese Nota: "));

            if(nota >= 6) {
                contadorAprobados++;
            }

            continuar = showInputDialog("¿Quieres continuar?");

        }while (continuar.equalsIgnoreCase("si"));

        JOptionPane.showMessageDialog(null,"Numero de aprobados: " +  contadorAprobados);

         */


        /* EJERCICIO 13
        double promedioEdades = 0;
        String continuar = "";
        int i = 0;

        do {
            promedioEdades += Integer.parseInt(showInputDialog("Teclea edad del estudiante" ));
            i++;
            continuar = JOptionPane.showInputDialog("¿Hay mas alumnos?");
        }while (continuar.equalsIgnoreCase("si"));

        JOptionPane.showMessageDialog(null, "El promedio de edades es: " + (promedioEdades / i));
         */

        /* EJERCICIO 14
        double notaMayor = 0;
        String nombreMayor = "";

        double notaMenor = 11;
        String nombreMenor = "";

        for (int i = 0 ;i < 10; i++){
            String nombre = JOptionPane.showInputDialog("Nombre del estudiante "+(i+1));
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota del estudiante "+(i+1)));

            if (nota < notaMenor){
                notaMenor = nota;
                nombreMenor = nombre;
            }
            if (nota > notaMayor){
                notaMayor = nota;
                nombreMayor = nombre;
            }
        }
        showMessageDialog(null, nombreMayor + "tiene la nota mas alta, teniendo " + notaMayor + "como nota.\n" +
                                                       nombreMenor + "tiene la nota mas baja, teniendo " + notaMenor + "como nota.");
         */


        /* EJERCICIO 15
        int num1 = 1;
        int num2 = 1;
        int auxNum1 = 0;

        int posicion = Integer.parseInt(showInputDialog("Numero de la posicion de la serie de Fibonacci:"));

        if (posicion == 1 || posicion == 2) {

            showMessageDialog(null,"Numero de Fibonacci: " + 1);

        } else {

            posicion = posicion - 2;

            for (int i = 1; i <= posicion ; i++) {

                auxNum1 = num1 + num2;
                num1 = num2;
                num2 = auxNum1;

            }

            showMessageDialog(null,"Numero de Fibonacci: " + auxNum1);

        }
         */


        /* EJERCICIO 16
        int numIntro = Integer.parseInt(showInputDialog("Ingrese el numero"));

        int suma = 0;
        int inpar = 1;
        int contador = 0;

        while (contador < numIntro) {
            suma += inpar;
            inpar += 2;
            contador++;
        }

        JOptionPane.showMessageDialog(null, "El cuadrado de " + numIntro + " es: " + suma);


         */


        /* EJERCICIO 17
        int base = Integer.parseInt(showInputDialog( "Ingrese la base: "));
        int exp = Integer.parseInt(showInputDialog( "Ingrese el exponente: "));

        int resultado = base;

        for (int i = 2; i <= exp; i++) {
            resultado *= base;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        */

        /* EJERCICIO 18
        int c;

        int numAleatorio = (int) (Math.random()*101);

        do {

            int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero entre el 0 - 100"));
            if (numUsuario == numAleatorio) {
                JOptionPane.showMessageDialog(null, "Enhorabuena, has adivinado correctamente");
                c = 1;
            } else if (numUsuario < numAleatorio) {
                JOptionPane.showMessageDialog(null, "Error. Intenta un numero mas grande");
                c = JOptionPane.showConfirmDialog(null,"¿Quieres continuar?");
            } else {
                JOptionPane.showMessageDialog(null, "Error. Intenta un numero mas pequeño");
                c = JOptionPane.showConfirmDialog(null,"¿Quieres continuar?");
            }

        }while ( c == 0);

        */

         /* EJERCICIO 19

        int numUsuario = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero para ver si es primo."));

        if (numUsuario <= 1) {
            JOptionPane.showMessageDialog(null, "El numero " + numUsuario + " no es primo");
        } else if (numUsuario == 2) {
            JOptionPane.showMessageDialog(null, "El numero " + numUsuario + " es primo");
        }else  if (numUsuario % 2 != 0){
            JOptionPane.showMessageDialog(null, "El numero " + numUsuario + " es primo");
        } else  {
            JOptionPane.showMessageDialog(null, "El numero " + numUsuario + " no es primo");
        }

          */



        /*EJERCICIO 20

         */

        int numUsuarioPara = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        StringBuilder numerosPrimos = new StringBuilder();
        int contador = 0;

        do {

            if (numUsuarioPara == 2) {
                numerosPrimos.append(numUsuarioPara).append(" \n");
            }else  if (numUsuarioPara % 2 != 0 || numUsuarioPara % 3 == 0) {
                numerosPrimos.append(numUsuarioPara).append(" \n");
            }
            numUsuarioPara--;

        }while (numUsuarioPara > 1);

        JOptionPane.showMessageDialog(null, numerosPrimos);



        for (int i = 1; i <= numUsuarioPara; i++){

            if (numUsuarioPara % i == 0){
                contador++;
            }

        }

    }




    public static int numeroMayor (int n1, int n2, int n3){
        if (n1 > n2 && n1 > n3){
            return n1;
        } else if(n2 > n1 && n2 > n3){
            return n2;
        } else {
            return n3;
        }
    }

    public static int numeroMenor (int n1, int n2, int n3){
        if (n1 < n2 && n1 < n3){
            return n1;
        } else if(n2 < n1 && n2 < n3){
            return n2;
        } else {
            return n3;
        }
    }

}

















