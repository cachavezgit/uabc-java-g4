package mx.uabc.cursojava.multithreading.sincronizados;

public class Contador {
    long count = 0;

    public synchronized void add(long value){
        this.count+=value;
    }
}
