package POO2;

import javax.swing.JOptionPane;

public class numero {
	// Variable para almacenar el número ingresado
	int number;
	
	// Variables de control para contar números negativos y pares
	int i , neg= 0, par = 0;

	public void entrada() {
		// Ciclo que solicita hasta 5 números al usuario
		for (i = 0; i < 5; i++) {
			number= Integer.parseInt(JOptionPane.showInputDialog("digite numero "+(1+i)));
			
			// Comprueba si el número es par
			if(number%2==0) {
				
				par++;// Incrementa el contador de números pares
				
				// Comprueba si el número es negativo
			}else if (number<0) {
				
				neg ++;// Incrementa el contador de números negativos
			}
		} 
		// Muestra el resultado con JOptionPane
		JOptionPane.showInputDialog(null,"el numero de numeros pares es: "+par+"\n"+" Y los numeros negativos son :"+neg);
	}
	public static int ingresarDatos(String mensaje) {
		String cadena;
		int valor;
		cadena = JOptionPane.showInputDialog(null,mensaje);// Muestra el mensaje y recibe la entrada del usuario
		valor = Integer.parseInt(cadena);// Convierte la entrada a un entero
		return valor;// Devuelve el valor ingresado
	}
}
