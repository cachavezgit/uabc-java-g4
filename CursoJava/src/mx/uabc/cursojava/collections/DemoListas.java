package mx.uabc.cursojava.collections;

import java.util.*;

public class DemoListas {
    public static void main(String[] args){
        String tablaCadenas[] = new String[]{"cadena 1", "cadena 2", "cadena 3", "cadena 4"};

        List<String> cadenas = Arrays.asList(tablaCadenas); //Devuelve una lista de longitud fija
                                                            // no permite ni agregar ni eliminar
                                                            // elementos
        List<String> cadenas3 = new ArrayList<>();
        Collections.addAll(cadenas3, tablaCadenas);

        cadenas3.add("cadena 5");
        cadenas3.remove(2);

        System.out.println(cadenas.get(3));
        System.out.println(cadenas.indexOf("cadena 2"));

        List<String> cadenas2 = new LinkedList<>();
        cadenas2.add("test");
        cadenas2.add("wilson");

        cadenas2.forEach(s->System.out.println((s)));
    }
}
