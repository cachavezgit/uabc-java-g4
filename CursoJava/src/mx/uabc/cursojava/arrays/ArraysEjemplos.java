package mx.uabc.cursojava.arrays;

import java.util.Arrays;

public class ArraysEjemplos {
    public static void main (String args[]){
        String tablaCadenas[] = new String[]{"cadena 1", "cadena 2", "cadena 3", "cadena 4"};

        tablaCadenas[3] = "Nuevo";

        Arrays.sort(tablaCadenas);

        for(String s:tablaCadenas) {
            System.out.println(s);
        }

        Integer[] numeros = new Integer[10];

        for(int i=0;i<numeros.length;i++) {
            numeros[i] = (int)(Math.random()*(10-1)+1);
        }

        for(int n:numeros) {
            System.out.println(n);
        }

        //forEach aplica para colecciones
        Arrays.asList(numeros).forEach(num->System.out.println(num));


    }
}
