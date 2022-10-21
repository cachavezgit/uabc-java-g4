package mx.uabc.cursojava.oop.interfaces;

public class Rectangulo implements IRectangulo, Comparable<Rectangulo>{
    private double base;

    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + calculaArea() +
                '}';
    }

    public int compareTo(Rectangulo o) {
        return (int)(o.calculaArea()-this.calculaArea());
    }


    @Override
    public double calculaArea() {
        return 0;
    }
}
