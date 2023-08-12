package GUI;

import javax.swing.*;

/**
 * @author Alonso Nuñez
 * @Alonso-Nunez
 * @version 1
 *          Parte Gráfica del programa, en este documento se encuentran todas
 *          las ventanas utilizadas a lo largo de la ejecución del programa
 */
public class Ventanas extends JFrame {

	/**
	 * Ventana inicial que permite seleccionar el tipo de conversion a utilizar
	 * 
	 * @return Objeto, posibilidades: texto con la seleccion de convertidor u Objeto
	 *         Null
	 */
	public Object ventanaInicial() {
		Object[] tipoDeConversion = { "Convertidor de monedas", "Convertidor de temperatura" };

		return JOptionPane.showInputDialog(null,
				"Seleccione la opción de conversión", "Convertidor",
				JOptionPane.INFORMATION_MESSAGE, null,
				tipoDeConversion, tipoDeConversion[0]);
	}

	/**
	 * Ventana que permite seleccionar el tipo de moneda que se desea convertir
	 * 
	 * @return Objeto, posibilidades: texto con la selección de moneda (Peso, Dolar,
	 *         Euro, Yen, Won) u Objeto Null
	 */
	public Object ventanaMonedaOrigen() {
		Object[] monedas = { "Peso MX", "Dólar", "Euro", "Libra", "Yen", "Won" };

		return JOptionPane.showInputDialog(null,
				"Selecciona la moneda a la que se desea convertir", "Moneda",
				JOptionPane.INFORMATION_MESSAGE, null,
				monedas, monedas[0]);
	}

	/**
	 * Ventana que se utiliza para ingresar la cantidad de dinero a convertir
	 * 
	 * @param monedaOrigen
	 * @return Double, cantidad ingresada en la ventana
	 */
	public Double ventanaCantidadMonedaOrigen(String monedaOrigen) {
		return Double.valueOf(JOptionPane.showInputDialog(null,
				"Ingrese la cantidad a convertir (" + monedaOrigen + ")",
				"Cantidad a convertir", JOptionPane.QUESTION_MESSAGE));
	}

	/**
	 * Ventana en donde se selecciona el tipo de moneda a la que será convertida la
	 * cantidad ingresada
	 * 
	 * @return Objeto, posibilidades: texto con la selección de moneda (Peso, Dolar,
	 *         Euro, Yen, Won) u Objeto Null
	 */
	public Object ventanaMonedaDestino() {
		Object[] monedaDestino = { "Peso MX", "Dolar", "Euro", "Libra", "Yen", "Won" };

		return JOptionPane.showInputDialog(null,
				"Selecciona la moneda a convertir", "Moneda",
				JOptionPane.INFORMATION_MESSAGE, null,
				monedaDestino, monedaDestino[0]);
	}

	/**
	 * Ventana que muestra el mensaje con la cantidad convertida
	 * 
	 * @param cantidadSinConvertir
	 * @param cantidadConvertida
	 * @param monedaOrigen
	 * @param monedaDestino
	 */
	public void ventanaCantidadMonedaDestino(Double cantidadSinConvertir, Double cantidadConvertida,
			String monedaOrigen, String monedaDestino) {
		JOptionPane.showMessageDialog(rootPane,
				"Se convirtieron " + cantidadSinConvertir + " " + monedaOrigen + " a "
						+ cantidadConvertida + " " + monedaDestino,
				"Operación exitosa",
				JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Ventana para finalizar o continuar con la ejecución del programa
	 * 
	 * @return Objeto, número de la opción seleccionada
	 */
	public Object ventanaContinuar() {
		return JOptionPane.showConfirmDialog(rootPane,
				"¿Desea realizar una nueva conversión?", "Nueva Conversión",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	}

	/**
	 * Ventana que permite seleccionar la escala de temperatura a utilizar
	 * 
	 * @return Objeto, posibilidades: Objeto Null o texto con la escala de
	 *         temperatura seleccionada
	 */
	public Object ventanaTemperaturaOrigen() {
		Object[] escalaTemperatura = { "Celsius", "Fahrenheit", "Kelvin" };
		return JOptionPane.showInputDialog(null,
				"Selecciona la escala de temperatura", "Temperatura",
				JOptionPane.INFORMATION_MESSAGE, null,
				escalaTemperatura, escalaTemperatura[0]);
	}

	/**
	 * Ventana que captura la temperatura a convertir
	 * 
	 * @param tempOrigen
	 * @return Double, temperatura a convertir
	 */
	public Double ventanaCantidadTemperaturaOrigen(String tempOrigen) {
		return Double.valueOf(JOptionPane.showInputDialog(null,
				"Ingrese la cantidad a convertir (" + tempOrigen + ")",
				"Cantidad a convertir", JOptionPane.QUESTION_MESSAGE));
	}

	/**
	 * Ventana que permite seleccionar la escala de temperatura a convertir
	 * 
	 * @return Objeto, posibilidades: texto con la selección de escala de
	 *         temperatura u Objeto Null
	 */
	public Object ventanaTemperaturaDestino() {
		Object[] escalaTemperatura = { "Celsius", "Fahrenheit", "Kelvin" };
		return JOptionPane.showInputDialog(rootPane,
				"Selecciona la escala de temperatura a convertir", "Temperatura a convertir",
				JOptionPane.QUESTION_MESSAGE, null,
				escalaTemperatura, escalaTemperatura[0]);
	}

	/**
	 * Ventana que muestra el resultado de la conversión de temperatura
	 * 
	 * @param cantidadSinConvertir
	 * @param cantidadConvertida
	 * @param temperaturaOrigen
	 * @param temperaturaDestino
	 */
	public void ventanaCantidadTemperaturaDestino(Double cantidadSinConvertir, Double cantidadConvertida,
			String temperaturaOrigen, String temperaturaDestino) {
		JOptionPane.showMessageDialog(rootPane,
				"Se convirtieron " + cantidadSinConvertir + " " + temperaturaOrigen + " a "
						+ cantidadConvertida + " " + temperaturaDestino,
				"Operación exitosa",
				JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Ventana que es lanzada cuando ocurrio un error
	 * 
	 * @param mensaje con informacion del error
	 */
	public void ventanaErrores(String mensaje) {
		JOptionPane.showMessageDialog(rootPane, "Ocurrio un error: " + mensaje,
				"Error", JOptionPane.ERROR_MESSAGE);
	}

}
