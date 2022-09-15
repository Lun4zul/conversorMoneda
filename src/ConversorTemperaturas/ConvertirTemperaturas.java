package ConversorTemperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
	
	//De grados Celsius a Fahrenheit
	
	public void ConvertirCelsiusAFahrenheit(double valor)	{
		double celsiusAFahrenheit = (valor * 9/5) + 32;
		celsiusAFahrenheit = (double) Math.round(celsiusAFahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados celsius es igual a  "+celsiusAFahrenheit+ " Grados Fahrenheit");
	}
	public void ConvertirCelsiusAKelvin(double valor)	{
		double celsiusAKelvin = valor + 273.15 ;
		celsiusAKelvin = (double) Math.round(celsiusAKelvin*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados celsius es igual a  "+ celsiusAKelvin + " Grados Kelvin");
	}
	public void ConvertirFahrenheitACelsius(double valor)	{
		double FahrenheitACelsius = (valor - 32) * 5/9;
		FahrenheitACelsius = (double) Math.round(FahrenheitACelsius*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit es igual a  "+FahrenheitACelsius + " Grados Celsius");
	}
	public void ConvertirFahrenheitAKelvin(double valor)	{
		double FahrenheitAKelvin = (valor - 32) * 5/9 + 273.15;
		FahrenheitAKelvin = (double) Math.round(FahrenheitAKelvin*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit es igual a  "+FahrenheitAKelvin+ " Grados Kelvin");
	}
	public void ConvertirKelvinAFahrenheit(double valor)	{
		double KelvinAFahrenheit = (valor - 273.15) * 9/5 + 32;
		KelvinAFahrenheit = (double) Math.round(KelvinAFahrenheit*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Kelvin es igual a  "+ KelvinAFahrenheit + " Grados Fahrenheit");
	}
	
	public void ConvertirKelvinACelsius(double valor)	{
		double KelvinACelsius = valor - 273.15;
		KelvinACelsius = (double) Math.round(KelvinACelsius*100d)/100;
		JOptionPane.showMessageDialog(null, valor + " Grados Kelvin es igual a  "+ KelvinACelsius + " Grados Celsius");
	}
}
