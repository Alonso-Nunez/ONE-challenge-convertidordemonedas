package Monedas;

/**
 * @author @Alonso-Nunez
 * @version 1
 *          Clase para definición de métodos y atributos del Peso MX, moneda de
 *          uso
 */
public class PesoMX extends Monedas {

    // Equivalencias de las monedas con el peso ( 1 moneda = x peso)
    private static double VALORDOLAR = 17.09; // 0.058;
    private static double VALOREURO = 18.77; // 0.053;
    private static double VALORLIBRA = 21.82; // 0.046;
    private static double VALORPESO = 1.0;
    private static double VALORWON = 0.013; // 76.91;
    private static double VALORYEN = 0.12; // 8.37;
    private static String NOMBRE = "Peso MX";
    private double valorMoneda;
    private double cantidadMonedas;

    @Override
    public double getCantidadMonedas() {
        return this.cantidadMonedas;
    }

    @Override
    public double getValorMoneda() {
        return this.valorMoneda;
    }

    @Override
    public String getNOMBRE() {
        return NOMBRE;
    }

    @Override
    public double getVALORDOLAR() {
        return VALORDOLAR;
    }

    @Override
    public double getVALOREURO() {
        return VALOREURO;
    }

    @Override
    public double getVALORLIBRA() {
        return VALORLIBRA;
    }

    @Override
    public double getVALORPESO() {
        return VALORPESO;
    }

    @Override
    public double getVALORWON() {
        return VALORWON;
    }

    @Override
    public double getVALORYEN() {
        return VALORYEN;
    }

    /**
     * @param numeroMoneda dato de tipo int referente a una moneda
     *                     Método que asigna el valor de conversión a usar
     */
    @Override
    public void setValorMoneda(int numeroMoneda) {
        switch (numeroMoneda) {
            case 0:
                this.valorMoneda = VALORDOLAR;
                break;
            case 1:
                this.valorMoneda = VALOREURO;
                break;
            case 2:
                this.valorMoneda = VALORLIBRA;
                break;
            case 3:
                this.valorMoneda = VALORPESO;
                break;
            case 4:
                this.valorMoneda = VALORWON;
                break;
            case 5:
                this.valorMoneda = VALORYEN;
                break;
            default:
                break;
        }

    }

    @Override
    public void setCantidadMonedas(double cantidadMonedas) {
        this.cantidadMonedas = cantidadMonedas;
    }

    /**
     * @param Moneda_a_convertir
     * @return valor de la conversión
     */
    @Override
    public double calcularCambio(Monedas moneda2) {
        return this.getCantidadMonedas() * moneda2.getValorMoneda();
    }
}
