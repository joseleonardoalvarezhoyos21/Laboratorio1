package Final;

import javax.swing.JOptionPane;

public class Numeros {
	//asignacmos el valor de numer y i que es default, neg par es un contador que esta inicializado en0
	int numer;
	int i, neg=0,par=0;
	/*En el metodo entrada tenemos un ciclo for el cual 
	 * va hacer 5 interacciones */
	public void entrada()
	{
		for(i=0; i<5;i++) {
			numer= ingresarDatos("digite 1 numero");
			if (numer%2==0) {
				par++;
			}
			if(numer<0) {
				neg++;
			}
		}
		JOptionPane.showMessageDialog(null, "el numero de numeros pares es: "+ par+"\n"
				+ "y el numero de numeros negativos es: " + neg);
	}
	
	
	public static int ingresarDatos(String mensaje) {
		String cadena; 
		int valor; 
		cadena=JOptionPane.showInputDialog(null,mensaje);
		valor= Integer.parseInt(cadena);
		return valor;
		
	}
}
