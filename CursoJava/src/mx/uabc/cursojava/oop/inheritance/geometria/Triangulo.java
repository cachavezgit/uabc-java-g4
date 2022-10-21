package mx.uabc.cursojava.oop.inheritance.geometria;

public class Triangulo extends FiguraConLados {
    @Override
    public double calcularArea() {
       double temp= super.calcularArea();
       return temp/2;
    }
}
