package mx.uabc.cursojava.fundamentales;

import java.util.Arrays;

public class Cadenas {
    public static void main(String[] args){
        String usuario = "Ivan";
        StringBuilder sb= new StringBuilder();
        sb.append("Hola ");
        sb.append(usuario);
        sb.append(" bienvenido al sistema");

        System.out.println(sb);

        StringBuilder commandLine = new StringBuilder();
        for(String arg:args) {
            commandLine.append(String.format("%s ",arg));
        }
        System.out.println(commandLine);
        System.out.println(Arrays.asList(args));

        int datoEntero = 30;
        double datoDoble = 4.56;

        System.out.println(String.format("Los resultados fueron: %d %.3f", datoEntero, datoDoble));

    }
}
