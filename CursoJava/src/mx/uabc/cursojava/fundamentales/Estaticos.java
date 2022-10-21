package mx.uabc.cursojava.fundamentales;

class DemoStatic {

    int x;
    int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static int Dato = 10;

    public void noEstatico() {
        System.out.println(calculo(23));
    }

    public static double calculo(int numero) {
        return Math.pow(numero,3);
    }
}

public class Estaticos {
    public static void main(String args[]) {
        System.out.println(DemoStatic.Dato);
        System.out.println(DemoStatic.calculo(20));

        DemoStatic ds = new DemoStatic();
        ds.setY(10);
        ds.setX(20);
    }
}
