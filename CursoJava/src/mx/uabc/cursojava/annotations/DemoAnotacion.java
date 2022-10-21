package mx.uabc.cursojava.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface DemoAnotacion {
    String nombreProgramador();
    String descripcion();
}
