package mx.uabc.cursojava.exceptions;

public class EjemploBancoExceptions {
    public static void main(String args[])  {
        CuentaBancaria cb1 = new CuentaBancaria(10000,2000);
        try {
            cb1.disposicionDeFondos(12001);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
