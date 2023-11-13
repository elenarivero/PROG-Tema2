package ejerciciost2bucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Variable para guardar el número
		int num;
		// Variable que cuenta cifras
		int contador = 0;
		
		// Creamos el Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos un número por teclado
		System.out.println("Introduzca un número positivo:");
		num = sc.nextInt();
		
		while(num>0) {
			num /= 10;
			contador++;
		}

		System.out.println("Tiene " + contador + " cifras.");
		sc.close();
	}

}
