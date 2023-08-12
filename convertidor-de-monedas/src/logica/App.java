package logica;

import java.util.LinkedList;
import java.util.List;

import GUI.Ventanas;
import Monedas.*;
import Temperaturas.*;

/**
 * * @author Alonso Nuñez
 * 
 * @Alonso-Nunez
 * @version 1
 *          Main App, manda a llamar a todos las clases para hacer funcionar el
 *          programa de forma correcta
 */

public class App {

    public static void main(String[] args) throws Exception {
        /**
         * Delaración de objetos a usar
         */
        // Ventanas
        Ventanas mf = new Ventanas();
        // Monedas
        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        Libra libra = new Libra();
        PesoMX pesoMX = new PesoMX();
        Won won = new Won();
        Yen yen = new Yen();
        // Temperaturas
        Celsius celsius = new Celsius();
        Kelvin kelvin = new Kelvin();
        Fahrenheit fahrenheit = new Fahrenheit();
        // Lista de asistencia
        List<Monedas> listaMonedas = new LinkedList<Monedas>();
        listaMonedas.add(dolar);
        listaMonedas.add(euro);
        listaMonedas.add(libra);
        listaMonedas.add(pesoMX);
        listaMonedas.add(won);
        listaMonedas.add(yen);
        List<Temperaturas> listaTemperaturas = new LinkedList<Temperaturas>();
        listaTemperaturas.add(celsius);
        listaTemperaturas.add(kelvin);
        listaTemperaturas.add(fahrenheit);
        /**
         * Implementación de las ventanas
         */
        int ciclo = 0;
        Object inicio = null;
        String selectorDeConversion;
        while (ciclo == 0) {
            try {
                inicio = mf.ventanaInicial();
                selectorDeConversion = inicio.toString();
                if (selectorDeConversion == "Convertidor de monedas") {
                    String selectorMonedaOrigen = mf.ventanaMonedaOrigen().toString();
                    Double cantidadMonedaOrigen = mf.ventanaCantidadMonedaOrigen(selectorMonedaOrigen);
                    String selectorMonedaDestino = mf.ventanaMonedaDestino().toString();
                    Monedas moneda1 = null;
                    Monedas moneda2 = null;
                    for (Monedas moneda : listaMonedas) {
                        if (moneda.getNOMBRE() == selectorMonedaOrigen) {
                            moneda1 = moneda;
                        }
                        if (moneda.getNOMBRE() == selectorMonedaDestino) {
                            moneda2 = moneda;
                        }
                    }

                    moneda2.setValorMoneda(listaMonedas.indexOf(moneda1));
                    moneda1.setCantidadMonedas(cantidadMonedaOrigen);
                    mf.ventanaCantidadMonedaDestino(cantidadMonedaOrigen, moneda1.calcularCambio(moneda2),
                            selectorMonedaOrigen, selectorMonedaDestino);

                } else if (selectorDeConversion == "Convertidor de temperatura") {
                    String selectorTemperaturaOrigen = mf.ventanaTemperaturaOrigen().toString();
                    Double cantidadTemperaturaOrigen = mf.ventanaCantidadTemperaturaOrigen(selectorTemperaturaOrigen);
                    String selectorTemperaturaDestino = mf.ventanaTemperaturaDestino().toString();
                    Temperaturas temperatura1 = null;
                    Temperaturas temperatura2 = null;
                    for (Temperaturas temperatura : listaTemperaturas) {
                        if (temperatura.getNOMBRE() == selectorTemperaturaOrigen) {
                            temperatura1 = temperatura;
                        }
                        if (temperatura.getNOMBRE() == selectorTemperaturaDestino) {
                            temperatura2 = temperatura;
                        }
                    }
                    mf.ventanaCantidadTemperaturaDestino(cantidadTemperaturaOrigen,
                            temperatura1.calcularCambio(temperatura2), selectorTemperaturaOrigen,
                            selectorTemperaturaDestino);

                }
            } catch (NullPointerException | NumberFormatException ex) {
                if (ex.getMessage().toString().contains("is null")) {
                    if (inicio == null) {
                        System.exit(0);
                    }
                } else if (ex.getMessage().toString().contains("empty")) {
                    mf.ventanaErrores("Campo vacio");
                }

            } finally {
                ciclo = Integer.parseInt(mf.ventanaContinuar().toString());
                if (ciclo == 1) {
                    System.exit(0);
                }
            }
        }

    }

}
