package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variables donde guardar los coeficientes de la ecuación
		int a, b, c;

		// Variable donde guardar el discriminante
		long discriminante;

		// Variables donde guardar las soluciones
		double x1, x2;

		// Scanner para leer los coeficientes
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario los tres coeficientes
		System.out.println("Introduzca los tres coeficientes de la ecuación: a, b, c");

		// Leemos los tres coeficientes
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		// Calculamos el discriminante
		discriminante = (long) (Math.pow(b, 2) - (4 * a * c));

		// Comprobamos si el discriminante es negativo
		if (discriminante < 0) {
			System.out.println("La ecuación no tiene solución real.");
		} else {
			if (a == 0) {
				// Si a = 0 entonces tenemos una ecuación de primer grado
				// La ecuación tiene una sola solución
				x1 = (double) -c / b;
				System.out.println("La ecuación tiene una única solución: " + x1);
			} else {
				// El discriminante es >= 0 y la a no vale 0, entonces la ecuación tiene dos
				// soluciones
				x1 = (-b + Math.sqrt(discriminante)) / 2 * a;
				x2 = (-b - Math.sqrt(discriminante)) / 2 * a;
				System.out.println("Las soluciones de la ecuación son:\n" + x1 + "\n" + x2);
			}
		}
	}

}
