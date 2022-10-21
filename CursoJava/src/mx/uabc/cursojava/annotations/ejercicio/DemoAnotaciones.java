package mx.uabc.cursojava.annotations.ejercicio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoAnotaciones {
    public static void main(String args[]) throws Exception {
        List<IAlmacenable> elementos = new ArrayList<>();
        elementos.add(new Almacenamiento1("A1 - Mensaje1"));
        elementos.add(new Almacenamiento1("A1 - Mensaje2"));
        elementos.add(new Almacenamiento1("A1 - Mensaje3"));
        elementos.add(new Almacenamiento2("A2 - Mensaje1"));
        elementos.add(new Almacenamiento2("A2 - Mensaje2"));
        elementos.add(new Almacenamiento2("A2 - Mensaje3"));

        String ruta="";
        for(IAlmacenable ia:elementos) {
            ruta=ia.getClass().getAnnotation(RutaArchivo.class).ruta();
            System.out.println(ruta);
            Path pathFile = Paths.get(ruta);
            Files.write(pathFile, Arrays.asList(ia.mensaje()), StandardOpenOption.APPEND);
        }
    }
}
