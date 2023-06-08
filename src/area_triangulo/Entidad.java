package area_triangulo;

import javax.swing.JOptionPane;

public class Entidad {
	public double ladoA;
	public double ladoB;
	
	public void ingresaDatos() {
		
		String cadena;
		
		cadena = JOptionPane.showInputDialog("ingrese la longitud de lado A");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog("ingrese la longitud de lado B");
		ladoB = Double.parseDouble(cadena);
	}
	
	public void calcularArea() {
		double resultado;
		
		resultado = ladoA * ladoB;
		
		JOptionPane.showMessageDialog(null,"el resulto es: "+ resultado);
	}
}
