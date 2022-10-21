package mx.uabc.cursojava.fundamentales;

public class Condicionales {
    public static void main(String[] args) {
        boolean veredicto=false;
        boolean bandera=true;

        if (veredicto) {

        }

        if (veredicto) {
            if (bandera) {

            }
        } else {

        }

        if (veredicto && bandera) { //AND

        }

        if (veredicto || bandera) { //OR

        }

        String mensaje = veredicto?"Se cumple":"No se cumple";

        String mes="marzo";
        String dias = "";
        switch(mes) {
            case "febrero":
                dias = "28 o 29";
                break;
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "octubre":
            case "diciembre":
                dias = "31";
                break;
            case "abril":
            case "junio":
            case "agosto":
            case "noviembre":
                dias = "30";
                break;
            default:
                dias= "No se trata de un mes válido";
                break;
        }
    }
}
