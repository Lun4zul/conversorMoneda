package ConversorMonedas;

import javax.swing.JOptionPane;

public class OpcionesConversion {
ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double valor)	{
		String opcion = (JOptionPane.showInputDialog(null,
				"Elije la moneda a la que deseas convertir tu dinero","Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"De Pesos Colombianos a Dolar", "De Pesos Colombianos a Euro", "De Pesos Colombianos a Libras Esterlinas",
								"De Pesos Colombianos a Yen Japonés","De Pesos Colombianos a Won Sul-Coreano", 
								"De Dolar a Pesos Colombianos","De Euro a Pesos Colombianos","De Libras Esterlinas a Pesos Colombianos",
								"De Yen Japonés a Pesos Colombianos", "De Won Sul-Coreano a Pesos Colombianos"},
						"Seleccion")).toString();
		
		switch(opcion)	{
		case "De Pesos Colombianos a Dolar":	{
			monedas.ConvertirPesosColombianosADolares(valor);
			break;
		}
		case "De Pesos Colombianos a Euro":	{
			monedas.ConvertirPesosColombianosAEuros(valor);
			break;
		}
		case "De Pesos Colombianos a Libras Esterlinas":	{
			monedas.ConvertirPesosColombianosLibras(valor);;
			break;
		}
		case "De Pesos Colombianos a Yen Japonés":	{
			monedas.ConvertirPesosColombianosAYen(valor);
			break;
		}
		case "De Pesos Colombianos a Won Sul-Coreano":	{
			monedas.ConvertirPesosColombianosAWon(valor);
			break;
		}
		case "De Dolar a Pesos Colombianos":	{
			monedas.ConvertirDolarAPesosColombianos(valor);
			break;
		}
		case "De Euro a Pesos Colombianos":	{
			monedas.ConvertirEurosAPesosColombianos(valor);
			break;
		}
		case "De Libras Esterlinas a Pesos Colombianos":	{
			monedas.ConvertirLibrasAPesosColombianos(valor);
			break;
		}
		case "De Yen Japonés a Pesos Colombianos":	{
			monedas.ConvertirYenAPesosColombianos(valor);
			break;
		}
		case "De Won Sul-Coreano a Pesos Colombianos":	{
			monedas.ConvertirWonAPesosColombianos(valor);
			break;
		}
		
			
		
	}
	}
}
	

