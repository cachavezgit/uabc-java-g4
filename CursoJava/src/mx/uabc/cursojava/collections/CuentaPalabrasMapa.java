package mx.uabc.cursojava.collections;

import java.io.File;
import java.util.*;

public class CuentaPalabrasMapa {
    public static void main(String args[]) throws  Exception{
        String path="C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\arrays\\Archivo.txt";

        Map<String,Integer> mapaCuentaPalabras=new TreeMap<>();

        File f = new File(path);
        Scanner scanner = new Scanner(f);

        while(scanner.hasNextLine()) {
            Arrays.asList( scanner.nextLine().trim().split(" ")).
                    forEach(p -> {
                        if (mapaCuentaPalabras.containsKey(p)) {
                            Integer repeticiones=mapaCuentaPalabras.get(p);
                            mapaCuentaPalabras.put(p,++repeticiones);
                        } else {
                            mapaCuentaPalabras.put(p,1);
                        }
                    });
        }
        mapaCuentaPalabras.entrySet().forEach(entry->System.out.println(entry));

        // Estilo clásico
        Iterator<Map.Entry<String, Integer>> iterator = mapaCuentaPalabras.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry =iterator.next();
            System.out.println(entry);
        }


    }
}
