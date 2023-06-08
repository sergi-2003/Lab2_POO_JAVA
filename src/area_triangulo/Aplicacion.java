package area_triangulo;

import javax.swing.JOptionPane;

public class Aplicacion {
	public static void main(String[] args) {
		Entidad rectangulo;
		rectangulo = new Entidad ();
		
		rectangulo.ingresaDatos();
		rectangulo.calcularArea();
	}
}
