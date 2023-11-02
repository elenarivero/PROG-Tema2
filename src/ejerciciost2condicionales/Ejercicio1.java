package ejerciciost2condicionales;

import java.util.Scanner;

/*
 * ENTRADA: -5 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: 50000 | RES. ESPERADO: ERROR | RES. OBTENIDO: ERROR
 * ENTRADA: 5 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO: CAPICÚA
 * ENTRADA: 25 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO: 
 * ENTRADA: 22 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO:
 * ENTRADA: 122 | RES. ESPERADO: NO CAPICÚA | RES. OBTENIDO:
 * ENTRADA: 212 | RES. ESPERADO: CAPICÚA | RES. OBTENIDO:
 * 
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		// Número introducido por el usuario
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		numero = sc.nextInt();
		
		if(numero >= 0 && numero<=9999) {
			if(numero<=9) {
				
			} else if (numero <= 99) {
				
			} else if (numero <= 999) {
				
			} else {
				
			}
		} else {
			System.out.println("Número incorrecto");
		}

	}

}
