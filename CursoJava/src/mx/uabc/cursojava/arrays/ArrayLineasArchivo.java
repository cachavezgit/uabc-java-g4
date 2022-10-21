package mx.uabc.cursojava.arrays;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayLineasArchivo {
    public static void main(String[] args) throws Exception{
        String path="C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\arrays\\Archivo.txt";
        String[] lineas = new String[100];

        File f = new File(path);
        Scanner scanner = new Scanner(f);

        int inicio=0;
        while(scanner.hasNextLine()) {
            lineas[inicio++] = scanner.nextLine().trim();
        }

        Arrays.sort(lineas, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1 !=null && o2!=null) {
                    return o1.compareTo(o2);
                }
                return (o1==o2)?0:(o1==null?1:-1);
            }
        });

        Arrays.sort(lineas, Comparator.nullsLast(Comparator.naturalOrder()));

        for(String linea:lineas) {
            if (linea!=null)
                System.out.println(linea);
        }



    }
}
