package boletin4dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Me creo objeto Random
		Random rand = new Random();
		
		// Valor mínimo del rango
		int min = 1;
		
		// Valor máximo del rango 
		int max = 101;
		
		// Número que piensa la máquina
		int nMaquina;
		
		// Cadena donde guardar la respuesta del Humano
		String respHumano;
		
		// Creo el Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		do {
			nMaquina = rand.nextInt(min, max);
			System.out.println("Es este número: " + nMaquina);
			respHumano = sc.nextLine();
			
			if(respHumano.equals("MAYOR")) {
				min = nMaquina + 1;
			} else if(respHumano.equals("MENOR")) {
				max = nMaquina;
			}
			
		} while(!respHumano.equals("IGUAL") && min != max);
		
		if(min == max) {
			System.out.println("Me estás troleando");
		} else {
			System.out.println("¡ACERTÉ!");
		}
		
		
	}

}
