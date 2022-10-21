package mx.uabc.cursojava.oop.nestedclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DemoThreads {
    public static void main(String[] args){
        new Thread(new Runnable() {
            @Override
            public void run() {
                // El código que se va a ejecutar en un thread separado.
            }
        }).start();
    }

    public static void demo() {
        new Thread(()->{
            // El código que se va a ejecutar en un thread separado.
        }).start();
    }
}

public class AnonymousNestedClass {
    public static void main(String args[]) {
        List<Rectangulo> rectangulos = new ArrayList<>();

        rectangulos.add(new Rectangulo(120,50));
        rectangulos.add(new Rectangulo(80,50));
        rectangulos.add(new Rectangulo(40,23));

        /*
        Collections.sort(rectangulos, new Comparator<Rectangulo>() {
            @Override
            public int compare(Rectangulo o1, Rectangulo o2) {
                return (int) (o2.getBase()-o1.getBase());
            }
        });
        */

        Collections.sort(rectangulos,(o1, o2)->{
            return (int) (o2.getBase()-o1.getBase());
        });

        System.out.println(rectangulos);
    }
}
