package GUI;

import javax.swing.*;

public class Ventanas extends JFrame {

    // Object[] monedas = {"Peso MX", "Dólar", "Euro", "Libra", "Yen", "Won"};

    public Object ventanaInicial() {

        Object[] tipoDeConversion = { "Convertidor de monedas", "Convertidor de temperatura" };

        return JOptionPane.showInputDialog(null,
                "Seleccione la opción de conversión", "Convertidor",
                JOptionPane.INFORMATION_MESSAGE, null,
                tipoDeConversion, tipoDeConversion[0]);
    }

    public Object ventanaMonedaOrigen() {
        Object[] monedas = { "Peso MX", "Dólar", "Euro", "Libra", "Yen", "Won" };

        return JOptionPane.showInputDialog(null,
                "Selecciona la moneda a la que se desea convertir", "Monedas",
                JOptionPane.INFORMATION_MESSAGE, null,
                monedas, monedas[0]);
    }

    public Double ventanaCantidadMonedaOrigen(String monedaOrigen) {
        return Double.valueOf(JOptionPane.showInputDialog(null,
                "Ingrese la cantidad a convertir (" + monedaOrigen + ")",
                "Cantidad a convertir", JOptionPane.QUESTION_MESSAGE));
    }

    public Object ventanaMonedaDestino() {
        Object[] monedaDestino = { "Dolar", "Euro", "Libra", "Yen", "Won" };

        return JOptionPane.showInputDialog(null,
                "Selecciona la moneda a convertir", "Monedas",
                JOptionPane.INFORMATION_MESSAGE, null,
                monedaDestino, monedaDestino[0]);

    }

    public void ventanaCantidadMonedaDestino(Double cantidadSinConvertir, Double cantidadConvertida,
            String monedaOrigen, String monedaDestino) {
        JOptionPane.showMessageDialog(rootPane,
                "Se convirtieron " + cantidadSinConvertir + " " + monedaOrigen + " a " + cantidadConvertida.toString()
                        + " " + monedaDestino,
                "Operación exitosa",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
