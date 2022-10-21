package mx.uabc.cursojava.oop.banco;

public class CuentaHabiente {
    private String nombre;

    private String apellidos;

    private String email;
    private NivelCliente nivelDelCliente;

    public CuentaHabiente() {

    }

    public CuentaHabiente(String nombre, String apellidos, String email, NivelCliente nivel) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.nivelDelCliente = nivel;
    }

    public NivelCliente getNivelDelCliente() {
        return nivelDelCliente;
    }

    public void setNivelDelCliente(NivelCliente nivelDelCliente) {
        this.nivelDelCliente = nivelDelCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "CuentaHabiente{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", nivelDelCliente=" + nivelDelCliente +
                '}';
    }
}
