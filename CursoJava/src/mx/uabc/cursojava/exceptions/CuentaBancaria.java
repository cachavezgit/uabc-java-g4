package mx.uabc.cursojava.exceptions;

public class CuentaBancaria {
    double saldo;

    double lineaDeSobregiro;

    public CuentaBancaria(double saldo, double lineaDeSobregiro) {
        this.saldo = saldo;
        this.lineaDeSobregiro = lineaDeSobregiro;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLineaDeSobregiro() {
        return lineaDeSobregiro;
    }

    public void setLineaDeSobregiro(double lineaDeSobregiro) {
        this.lineaDeSobregiro = lineaDeSobregiro;
    }

    public void disposicionDeFondos(double cantidad) throws SobregiroException {
        this.saldo-=cantidad;
        double posibleSobregiro = (this.saldo+lineaDeSobregiro);
        if (posibleSobregiro<0) {
            String mensaje = String.format("La cuenta se sobregiro en %.2f", posibleSobregiro);
            throw new SobregiroException(mensaje);
        }

    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", lineaDeSobregiro=" + lineaDeSobregiro +
                '}';
    }
}
