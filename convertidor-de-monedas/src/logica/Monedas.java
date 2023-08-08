package logica;

public abstract class Monedas {

    public double cantidadMonedas;
    public double valorMoneda;

    public double calcularCambio(Monedas moneda1, Monedas moneda2) {
        return cantidadMonedas * valorMoneda;
    }
}
