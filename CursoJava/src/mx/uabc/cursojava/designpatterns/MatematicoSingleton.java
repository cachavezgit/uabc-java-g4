package mx.uabc.cursojava.designpatterns;

public class MatematicoSingleton {
    private static MatematicoSingleton instance;

    private MatematicoSingleton () {

    }

    public static MatematicoSingleton getInstance() {
        if (instance == null) {
            instance= new MatematicoSingleton();
        }
        return instance;
    }

    public double sumarDosNumeros(int x, int y ) {
        return x+y;
    }
}
