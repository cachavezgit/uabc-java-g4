package mx.uabc.cursojava.exceptions.validaracceso;

public class Acceso {
    private String nombre;
    private String password;

    public Acceso(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Acceso{" +
                "nombre='" + nombre + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
