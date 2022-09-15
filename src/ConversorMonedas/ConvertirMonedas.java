package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	//Convertir Pesos Colombianos a Monedas Extranjeras
	
	public void ConvertirPesosColombianosADolares(double valor)	{
		double monedaDolar = valor / 4381.70;
		monedaDolar = (double) Math.round(monedaDolar*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaDolar+ "Dolares");
	}
	
	public void ConvertirPesosColombianosAEuros(double valor)	{
		double monedaEuro = valor / 4403.07;
		monedaEuro = (double) Math.round(monedaEuro*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaEuro+ "Euros");
	}
	
	public void ConvertirPesosColombianosLibras(double valor)	{
		double monedaLibra = valor / 5075.82;
		monedaLibra = (double) Math.round(monedaLibra*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaLibra+ "Libras Esterlinas");
	}
	
	public void ConvertirPesosColombianosAYen(double valor)	{
		double monedaYen = valor / 30.5333;
		monedaYen = (double) Math.round(monedaYen*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaYen+ "Yen Japones");
	}
	public void ConvertirPesosColombianosAWon(double valor)	{
		double monedaWon = valor / 3.16651;
		monedaWon = (double) Math.round(monedaWon*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaWon+ "Won Sul-Coreano");
	}
	
	//Convertir Monedas Extranjeras a Pesos Colombianos
	
	public void ConvertirDolarAPesosColombianos(double valor)	{
		double monedaDolarAPeso = valor /  0.000227061;
		monedaDolarAPeso = (double) Math.round(monedaDolarAPeso*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaDolarAPeso+ "  Pesos");
	}
	
	public void ConvertirEurosAPesosColombianos(double valor)	{
		double monedaEuroAPeso = valor /  0.000226716;
		monedaEuroAPeso = (double) Math.round(monedaEuroAPeso*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaEuroAPeso+ "  Pesos");
	}
	
	public void ConvertirLibrasAPesosColombianos(double valor)	{
		double monedaLibraAPeso = valor /  0.000196602;
		monedaLibraAPeso = (double) Math.round(monedaLibraAPeso*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+ monedaLibraAPeso + "  Pesos");
	}
	
	public void ConvertirYenAPesosColombianos(double valor)	{
		double monedaYenAPeso = valor /  0.0326892;
		monedaYenAPeso = (double) Math.round(monedaYenAPeso*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaYenAPeso+ "  Pesos");
	}
	public void ConvertirWonAPesosColombianos(double valor)	{
		double monedaWonAPeso = valor /  0.315547;
		monedaWonAPeso = (double) Math.round(monedaWonAPeso*100d)/100;
		JOptionPane.showMessageDialog(null,"Tiene $ "+monedaWonAPeso+ "  Pesos");
	}
}
