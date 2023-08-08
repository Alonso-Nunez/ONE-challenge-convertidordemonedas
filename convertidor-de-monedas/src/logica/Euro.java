package logica;

public class Euro extends Monedas {

    // Equivalencias de las monedas con el euro ( 1 moneda = x euro)
    private static double VALORDOLAR = 0.91; // 1.10;
    private static double VALOREURO = 1.0;
    private static double VALORLIBRA = 1.16; // 0.86;
    private static double VALORPESO = 0.053; // 18.77;
    private static double VALORWON = 0.00069; // 1443.01;
    private static double VALORYEN = 0.0064; // 157.16;
    private static String NOMBRE = "Euro";
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
