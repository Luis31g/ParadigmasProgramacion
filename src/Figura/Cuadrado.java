package Figura;

public class Cuadrado extends Figuraaaa {

    private double lado;



    public Cuadrado(double lado) {
        this.lado = lado;

    }
    @Override
    public double calcularArea() {
        double a= lado*lado;
        return a;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado +  ", area=" + calcularArea() +  "perimetro="+calcularPerimetro()+  '}';
    }
}
