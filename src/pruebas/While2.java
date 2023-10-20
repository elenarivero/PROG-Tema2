package pruebas;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {

		int numero;
		int indice = 1;
		Scanner sc = new Scanner(System.in);
		
		while(indice <= 10) {
			System.out.println("Introduzca un número:");
			numero = sc.nextInt();
			
			indice++;
		}
		
		sc.close();
	}

}
