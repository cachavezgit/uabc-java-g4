package mx.uabc.cursojava.multithreading.sincronizados;

public class ContadorThread extends Thread{
    protected Contador contador = null;

    public ContadorThread(Contador contador) {
        this.contador = contador;
    }

    public void run() {
        for (int i=0;i<10;i++) {
            contador.add(i);
            System.out.println(contador.count);
        }
    }
}

