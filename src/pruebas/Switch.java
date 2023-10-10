package pruebas;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número:");
		a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("Hola");
			break;
		case 2:
			System.out.println("Paco"); 
			a++; 
			break;			
		case 3:
			System.out.println("Adiós");
		default:
			System.out.println("Sin coincidencia");
		}

		sc.close();
	}

}
