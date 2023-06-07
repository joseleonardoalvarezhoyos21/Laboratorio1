package una_clase_con_metodos;

import javax.swing.JOptionPane;

public class Aplicacion {
	public static void main(String args[]) {
		//Asignado el tipo de dato a la variable
		double ladoA;
		double ladoB;
		
		//a través del metodo ingresarDatos almacenamos el dato en las variables ladoA y ladoB
		ladoA= ingresarDatos("ingrese la longitud del lado A: ");
		ladoB= ingresarDatos("ingrese la longitud del lado B: ");
		//mandamos la informacion de ladoA y ladoB al metodo calcularArea donde se va realizar la operacion.
		calcularArea(ladoA,ladoB);
	}
//
	private static double ingresarDatos(String mensaje) {
		
		/*Cuando se le envia el ladoA y ladoB al metodo ingresarDatos llega un String el cual es almacenado
		 * en una varible mensaje esta varibale que contiene el dato es parceado y almacenado en la variable 
		 * valor la cual es retornada en la linea 29*/
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(cadena);
		return valor;
	}
	
	
	private static void calcularArea(double a, double b) {
		//Del metodo main llega el valor de ladoA y ladoB, el cual es almacenado en las variables 
		// a y b, las cuales van a ser multiplicadas y almacenadas en la variable resultado.
		// Por ultimo imprimir resultado en la linea 40
		double resultado; 
		
		resultado = a*b;
		
		JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
	}

	//fin de la clase Aplicación

}
