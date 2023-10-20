package boletin3while;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creamos objeto de la clase Random
		Random rand = new Random();
		
		// La máquina genera un número aletorio entre 1 y 100
		int nMaquina = rand.nextInt(1, 101);
		
		// Variable donde guardar el número del humano
		int nHumano;
		
		// Creo el Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pido un número al humano
		System.out.println("Introduzca un número entre 1 y 100");
		nHumano = sc.nextInt();
		
		// Seguiré preguntando números mientras no acierte y no se rinda
		while (nHumano != nMaquina && nHumano != -1) {
			// Si el de la máquina es mayor imprimo "MAYOR"
			if(nHumano < nMaquina) {
				System.out.println("MAYOR");
			} else { // Si el de la máquina es menor imprimo "MENOR"
				System.out.println("MENOR");
			}
			
			// Le pido un número al humano
			System.out.println("Introduzca un número entre 1 y 100");
			nHumano = sc.nextInt();
		}
		
		// Tenemos que comprobar por qué hemos salido del bucle
		if(nHumano == -1) { // Si se rinde
			System.out.println("HAS PERDIDO");
		} else { // Si gana
			System.out.println("HAS ACERTADO");
		}

	}

}
