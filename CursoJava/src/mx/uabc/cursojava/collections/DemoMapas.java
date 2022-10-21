package mx.uabc.cursojava.collections;


import mx.uabc.cursojava.oop.interfaces.Rectangulo;

import java.util.HashMap;
import java.util.Map;

public class DemoMapas {
    public static void main(String[] args){
        Map<Integer, Rectangulo> mapaRectangulos = new HashMap<>();

        mapaRectangulos.put(1, new Rectangulo(10, 5));
        mapaRectangulos.put(2, new Rectangulo(120, 60));
        mapaRectangulos.put(3, new Rectangulo(100, 50));
        mapaRectangulos.put(4, new Rectangulo(8, 5));

        Rectangulo elRectangulo = mapaRectangulos.get(3);
        System.out.println(elRectangulo);
        mapaRectangulos.remove(3);

        System.out.println(mapaRectangulos.keySet());

        for(Map.Entry<Integer,Rectangulo> entry:mapaRectangulos.entrySet()) {
            System.out.println(entry);
        }

        mapaRectangulos.entrySet().forEach(entry-> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
    }
}
