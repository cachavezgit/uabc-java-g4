package mx.uabc.cursojava.annotations;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

@DemoAnotacion(nombreProgramador = "Carlos Ivan Chavez Fuentes",
        descripcion = "Demostrar el uso de anotaciones" )
public class UsaAnotaciones {
    public static void main(String args[]) throws Exception{
        Class1 class1 = new Class1();
        Class2 class2 = new Class2();

        Class<?> clazz;

        Scanner scanner = new Scanner(new File("c:\\test.txt"));
        clazz = scanner.getClass();
        for (Method m:clazz.getMethods()) {
            System.out.println(m.getName());
        }

        clazz = class1.getClass();
        if (clazz.isAnnotationPresent(JsonSerializable.class)) {
            System.out.println(String.format("La clase %s es JsonSerializable", clazz.getName()));
        }

        clazz = class2.getClass();
        if (clazz.isAnnotationPresent(JsonSerializable.class)) {
            System.out.println(String.format("La clase %s es JsonSerializable", clazz.getName()));
        }

    }
}
