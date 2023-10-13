package boletin2switch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Números con los que realizar las operaciones
		double num1, num2;

		// Variable donde guardar el resultado de la operación
		double resultado;

		// Cadena donde guardar la opción seleccionada por el usuario
		String opcion;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario los dos números
		System.out.println("Introduzca dos números");
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		// Imprimimos el menú
		System.out.println("Seleccione una opción");
		System.out.println("A. SUMAR");
		System.out.println("B. RESTAR");
		System.out.println("C. MULTIPLICAR");
		System.out.println("D. DIVIDIR");

		// Leemos la opción seleccionada
		opcion = sc.next();

		switch (opcion) {
		case "A" -> {
			resultado = num1 + num2;
			System.out.println("La suma es " + resultado);
		}
		case "B" -> {
			resultado = num1 - num2;
			System.out.println("La resta es " + resultado);
		}
		case "C" -> {
			resultado = num1 * num2;
			System.out.println("La multiplicación es " + resultado);
		}
		case "D" -> {
			if (num2 != 0) {
				resultado = num1 / num2;
				System.out.println("La división es " + resultado);
			} else {
				System.out.println("No se puede dividir por 0");
			}
		}
		default -> System.out.println("La opción seleccionada no es válida");
		}

		// Cierre del Scanner
		sc.close();
	}

}
