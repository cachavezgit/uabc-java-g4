package mx.uabc.cursojava.collections;

import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ProcesaPalabrasArchivoUnicas {
    public static void main(String[] args) throws Exception {
        String path="C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\arrays\\Archivo.txt";

        Set<String> palabrasUnicas = new TreeSet<>();

        File f = new File(path);
        Scanner scanner = new Scanner(f);

        while(scanner.hasNextLine()) {
            String[] palabras = scanner.nextLine().trim().split(" ");
            Collections.addAll(palabrasUnicas,palabras);
        }

        scanner.close();

        palabrasUnicas.forEach(pu->System.out.println(pu));

        if (palabrasUnicas.contains("Lorem")) {

        }

        palabrasUnicas.removeIf(palabra->palabra.equals("Lorem"));
    }
}
