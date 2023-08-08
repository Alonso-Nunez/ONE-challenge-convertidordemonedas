package Temperaturas;

public class Kelvin extends Temperaturas {

    private static String NOMBRE = "Kelvin";
    private static double VALORCELSIUS = 1.0;
    private static double VALORKELVIN = 0.0;
    private static double VALORFARENHEIT = 0.0;
    private double cantidadTemperatura;

    @Override
    public String getNOMBRE() {
        return NOMBRE;
    }

    @Override
    public double getVALORCELSIUS() {
        return VALORCELSIUS;
    }

    @Override
    public double getVALORFARENHEIT() {
        return VALORFARENHEIT;
    }

    @Override
    public double getVALORKELVIN() {
        return VALORKELVIN;
    }

    @Override
    public double getCantidadTemperatura() {
        return cantidadTemperatura;
    }

    @Override
    public void setCantidadTemperatura(double cantidadTemperatura) {
        this.cantidadTemperatura = cantidadTemperatura;
    }

    @Override
    public double calcularCambio(Temperaturas temperatura2) {
        if (temperatura2.getNOMBRE() == "Fahrenheit") {

            return (((this.cantidadTemperatura - 273.15) * 9 / 5) + 32);

        } else if (temperatura2.getNOMBRE() == "Celsius") {

            return this.cantidadTemperatura - 273.15;

        } else {
            return VALORKELVIN;
        }
    }

}
