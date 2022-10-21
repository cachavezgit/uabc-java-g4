package mx.uabc.cursojava.oop.interfaces;

public interface IRectangulo {
    double calculaArea();

    default double otroCalculo(){
        return 0;
    }
}
