package logica;

import java.util.LinkedList;
import java.util.List;
import Monedas.*;

public class TestMonedas {
    public static void main(String[] args) {

        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        Libra libra = new Libra();
        PesoMX peso = new PesoMX();
        Won won = new Won();
        Yen yen = new Yen();

        yen.setCantidadMonedas(1);
        won.setCantidadMonedas(1);
        peso.setCantidadMonedas(1);
        libra.setCantidadMonedas(1);
        euro.setCantidadMonedas(1);
        dolar.setCantidadMonedas(1);

        List<Monedas> listamonedas = new LinkedList<Monedas>();
        listamonedas.add(dolar);
        listamonedas.add(euro);
        listamonedas.add(libra);
        listamonedas.add(peso);
        listamonedas.add(won);
        listamonedas.add(yen);
        // System.out.println("Cambio de 100 monedas de cada tipo");
        /*
         * String monedaejemplo = "peso";
         * for (Monedas moneda : listamonedas) {
         * for (Monedas mon : listamonedas) {
         * 
         * if (mon != moneda) {
         * mon.setValorMoneda(listamonedas.indexOf(moneda));
         * System.out.println(moneda.getNOMBRE() + " a " + mon.getNOMBRE() + " = " +
         * moneda.calcularCambio(mon));
         * }
         * 
         * }
         * 
         * }
         */
        String selectorMonedaDestino = "Euro";
        String selectorMonedaOrigen = "Dólar";
        Monedas moneda1 = null;
        Monedas moneda2 = null;
        for (Monedas moneda : listamonedas) {
            // System.out.println(moneda.getNOMBRE());
            // System.out.println(moneda.getNOMBRE() == selectorMonedaOrigen);
            // System.out.println(moneda.getNOMBRE() == selectorMonedaDestino);
            if (moneda.getNOMBRE() == selectorMonedaOrigen) {
                moneda1 = moneda;

            }
            if (moneda.getNOMBRE() == selectorMonedaDestino) {
                moneda2 = moneda;

            }
        }
        System.out.println(moneda1.getNOMBRE());
        System.out.println(moneda2.getNOMBRE());
        /*
         * dolar.setValorMoneda(listamonedas.indexOf(won));
         * System.out.println(won.getNOMBRE() + " = " + won.calcularCambio(dolar) + " "
         * + dolar.getNOMBRE());
         */
    }
}
