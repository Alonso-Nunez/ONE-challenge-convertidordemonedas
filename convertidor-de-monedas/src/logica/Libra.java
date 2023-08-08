package logica;

public class Libra extends Monedas {

    // Equivalencias de las monedas con la libra ( 1 moneda = x libra)
    private static double VALORDOLAR = 0.78; // 1.28;
    private static double VALOREURO = 0.86; // 1.16;
    private static double VALORLIBRA = 1.0;
    private static double VALORPESO = 0.046; // 21.82;
    private static double VALORWON = 0.0006; // 1676.8;
    private static double VALORYEN = 0.0055; // 182.6;
    private static String NOMBRE = "Libra";
    private double valorMoneda;
    private double cantidadMonedas;

    @Override
    public double getCantidadMonedas() {
        return cantidadMonedas;
    }

    @Override
    public double getValorMoneda() {
        return valorMoneda;
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

    @Override
    public double calcularCambio(Monedas moneda2) {
        return this.getCantidadMonedas() * moneda2.getValorMoneda();
    }

}
