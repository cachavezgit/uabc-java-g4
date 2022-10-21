package mx.uabc.cursojava.oop.inheritance.geometria.pruebas;

import mx.uabc.cursojava.oop.inheritance.geometria.*;

import java.util.ArrayList;
import java.util.List;

public class PruebasGeometria {
    public static void main(String[] args){
        Triangulo t1= new Triangulo();

        Cuadrado c1 = new Cuadrado();

        t1.setBase(10);
        t1.setAltura(18);
        t1.setColor("Rojo");

        c1.setLado(10);
        c1.setColor("Azul");

        Circulo circulo1 = new Circulo();
        circulo1.setDiametro(20);
        circulo1.setColor("amarillo");

        FiguraGeometrica r1 = new Rectangulo();
        ((Rectangulo)r1).setBase(100);
        ((Rectangulo)r1).setAltura(20);


        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(t1);
        figuras.add(c1);
        figuras.add(circulo1);

        for (FiguraGeometrica f:figuras) {
            System.out.println(f.getColor());
            System.out.println(f.calcularArea());
        }

        System.out.println(String.format("El area del rectangulo es: %.2f", ((Rectangulo)r1).calcularArea()));
        System.out.println(String.format("El area del triangulo es: %.2f", t1.calcularArea()));
        System.out.println(String.format("El area del cuadrado es: %.2f", c1.calcularArea()));
        System.out.println(String.format("El area del circulo es: %.2f", circulo1.calcularArea()));

    }
}
