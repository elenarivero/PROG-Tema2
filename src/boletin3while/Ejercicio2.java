package boletin3while;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Número introducido por el usuario
		int num;
		
		// Contador de números que ha introducido el usuario
		int contador = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pregunto por el número al usuario
		System.out.println("Introduzca un número:");
		num = sc.nextInt();
		
		while(num>=0) {
			contador++;
			
			// Le pregunto por el número al usuario
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
		}
		
		System.out.println("Usted ha introducido " + contador + " números");
		// Cerramos Scanner
		sc.close();

	}

}
