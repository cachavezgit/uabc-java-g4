package mx.uabc.cursojava.collections;

import java.util.*;

public class DemoConjuntos {
    public static void main (String args[]) {
        Set<String> nombres = new LinkedHashSet<>();

        nombres.add("Maria");
        nombres.add("Luis");
        nombres.add("Maria");
        nombres.add("Pedro");
        nombres.add("Maria");

        nombres.forEach(n->System.out.println(n));

        Integer[] numeros = new Integer[]{9,3,9,12,34,78,9,1,10,34};

        Set<Integer> conjuntoNumeros = new TreeSet<>();
        Collections.addAll(conjuntoNumeros, numeros);

        conjuntoNumeros.forEach(num->System.out.println(num));

        NavigableSet<Integer> treeSetDesc = ((TreeSet)conjuntoNumeros).descendingSet();
        treeSetDesc.forEach(num->System.out.println(num));

        //((TreeSet)conjuntoNumeros).descendingSet().forEach();

    }
}
