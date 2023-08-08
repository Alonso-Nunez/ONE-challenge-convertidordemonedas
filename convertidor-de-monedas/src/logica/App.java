package logica;

import GUI.Ventanas;

/**
 * * @author Alonso Nuñez
 * 
 * @Alonso-Nunez
 * @version 1
 *          Parte lógica del progama que manda a llamar a las interfaces
 *          generadas en otro paquete
 */

public class App {

    private double cantidadMonedaDestino = 0.0;
    private double cantidadMonedaOrigen = 0.0;
    private double cantidadTemperaturaOrigen = 0.0;
    private double cantidadTemperaturaDestino = 0.0;
    private String monedaACambio = "";
    private String monedaCambiada = "";

    public static void main(String[] args) throws Exception {
        Ventanas mf = new Ventanas();
        Object ob = mf.ventanaInicial();

        String convsel;
        try {
            convsel = ob.toString();
        } catch (NullPointerException exception) {
            convsel = "salida";
        }

        if (convsel == "Convertidor de monedas") {
            System.out.println("monedas");
            // mf.ventanaMonedaOrigen();

        } else if (convsel == "Convertidor de temperatura") {
            System.out.println("temperatura");

        } else {
            System.out.println("salida");

            mf.ventanaCantidadMonedaDestino(12.0, 12.0 * 17, "Peso MX", "Dólar");
        }
        System.out.println(mf.ventanaMonedaOrigen());
        System.out.println(mf.ventanaMonedaDestino());
        System.out.println(mf.ventanaCantidadMonedaOrigen("Peso MX"));
        mf.ventanaCantidadMonedaDestino(12.0, 12.0 * 17, "Dólar", "Peso MX");
        System.out.println(mf.ventanaContinuar());
        System.out.println(mf.ventanaTemperaturaOrigen());
        System.out.println(mf.ventanaCantidadTemperaturaOrigen("celsius"));
        System.out.println(mf.ventanaTemperaturaDestino());
        mf.ventanaCantidadTemperaturaDestino(12.0, 28.0,
                "Celsius", "Kelvin");
    }
}
