package mx.uabc.cursojava.multithreading;

public class MyRunnableUser {
    public static void main(String[] args){
        Runnable tarea = new MyRunnable(10000000);
        Thread hilo = new Thread(tarea);

        hilo.start();

        System.out.println("Despues de iniciar el thread");
    }
}
