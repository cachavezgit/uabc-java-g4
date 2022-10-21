package mx.uabc.cursojava.oop.inheritance.pruebas;

import mx.uabc.cursojava.oop.inheritance.Demo;
import mx.uabc.cursojava.oop.inheritance.Flor;
import mx.uabc.cursojava.oop.inheritance.GirasolExotico;

public class PruebaFlores {
    public static void main (String args[]) {

        Flor f1 = new Flor();
        f1.setNombre("Margarita");

        Flor f2 = new Flor();
        f2.setNombre("Geranio");

        GirasolExotico g1 = new GirasolExotico();
        g1.setNombre("Demo herencia");
        g1.demoProtected();
        g1.perseguirAlSol();

        Demo demo = new Demo();

        Object flor = new GirasolExotico();
        ((GirasolExotico)flor).demoProtected();
        ((GirasolExotico)flor).perseguirAlSol();

    }
}
