package logica;

public abstract class Monedas {

    private double valorPesoMX;
    private double valorDolar;
    private double valorEuro;
    private double valorLibra;
    private double valorYen;
    private double valorWon;

    public double getValorDolar() {
        return this.valorDolar;
    }

    public double getValorEuro() {
        return this.valorEuro;
    }

    public double getValorLibra() {
        return this.valorLibra;
    }

    public double getValorPesoMX() {
        return this.valorPesoMX;
    }

    public double getValorWon() {
        return this.valorWon;
    }

    public double getValorYen() {
        return this.valorYen;
    }
}
