package mx.uabc.cursojava.multithreading;

public class MyRunnable implements Runnable{
    private final long contador;

    public MyRunnable(long contador) {
        this.contador = contador;
    }

    @Override
    public void run() {
        long suma = 0;
        for (long i=0;i<contador;i++) {
            suma+=i;
            System.out.println(suma);
        }
    }
}
