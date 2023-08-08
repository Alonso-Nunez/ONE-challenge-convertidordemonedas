package logica;

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

    }
}
