package dos_clases;

import javax.swing.JOptionPane;

public class Entidad {
	//Asignacion de dos variables y asignando su estado para ser visible en otras clases
	private double ladoA; 
	private double ladoB;
	//Creamos el metodo ingresarDatos en el cual estamos pidiendo y parceando dos datos
	//ladoA y ladoB
	public void ingresarDatos() {
		String cadena;
		
		cadena = JOptionPane.showInputDialog(null,"ingrese la longitud del lado A:");
		ladoA = Double.parseDouble( cadena );
		
		cadena = JOptionPane.showInputDialog(null, "Ingrese la longitud del lado B:");
		ladoA = Double.parseDouble( cadena );
	}
	//Creamos un metodo calcular arrea en el cual va llegar la informacion de 
	//ladoA y ladoB y gracias a esto se va llevar acabo la operacion y va ser alamacenado en resultado.
	// posteriormenete la variable resultado se imprimi en la linea 29
	
	public void calcularArea() {
		double resultado; 
		
		resultado = ladoA * ladoB;
		
		JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
	}

}
