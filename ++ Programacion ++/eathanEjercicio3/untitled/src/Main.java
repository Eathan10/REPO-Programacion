import javax.swing.*;

void main() {

    boolean salir;


    do {
        salir = false;
        try {

            String menu = validarDato("Opcion","Menu" + "\n a) Calcular edad" + "\n b) numeros pares y primos" + "\n c) Palíndromo" +"\n d) salir", "[abcdABCD]");

            switch (menu.toUpperCase()) {
                case "A":
                    calcularEdad();
                    break;
                case "B":
                    numerosParesYPrimos();
                    break;
                case "C":
                    comprobarPalindromo();
                    break;
                case "D":
                    JOptionPane.showMessageDialog(null,"Saliendo del programa...");
                    salir = true;
                    break;
            }




        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage() + e.getClass());
        }

    } while (!salir);


}

public static void comprobarPalindromo() {

    String texto = JOptionPane.showInputDialog("Introduce una palabra");

    StringBuilder sb = new StringBuilder(texto);
    sb.reverse();
    String invertido = sb.toString();

    if (texto.equals(invertido)) {
        System.out.println(texto + " es un palíndromo.");
    } else {
        System.out.println(texto + " no es un palíndromo.");
    }
}

public static void numerosParesYPrimos() {

    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número:"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número:"));

    if (num1 > num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    JOptionPane.showMessageDialog(null,"Números entre " + num1 + " y " + num2 + ":");

    for (int i = num1; i <= num2; i++) {
        if (i % 2 == 0) {
            System.out.println(i + " es par.");
        } else {
            if (esPrimo(i)) {
                System.out.println(i + " es impar y primo.");
            } else {
                System.out.println(i + " es impar y no es primo.");
            }
        }
    }
}

private static boolean esPrimo(int n) {
    if (n <= 1) return false;
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) return false;
    }
    return true;
}

public static void calcularEdad() {

    String fechaTexto = JOptionPane.showInputDialog("Introduce tu fecha de nacimiento(formato YYYY-MM-DD): ");

    LocalDate fechaNacimiento = LocalDate.parse(fechaTexto);
    LocalDate hoy = LocalDate.now();

    Period edad = Period.between(fechaNacimiento, hoy);
    JOptionPane.showMessageDialog(null,"Tienes " + edad.getYears() + " años.");



    LocalDate proximoCumple = fechaNacimiento.withYear(hoy.getYear());
    if (proximoCumple.isBefore(hoy) || proximoCumple.isEqual(hoy)) {
        proximoCumple = proximoCumple.plusYears(1);
    }

    long diasFaltan = ChronoUnit.DAYS.between(hoy, proximoCumple);
    JOptionPane.showMessageDialog(null,"Faltan " + diasFaltan + " días para tu próximo cumpleaños.");
}


public String validarDato(String dato, String mensaje, String exprecionRegular){

    String var="";
    boolean error;
    do {
        try {
            var = JOptionPane.showInputDialog(mensaje);

            if(var.isEmpty()) {
                throw new DatoNoValido(dato + " no puede estar vacio");
            }


            Pattern pat=Pattern.compile(exprecionRegular);
            Matcher mat=pat.matcher(var);

            if (!mat.matches())
                throw new DatoNoValido(dato + "no tiene un formato adecuado");

            error=false;
        }catch (DatoNoValido e){
            error=true;
            JOptionPane.showMessageDialog(null, e);
        }

    }while (error);
    return var;

}
