package boletin5for;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Variable donde guardar el número que me introduce el usuario
		int numero;
		
		// Variable booleana que me diga si el número es primo
		boolean esPrimo = true;
		
		// Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario que introduzca un número
		System.out.println("Introduzca un número entero positivo");
		numero = sc.nextInt();
		
		if (numero > 0) {
			if (numero == 1) {
				esPrimo = false;
			}
			for (int i = 2; i<=Math.sqrt(numero); i++) {
				if(numero % i == 0) {					
					esPrimo = false;
					break;
				} 
			}
		} else {
			System.out.println("El valor introducido no es correcto");
		}
		
		if(esPrimo) {
			System.out.println("El número es primo");
		} else {
			System.out.println("El número no es primo");
		}
		
		// Cerramos el Scanner
		sc.close();

	}

}
