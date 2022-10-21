package mx.uabc.cursojava.oop.interfaces;

public abstract class CuentaBancaria {
    private double saldo=0.0;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
