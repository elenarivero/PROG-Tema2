package pruebas;

import java.util.Scanner;

public class PruebaIf {

	public static void main(String[] args) {
		int dia;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		dia = sc.nextInt();
		
		if(dia == 1) {
			System.out.println("Lunes");
		} else if (dia == 2) {
			System.out.println("Martes");
		} else if (dia == 3) {
			System.out.println("Miércoles");
		} else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		} else if (dia == 6) {
			System.out.println("Sábado");
		} else if (dia == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("El día introducido no es correcto");
		}
		
		sc.close();
	}

}
