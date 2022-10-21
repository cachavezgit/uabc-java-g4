package mx.uabc.cursojava.oop.inheritance;

public class Flor {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected void fotoSintesis() {
        System.out.println("Realizando la función de fotosintesis");
    }
}
