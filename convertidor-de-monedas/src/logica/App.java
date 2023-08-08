package logica;

import GUI.Ventanas;
import Monedas.*;

/**
 * * @author Alonso Nuñez
 * 
 * @Alonso-Nunez
 * @version 1
 *          Parte lógica del progama que manda a llamar a las interfaces
 *          generadas en otro paquete
 */

public class App {

    public static void main(String[] args) throws Exception {
        Ventanas mf = new Ventanas();
        Object ob = mf.ventanaInicial();

    }
}
