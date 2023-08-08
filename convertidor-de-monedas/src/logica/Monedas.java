package logica;

public abstract class Monedas {

    private double cantidadMonedas;
    private double valorMoneda;

    public double calcularCambio(Monedas moneda1, Monedas moneda2) {
        return moneda1.getCantidadMonedas() * moneda2.getValorMoneda();
    }

    public void setValorMoneda(double valorMoneda) {
        this.valorMoneda = valorMoneda;
    }

    public void setCantidadMonedas(double cantidadMonedas) {
        this.cantidadMonedas = cantidadMonedas;
    }

    public double getCantidadMonedas() {
        return cantidadMonedas;
    }

    public double getValorMoneda() {
        return valorMoneda;
    }
}
