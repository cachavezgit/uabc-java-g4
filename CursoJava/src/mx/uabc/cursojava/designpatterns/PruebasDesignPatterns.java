package mx.uabc.cursojava.designpatterns;

public class PruebasDesignPatterns {
    public static void main(String args[]){
        //MatematicoSingleton ms = new MatematicoSingleton();

        // MatematicoSingleton m = MatematicoSingleton.getInstance();
        System.out.println(MatematicoSingleton.getInstance().sumarDosNumeros(23,45));

        Vehicle car1 = VehicleFactory.create(VehicleType.Car);
    }
}
