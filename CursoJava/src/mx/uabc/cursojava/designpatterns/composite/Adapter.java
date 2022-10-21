package mx.uabc.cursojava.designpatterns.composite;

import java.io.*;
import java.util.Scanner;

public class Adapter {
    public static void main (String[] args) throws Exception{
        String path="C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\arrays\\Archivo.txt";

        InputStream inputStream = new FileInputStream(path);
        InputStreamReader isr = new InputStreamReader(inputStream);

        Scanner scanner = new Scanner(isr);

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println(linea);
        }


    }
}
