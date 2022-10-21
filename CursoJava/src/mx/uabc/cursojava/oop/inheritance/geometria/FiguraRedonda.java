package mx.uabc.cursojava.oop.inheritance.geometria;

public abstract class FiguraRedonda extends FiguraGeometrica{
    private double diametro;

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double calcularArea() {
        return Math.PI *Math.pow((this.diametro/2),2);
    }
}
