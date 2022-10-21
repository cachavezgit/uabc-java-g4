package mx.uabc.cursojava.oop.banco;

public class CuentaBancaria {
    private String numeroDeCuenta="";
    private double saldo=0.0;

    private TipoCuenta tipoDeCuenta;

    private CuentaHabiente titular;

    public CuentaBancaria(String numeroDeCuenta, double saldo, CuentaHabiente titular, TipoCuenta tipo) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.tipoDeCuenta = tipo;
    }

    public TipoCuenta getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(TipoCuenta tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public CuentaHabiente getTitular() {
        return titular;
    }

    public void setTitular(CuentaHabiente titular) {
        this.titular = titular;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double retiro(double cantidad){
        return this.saldo-=cantidad;
    }

    public double deposito(double cantidad) {
        return this.saldo+=cantidad;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", saldo=" + saldo +
                ", tipoDeCuenta=" + tipoDeCuenta +
                ", titular=" + titular +
                '}';
    }
}
