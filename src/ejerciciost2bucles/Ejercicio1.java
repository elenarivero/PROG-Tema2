package ejerciciost2bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	
	public static int leeNumero(Scanner scan) {
		int num = -1;
		
		try {
			
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("El tipo no es correcto");
			scan.nextLine();
		} 
		return num;
	}

	public static void main(String[] args) {
		int horas = -1, min = -1, segundos = -1;
		int incremento;	

		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca las horas:");
			horas = leeNumero(sc);
		} while (horas < 0 || horas > 23);

		System.out.println("horas: " + horas);
		
		do {
			try {
				System.out.println("Introduzca los minutos:");
				min = sc.nextInt();
				if (min < 0 || min > 59) {
					System.out.println("Dato erróneo. Vuelva a introducirlo");
				}
			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

		} while (min < 0 || min > 59);

		do {
			try {
				System.out.println("Introduzca los segundos:");
				segundos = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es del tipo correcto");
				sc.nextLine();
			}

		} while (segundos < 0 || segundos > 59);

		System.out.println("Horas: " + horas);

		sc.close();
	} // fin main

}
