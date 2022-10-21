package mx.uabc.cursojava.oop.interfaces;

import java.util.Comparator;

enum Orden {
    ASCENDENTE,
    DESCENDENTE
}
public class CuentaBancariaComparator implements Comparator<CuentaBancaria> {
    private Orden orden;

    public CuentaBancariaComparator(Orden orden) {
        this.orden = orden;
    }

    @Override
    public int compare(CuentaBancaria o1, CuentaBancaria o2) {
        return this.orden == Orden.ASCENDENTE?
                (int) (o1.getSaldo() - o2.getSaldo()):(int) (o2.getSaldo() - o1.getSaldo());
    }
}
