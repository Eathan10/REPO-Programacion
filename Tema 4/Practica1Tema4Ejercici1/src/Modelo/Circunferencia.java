package Modelo;

public class Circunferencia {

    private double longitud;
    private double area;
    private double volumen;


    private final double PI = Math.PI;

    public void calcularTodo(double radio) {
        this.longitud = 2 * PI * radio;
        this.area = PI * Math.pow(radio, 2);
        this.volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3);
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getPI() {
        return PI;
    }
}