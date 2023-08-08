package logica;

import java.util.LinkedList;
import java.util.List;

import Temperaturas.*;

public class TestTemperaturas {

    public static void main(String[] args) {
        Celsius cel = new Celsius();
        Kelvin kel = new Kelvin();
        Fahrenheit fah = new Fahrenheit();

        cel.setCantidadTemperatura(1);
        kel.setCantidadTemperatura(1);
        fah.setCantidadTemperatura(1);

        List<Temperaturas> listaTemperaturas = new LinkedList<Temperaturas>();
        listaTemperaturas.add(cel);
        listaTemperaturas.add(kel);
        listaTemperaturas.add(fah);

        for (Temperaturas temp1 : listaTemperaturas) {
            for (Temperaturas temp2 : listaTemperaturas) {
                if (temp1 != temp2) {
                    System.out
                            .println(temp1.getNOMBRE() + " = " + temp1.calcularCambio(temp2) + " " + temp2.getNOMBRE());
                }
            }
        }
    }

}
