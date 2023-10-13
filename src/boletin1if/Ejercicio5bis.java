package boletin1if;

import java.util.Scanner;

public class Ejercicio5bis {

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
		
		if(num1 >= num2) {
			if(num2 >= num3) {
				System.out.println(num1 + ">=" + num2 + ">=" + num3);
			} else if(num1 >= num3) {
				System.out.println(num1 + ">=" + num3 + ">=" + num2);
			} else {
				System.out.println(num3 + ">=" + num1 + ">=" + num2);
			}
		} else { //num2 > num1
			if(num1 >= num3) {
				System.out.println(num2 + ">=" + num1 + ">=" + num3);
			} else if(num2>=num3) {
				System.out.println(num2 + ">=" + num3 + ">=" + num1);
			} else {
				System.out.println(num3 + ">=" + num2 + ">=" + num1);
			}
		}

	}

}
