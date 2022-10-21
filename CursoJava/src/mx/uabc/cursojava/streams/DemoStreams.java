package mx.uabc.cursojava.streams;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStreams {
    public static void main(String args[]) throws Exception{
        List<String> stringList = List.of("string1", "string2", "string3");
        Stream<String> stringStream = stringList.stream();
        stringStream.filter(s->s.equals("string2")).forEach(s->System.out.println(s));
        System.out.println("------------------------------------");
        List.of("string1", "string2", "string3").stream().forEach(s->System.out.println(s));
        System.out.println("------------------------------------");
        Empleado[] empleados = new Empleado[6];
        empleados[0] = new Empleado(1, "Wilson Perez", 10001);
        empleados[1] = new Empleado(2, "Lucia Manzur", 1001);
        empleados[2] = new Empleado(3, "Antonio Rodriguez", 12001);
        empleados[3] = new Empleado(4, "Marcela Gonzalez", 156001);
        empleados[4] = new Empleado(5, "Luiz Perez", 10501);
        empleados[5] = new Empleado(6, "Rosario Gomez", 9001);

        Set<Empleado> empleadosConAumento =
                Arrays.asList(empleados).stream()
                    .filter(e->e.getSueldo()<10000)
                        .limit(1)
                        .collect(Collectors.toSet());
        System.out.println(empleadosConAumento);
        System.out.println("------------------------------------");
        Empleado e1=Stream.of(empleados)
                .filter(e->e!=null)
                .filter(e->e.getSueldo()>30000)
                .findFirst()
                    .orElse(null);
        System.out.println(e1.getNombre());
        System.out.println("------------------------------------");
        List<String> nombresApellidos=Files.lines(Path.of("C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\streams\\nombres.txt"))
                .flatMap(nombre->Stream.of(nombre.split(" ")))
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        //nombresApellidos.forEach(palabra->System.out.println(palabra));
        nombresApellidos.forEach(System.out::println);

        Map<String,Long> cuentaOcurrencias=
                Files.lines(Path.of("C:\\Users\\cachavez\\curso-java\\CursoJava\\src\\mx\\uabc\\cursojava\\streams\\nombres.txt"))
                .flatMap(nombre->Stream.of(nombre.split(" ")))
                .collect(Collectors.groupingBy(String::toLowerCase, TreeMap::new,Collectors.counting()));

        System.out.println(cuentaOcurrencias);

        cuentaOcurrencias.entrySet()
                .stream()
                .collect(
                        Collectors.groupingBy(entry -> entry.getKey().charAt(0),
                                TreeMap::new, Collectors.toList()))
                .forEach((letter, wordList) ->
                {
                    System.out.printf("%n%C%n", letter);
                    wordList.stream().forEach(word -> System.out.printf(
                            "%13s: %d%n", word.getKey(), word.getValue()));
                });

    }
}

class Empleado {
    private int clave;
    private String nombre;
    private double sueldo;

    public Empleado(int clave, String nombre, double sueldo) {
        this.clave = clave;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void incrementaSueldo(double cantidad) {
        this.sueldo+=cantidad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "clave=" + clave +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}

