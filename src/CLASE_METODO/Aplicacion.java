package CLASE_METODO;

import javax.swing.JOptionPane;

public class Aplicacion {
	public static void main(String[] args) {
		   
		double ladoA; 
		double ladoB;
		
		ladoA = ingresarDatos ("ingrese la longitud del lado A: ");// Solicitar al usuario la longitud del lado A
		ladoB = ingresarDatos ("ingrese la longitud del ladoo B: ");// Solicitar al usuario la longitud del lado b
		
		calcularArea (ladoA, ladoB); // Calcular el área con los valores ingresados

	}
	
	public static double ingresarDatos (String mensaje) {
		String cadena ;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null,mensaje);// Mostrar el mensaje y recibir la entrada del usuario
		valor = Double.parseDouble(cadena);// Convertir la entrada a un valor decimal (double)
		
		return valor;  // Devolver el valor ingresado
	}
  
	public static void calcularArea(double a, double b) {
		double resultado;
		
		resultado = a * b;// Calcular el área multiplicando los lados
		JOptionPane.showInternalMessageDialog(null, "el resultado es: "+ resultado);// Mostrar el resultado en un cuadro de diálogo interno
    }
}
// Fin de la aplicacion