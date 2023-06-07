package dos_clases;

public class Aplicacion {
	
	public static void main(String args[]) {
		//Declarando un objeto Entidad
		Entidad       rectangulo; 
		
		//vinculacion de la clase Entidad con el objeto rectangulo
		rectangulo = new Entidad();
		
		//aqui estamos entrado al metodo ingresarDatos a través del objeto
		rectangulo.ingresarDatos();
		//aqui estamos entrado al metodo calcularArea a través del objeto
		rectangulo.calcularArea();
	}

}//FIn de la clase Aplicacion
