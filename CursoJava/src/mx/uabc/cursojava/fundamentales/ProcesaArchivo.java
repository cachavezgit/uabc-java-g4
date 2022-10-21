package mx.uabc.cursojava.fundamentales;

import java.io.File;
import java.util.Scanner;

public class ProcesaArchivo {
    public static void main(String[] args) throws Exception {
        File fis = new File("C:\\Users\\cachavez\\curso-java\\CursoJava\\Lineas.txt");
        Scanner scanner = new Scanner(fis);

        short longitudGanadora = 0;
        String lineaMasLarga = "";

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            if (linea.length() > 10) {
                System.out.println(linea);
                //lineaMasLarga = (linea.length()>longitudGanadora)?linea:lineaMasLarga;
                //longitudGanadora = (linea.length()>longitudGanadora)?(short)linea.length():longitudGanadora;
                if (linea.length()>longitudGanadora) {
                    lineaMasLarga = linea;
                    longitudGanadora = (short)linea.length();
                }
            }
        }

        scanner.close();

        System.out.println(String.format("La cadena más larga es: %s", lineaMasLarga));

    }
}
