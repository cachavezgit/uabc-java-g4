package mx.uabc.cursojava.annotations.ejercicio;

@RutaArchivo(ruta = "c:\\demo\\almacenamiento1.txt")
public class Almacenamiento1 implements IAlmacenable{
    private String mensaje;

    public Almacenamiento1(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String mensaje() {
        return this.mensaje;
    }
}
