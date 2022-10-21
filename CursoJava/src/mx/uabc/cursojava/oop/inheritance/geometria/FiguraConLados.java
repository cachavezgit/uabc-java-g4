package mx.uabc.cursojava.oop.inheritance.geometria;

public abstract class FiguraConLados extends FiguraGeometrica {
    private double base;
    private double altura;
    private double lado;

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

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return base*altura;
    }
}
