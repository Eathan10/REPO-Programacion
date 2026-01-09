package Modelo;

public class Circunferencia {

    private double longitudCircunferencia;


    public Circunferencia(double longitudCircunferencia) {
        this.longitudCircunferencia = longitudCircunferencia;
    }

    public Circunferencia() {
    }

    public void calcularCircunferencia(double pi, double radio){

        this.longitudCircunferencia = pi * radio;
          
    }
}
