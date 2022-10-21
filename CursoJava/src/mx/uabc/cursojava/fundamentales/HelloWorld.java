package mx.uabc.cursojava.fundamentales;

import mx.uabc.cursojava.fundamentales.geometria.Circulo;
import mx.uabc.cursojava.fundamentales.geometria.Triangulo;

public class HelloWorld {
    public static void procesaCirculo (Circulo c) {
        Circulo c1 = new Circulo();
        c1.color = c.color; // Deep Copy Circulo
        c1.color = "rojo";
    }
    public static void hazCalculo (Integer dato) {
        dato++;
        System.out.println("En hazCalculo dato vale: "+dato);
    }
    public static void main(String args[]) {
        System.out.println("Hello World");

        Circulo c1 = new Circulo();
        Triangulo t1 = new Triangulo();

        int dato = 8;

        long maximoValor = Long.MAX_VALUE;

        System.out.println(maximoValor);

        String datoCadena = "365";
        int elDato = Integer.parseInt(datoCadena);
        System.out.println(elDato);

        hazCalculo(elDato);
        System.out.println("De regreso el dato vale: "+elDato);

        Integer otroDato = 1000;
        hazCalculo(otroDato);
        System.out.println("De regreso el otro dato vale: "+otroDato);

        String otroDato2 = "455.33";
        float flotante = Float.parseFloat(otroDato2);
        System.out.println(flotante);

        Circulo circ1=new Circulo();
        circ1.color="verde";
        procesaCirculo(circ1);
        System.out.println(circ1.color);

    }
}
