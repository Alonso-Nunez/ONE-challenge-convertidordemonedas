package Temperaturas;

public abstract class Temperaturas {

    public abstract String getNOMBRE();

    public abstract double getVALORCELSIUS();

    public abstract double getVALORFARENHEIT();

    public abstract double getVALORKELVIN();

    public abstract double getCantidadTemperatura();

    public abstract void setCantidadTemperatura(double cantidadTemperatura);

    public abstract double calcularCambio(Temperaturas temperatura2);
}
