package mx.uabc.cursojava.oop.interfaces;

import java.util.*;

class Proceso implements Runnable {

    @Override
    public void run() {

    }
}

public class DemoInterfaz {

    public static void main(String[] args){
        IRectangulo[] rectangulos = new Rectangulo[3];

        rectangulos[0] = new Rectangulo(10, 6);
        rectangulos[1] = new Rectangulo(100, 30);
        rectangulos[2] = new Rectangulo(4, 2);

        Arrays.sort(rectangulos, new Comparator<IRectangulo>() {
            @Override
            public int compare(IRectangulo o1, IRectangulo o2) {
                return (int)(o2.calculaArea()-o1.calculaArea());
            }
        });

        for(IRectangulo r:rectangulos) {
            System.out.println(r);
        }

        TarjetaDeCredito tc1 = new TarjetaDeCredito();
        tc1.setSaldo(1000);
        Inversion i1= new Inversion();
        i1.setSaldo(5000);
        Inversion i2= new Inversion();
        i2.setSaldo(15000);

        List<CuentaBancaria> cuentas =new ArrayList<>();
        cuentas.add(tc1);
        cuentas.add(i1);
        cuentas.add(i2);

        imprimeYOrdenaCuentas(cuentas);

    }

    public static void imprimeYOrdenaCuentas(List<CuentaBancaria> lasCuentas){
        CuentaBancariaComparator cuentaBancariaComparator =
                new CuentaBancariaComparator(Orden.ASCENDENTE);
        Collections.sort(lasCuentas, cuentaBancariaComparator);

        for(CuentaBancaria cb:lasCuentas) {
            System.out.println(cb);
        }
    }
}
