package mx.uabc.cursojava.annotations.ejercicio;

@RutaArchivo(ruta = "c:\\demo\\almacenamiento2.txt")
public class Almacenamiento2 implements IAlmacenable{
    private String mensaje;

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Almacenamiento2(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String mensaje() {
        return this.mensaje;
    }
}
