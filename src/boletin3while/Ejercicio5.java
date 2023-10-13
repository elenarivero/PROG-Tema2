package boletin3while;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Contador que va a ir del 1 al 10
		int contador = 1;
		
		// Número leído del teclado
		int num;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		while(contador <= 10) {
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			
			if(num > 0) {
				
			} else if (num < 0) {
				
			} else {
				
			}
			contador++;
		}
		
		sc.close();
	}

}
