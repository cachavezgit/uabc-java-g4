package mx.uabc.cursojava.fundamentales;

public class LeerNumeros {
    public static void main(String[] args) throws Exception {
        System.out.println("Escriba su nombre: ");

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nombre = reader.readLine();


        Scanner scanner= new Scanner(System.in);
        String nombre = scanner.next();
         */
        String nombre = System.console().readLine();

        System.out.println("Bienvenido "+nombre);
    }
}
