package mx.uabc.cursojava.oop.banco.pruebas;

import mx.uabc.cursojava.oop.banco.CuentaBancaria;
import mx.uabc.cursojava.oop.banco.CuentaHabiente;
import mx.uabc.cursojava.oop.banco.NivelCliente;
import mx.uabc.cursojava.oop.banco.TipoCuenta;

public class PruebasBanco {
    public static void main(String[] args) {
        CuentaHabiente ch1 =new CuentaHabiente("Wilson", "Perez Perez", "wilson.perez@gmail.com", NivelCliente.ORO);
        CuentaBancaria cb1 = new CuentaBancaria("444545454", 1000,ch1, TipoCuenta.CREDITO);
        CuentaBancaria cb2 = new CuentaBancaria("3545454554", 5000,ch1, TipoCuenta.INVERSION);

        cb1.deposito(10000);
        cb1.retiro(2000);

        cb2.deposito(20000);

        NivelCliente nivel = NivelCliente.PLATINO;
        TipoCuenta tc = TipoCuenta.CHEQUES;

        System.out.println(cb1.toString());
        System.out.println(cb2.toString());
    }
}
