package ConversorTemperaturas;

import javax.swing.JOptionPane;

public class OpcionesConversionT {
ConvertirTemperaturas grados = new ConvertirTemperaturas();
	
	public void ConvertirTemperaturas(double valor)	{
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije una opción para convertir","Grados",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Grados Celsius a Grados Fahrenheit", "De Grados Celsius a Kelvin", "De Fahrenheit a Celsius",
								"De Fahrenheit a Kelvin" , 	"De Kelvin a Grados Celsius", "De Kelvin a Grados Fahrenheit" },
						"Seleccion")).toString();
		
		switch(opcion)	{
		case "De Grados Celsius a Grados Fahrenheit":	{
			grados.ConvertirCelsiusAFahrenheit(valor);
			break;
		}
		case "De Grados Celsius a Kelvin":	{
			grados.ConvertirCelsiusAKelvin(valor);
			break;
		}
		case "De Fahrenheit a Celsius":	{
			grados.ConvertirFahrenheitACelsius(valor);
			break;
		}
		case "De Fahrenheit a Kelvin":	{
			grados.ConvertirFahrenheitAKelvin(valor);
			break;
		}
		case "De Kelvin a Grados Celsius":	{
			grados.ConvertirKelvinACelsius(valor);
			break;
		}
		case "De Kelvin a Grados Fahrenheit":	{
			grados.ConvertirKelvinAFahrenheit(valor);
			break;
		}
		
	}
	}
}
	

