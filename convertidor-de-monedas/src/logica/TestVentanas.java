package logica;

import GUI.Ventanas;

public class TestVentanas {
    public static void main(String[] args) {
        Ventanas mf = new Ventanas();
        Object ob = mf.ventanaInicial();

        String convsel;

        try {
            convsel = ob.toString();
        } catch (NullPointerException exception) {
            convsel = "salida";
        }

        System.out.println(mf.ventanaMonedaOrigen());
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
