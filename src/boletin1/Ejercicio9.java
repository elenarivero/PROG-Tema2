package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Creo constantes para darles valor a cada opción
		// de PIEDRA, PAPEL, TIJERAS
		final int PIEDRA = 1;
		final int PAPEL = 2;
		final int TIJERAS = 3;

		// Variables donde guardar la opción seleccionada por los jugadores
		int jugador1, jugador2;

		// Creamos un Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al jugador1 que elija una opción
		System.out.println("JUGADOR1: Elija PIEDRA(1), PAPEL(2), TIJERAS(3)");
		jugador1 = sc.nextInt();

		// Le pedimos al jugador2 que elija una opción
		System.out.println("JUGADOR2: Elija PIEDRA(1), PAPEL(2), TIJERAS(3)");
		jugador2 = sc.nextInt();

		
		// Si ambos jugadores seleccionan la misma opción
		if (jugador1 == jugador2) {
			System.out.println("EMPATE");
		} else if (jugador1 == PIEDRA && jugador2 == TIJERAS || 
				jugador1 == PAPEL && jugador2 == PIEDRA || 
				jugador1 == TIJERAS && jugador2 == PAPEL) {
			System.out.println("GANA EL JUGADOR 1");
		} else {
			System.out.println("GANA EL JUGADOR 2");
		}

		// Cerramos el Scanner
		sc.close();
	}

}
