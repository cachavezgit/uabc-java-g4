package mx.uabc.cursojava.multithreading.sincronizados;

public class ContadorTest {
    public static void main(String args[]) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        Thread threadA =new ContadorThread(c1);
        Thread threadB =new ContadorThread(c2);
        Thread threadC =new ContadorThread(c3);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
