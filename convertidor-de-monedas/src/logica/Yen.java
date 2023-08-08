package logica;

public class Yen extends Monedas {

    private static double VALORDOLAR = 0.007;
    private static double VALOREURO = 0.0064;
    private static double VALORLIBRA = 0.0055;
    private static double VALORPESO = 0.12;
    private static double VALORWON = 9.17;
    private static double VALORYEN = 1.0;
    private static String NOMBRE = "Yen";

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
