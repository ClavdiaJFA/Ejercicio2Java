import java.util.Scanner;

public class Ejercicio2Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduzca su nombre:");
		String entradaTeclado = "";
		//Creaci�n de un objeto Scanner
		Scanner entradaEscaner = new Scanner (System.in);
		//M�todo sobre un scanner
		entradaTeclado = entradaEscaner.nextLine ();
		System.out.println ("Bienvenido/a" + entradaTeclado);
		

	}

}
