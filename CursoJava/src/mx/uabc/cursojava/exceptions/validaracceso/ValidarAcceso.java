package mx.uabc.cursojava.exceptions.validaracceso;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValidarAcceso {
    public static void procesarLogin(String nombre, String password) throws ValidacionException{
        List<Acceso> accesos = procesarArchivoAccesos();

        List<Acceso> existeElNombre=accesos.stream().filter(n->n.getNombre().equals(nombre)).collect(Collectors.toList());
        if (existeElNombre.size()==0)
            throw new UsuarioNotFoundException(String.format("El usuario %s no existe",nombre));


    }
    public static List<Acceso> procesarArchivoAccesos()  {
        try (Stream<String> stream = Files.lines(Path.of("C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\exceptions\\validaracceso\\accesos.txt"))) {
            return stream.peek((line) -> {
                System.out.println(line);
            }).map((line) -> {
                return line.split(",");
            }).peek((arr) -> {
                System.out.println(Arrays.toString(arr));
            }).map((arr) -> {
                return new Acceso(arr[0], arr[1]);
            }).collect(Collectors.toUnmodifiableList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
