package mx.uabc.cursojava.exceptions.validaracceso;

public class PruebaValidacion {
    public static void main(String[] args) {
        try {
            ValidarAcceso.procesarLogin("juan", "password");
        } catch(ValidacionException ex) {
            System.out.println(ex.getMessage());

        } catch(Exception ex) {

        }
        finally {

        }

    }
}
