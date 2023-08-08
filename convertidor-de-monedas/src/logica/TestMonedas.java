package logica;

import java.util.LinkedList;
import java.util.List;

public class TestMonedas {
    public static void main(String[] args) {

        Dolar dolar = new Dolar();
        Euro euro = new Euro();
        Libra libra = new Libra();
        PesoMX peso = new PesoMX();
        Won won = new Won();
        Yen yen = new Yen();

        yen.setCantidadMonedas(100);
        won.setCantidadMonedas(100);
        peso.setCantidadMonedas(100);
        libra.setCantidadMonedas(100);
        euro.setCantidadMonedas(100);
        dolar.setCantidadMonedas(100);

        List<Monedas> monedas = new LinkedList<Monedas>();
        monedas.add(dolar);
        monedas.add(euro);
        monedas.add(libra);
        monedas.add(peso);
        monedas.add(won);
        monedas.add(yen);

    }
}
