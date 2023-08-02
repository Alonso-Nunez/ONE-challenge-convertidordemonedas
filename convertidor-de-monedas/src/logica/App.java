package logica;

import GUI.Ventanas;

public class App {
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
            mf.ventanaMonedaOrigen();

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
    }
}
