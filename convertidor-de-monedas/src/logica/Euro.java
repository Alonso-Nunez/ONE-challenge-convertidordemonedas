package logica;

public class Euro extends Monedas {

    private static double VALORDOLAR = 1.10;
    private static double VALOREURO = 1.0;
    private static double VALORLIBRA = 0.86;
    private static double VALORPESO = 18.77;
    private static double VALORWON = 1443.01;
    private static double VALORYEN = 157.16;
    private static String NOMBRE = "Euro";

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
