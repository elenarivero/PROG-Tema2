package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Variables donde guardar los tres números
		int num1, num2, num3;
		
		// Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido los números
		System.out.println("Introduzca 3 números");
		
		// Leemos los tres números
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 >= num2 && num2 >= num3) {
			System.out.println(num1 + ">=" + num2 + ">=" + num3);
		} else if (num1 >= num3 && num3 >= num2) {
			System.out.println(num1 + ">=" + num3 + ">=" + num2);
		} else if (num2 >= num1 && num1 >= num3) {
			System.out.println(num2 + ">=" + num1 + ">=" + num3);
		}

	}

}
