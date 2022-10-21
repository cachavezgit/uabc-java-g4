package mx.uabc.cursojava.fundamentales;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigDataTypes {
    public static void main(String args[]) {
        long extenso = Long.MAX_VALUE;
        System.out.println(extenso);
        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        bigInteger=bigInteger.add(BigInteger.valueOf(Long.MAX_VALUE));
        bigInteger=bigInteger.add(BigInteger.valueOf(Long.MAX_VALUE));
        System.out.println(bigInteger.toString());
        System.out.println(Math.pow(2, Integer.MAX_VALUE));

        BigDecimal bd = BigDecimal.valueOf(Double.MAX_VALUE);
        System.out.println(bd);
        bd = bd.add(BigDecimal.valueOf(Double.MAX_VALUE));
        System.out.println(bd);


    }
}
