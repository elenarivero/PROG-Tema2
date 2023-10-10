package boletin1;

import java.util.Scanner;

public class Ejercicio9bis {

	public static void main(String[] args) {
		// Creo constantes para darles valor a cada opción
		// de PIEDRA, PAPEL, TIJERAS
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERAS = "TIJERAS";

		// Variables donde guardar la opción seleccionada por los jugadores
		String jugador1, jugador2;

		// Creamos un Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al jugador1 que elija una opción
		System.out.println("JUGADOR1: Elija PIEDRA, PAPEL, TIJERAS");
		jugador1 = sc.next();

		if(!jugador1.equals(PIEDRA) && !jugador1.equals(PAPEL) && !jugador1.equals(TIJERAS)) {
			System.out.println("Opción no válida");
		} else {
			// Le pedimos al jugador2 que elija una opción
			System.out.println("JUGADOR2: Elija PIEDRA(1), PAPEL(2), TIJERAS(3)");
			jugador2 = sc.next();
			
			if(!jugador2.equals(PIEDRA) && !jugador2.equals(PAPEL) && !jugador2.equals(TIJERAS)) {
				System.out.println("Opción no válida");
			} else {
				// Si ambos jugadores seleccionan la misma opción
				if (jugador1.equals(jugador2)) {
					System.out.println("EMPATE");
				} else if (jugador1.equals(PIEDRA) && jugador2.equals(TIJERAS) || 
						jugador1.equals(PAPEL) && jugador2.equals(PIEDRA) || 
						jugador1.equals(TIJERAS) && jugador2.equals(PAPEL)) {
					System.out.println("GANA EL JUGADOR 1");
				} else {
					System.out.println("GANA EL JUGADOR 2");
				} 
			}
		}
		// Cerramos el Scanner
		sc.close();
	}

}
