package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// División por 0
		double a = 0;
		int num1 = -1;
		boolean correcto = false;
		Scanner sc = new Scanner(System.in);;

		do {
			try {
				
				System.out.println("Introduzca un número positivo");
				num1 = sc.nextInt();
				correcto = true;

			} catch (InputMismatchException e) {
				System.out.println("El dato introducido no es correcto");
				sc.nextLine();
				//System.out.println("Mensaje: " + e.getMessage());
			} 
		} while (!correcto);
		sc.close();
	}
	
}
