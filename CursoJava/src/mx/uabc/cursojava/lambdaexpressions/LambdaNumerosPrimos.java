package mx.uabc.cursojava.lambdaexpressions;

interface IRevisaNumerosPrimos {
    public boolean esPrimo(long num);
}
public class LambdaNumerosPrimos {
    public static void main(String[] args) {

        IRevisaNumerosPrimos prueba = ((num) -> {
           int vueltas = (int) Math.sqrt(num);
           for(int contador=2;contador<=vueltas;contador++) {
               if (num%contador == 0)
                   return false;
           }
           return true;
        });

        System.out.println(prueba.esPrimo(4));
        System.out.println(prueba.esPrimo(618));
        System.out.println(prueba.esPrimo(1051));
        System.out.println(prueba.esPrimo(1223));

    }
}
