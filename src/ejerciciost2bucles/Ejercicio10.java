package ejerciciost2bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Variable para guardar el número
		int num = -1;
		int auxiliar;
		int numReves = 0;
		int ultimaCifra;

		// Creamos el Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);

		do {
			try {
				// Pedimos un número por teclado
				System.out.println("Introduzca un número positivo:");
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("El tipo introducido es incorrecto");
				sc.nextLine();
			}
		} while (num <= 0);

		auxiliar = num;
		while (auxiliar > 0) {
			ultimaCifra = auxiliar % 10;
			numReves = numReves * 10 + ultimaCifra;
			auxiliar /= 10;
		}

		if (numReves == num) {
			System.out.println("Es capicúa");
		} else {
			System.out.println("No es capicúa");
		}

		sc.close();
	}
}
