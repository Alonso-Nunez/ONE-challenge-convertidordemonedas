package logica;

public abstract class Monedas {

    public abstract double calcularCambio(Monedas moneda2);

    public abstract void setValorMoneda(int numeroMoneda);

    public abstract void setCantidadMonedas(double cantidadMonedas);

    public abstract double getCantidadMonedas();

    public abstract double getValorMoneda();

    public abstract String getNOMBRE();

    public abstract double getVALORDOLAR();

    public abstract double getVALOREURO();

    public abstract double getVALORLIBRA();

    public abstract double getVALORPESO();

    public abstract double getVALORWON();

    public abstract double getVALORYEN();
}
