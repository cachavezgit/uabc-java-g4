package mx.uabc.cursojava.designpatterns;

import java.util.*;

public class DemoIterator {
    public static void main(String args[]) {
        Set<String> cadenas = new TreeSet<>();
        cadenas.add("uno");
        cadenas.add("dos");
        cadenas.add("tres");

        List<String> mensajes = new LinkedList<>();
        mensajes.add("Mensaje1");
        mensajes.add("Mensaje2");
        mensajes.add("Mensaje3");

        Iterator it = cadenas.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        it = mensajes.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
