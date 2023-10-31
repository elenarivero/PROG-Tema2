package boletin5for;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Variable donde guardar la suma de los impares
		int sumaImpares = 0;
		int numImpar = 1;

		for (int i = 1; i <= 10; i++) {
			sumaImpares += numImpar;
			numImpar += 2;
		}

		// Imprimo la suma de los impares
		System.out.println("La suma es: " + sumaImpares);
	}

}
