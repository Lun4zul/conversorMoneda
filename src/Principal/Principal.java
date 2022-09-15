package Principal;

import javax.swing.*;

import ConversorMonedas.OpcionesConversion;
import ConversorTemperaturas.OpcionesConversionT;

public class Principal {
		
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		OpcionesConversionT conversionT = new OpcionesConversionT();
		
		
		while(true)	{
			String opciones = JOptionPane.showInputDialog(null,"Selecciones una opcion de conversión","Menu",JOptionPane.PLAIN_MESSAGE, null, 
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura"},"Elegir").toString();
			switch(opciones)	{
			case "Conversor de Monedas": {
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null,"Desea Realizar otra conversion?");
						if (JOptionPane.OK_OPTION == respuesta)	{
							System.out.println("OK");
						}else	{
							JOptionPane.showMessageDialog(null, "Programa Finalizado");
							
						}break;
				}
			case "Conversor de Temperatura": {
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversionT.ConvertirTemperaturas (valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null,"Desea Realizar otra conversion?");
						if (JOptionPane.OK_OPTION == respuesta)	{
							System.out.println("OK");
						}else	{
							JOptionPane.showMessageDialog(null, "Programa Finalizado");
							
						}
				}break;
			}
		}
	}
	
}
