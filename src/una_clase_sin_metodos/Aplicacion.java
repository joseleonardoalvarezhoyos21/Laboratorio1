package una_clase_sin_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {
	public static void main(String []args) {
		//asignacion del tipo de dato
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		//parceando la variable cadena a double y almacenando en ladoA
		
		cadena= JOptionPane.showInputDialog(null,"ingrese la longitud del lado A:");
		ladoA = Double.parseDouble(cadena);
		
		//parceando la variable cadena a double y almacenando en ladoB
		
		cadena= JOptionPane.showInputDialog(null,"ingrese la longitud del lado B:");
		ladoB = Double.parseDouble(cadena);
		
		// Hacemos la operacion  multiplicando ladoA por ladoB la operaacion fue almacenada en una variable 
		//resultado y fue imprimida con un JOptionPane.
		resultado= ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
		
		
	}
	//fin de la clase Aplicación
}
