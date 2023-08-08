package logica;

public class Dolar extends Monedas {

    private static double VALORDOLAR = 1.0;
    private static double VALOREURO = 0.91;
    private static double VALORLIBRA = 0.78;
    private static double VALORPESO = 17.09;
    private static double VALORWON = 1313.52;
    private static double VALORYEN = 143.11;
    private static String NOMBRE = "Dolar";

    public static String getNOMBRE() {
        return NOMBRE;
    }

    public static double getVALORDOLAR() {
        return VALORDOLAR;
    }

    public static double getVALOREURO() {
        return VALOREURO;
    }

    public static double getVALORLIBRA() {
        return VALORLIBRA;
    }

    public static double getVALORPESO() {
        return VALORPESO;
    }

    public static double getVALORWON() {
        return VALORWON;
    }

    public static double getVALORYEN() {
        return VALORYEN;
    }
}
