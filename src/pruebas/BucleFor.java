package pruebas;

public class BucleFor {

	public static void main(String[] args) {
		
		int contador = 1;
		for (;;) { 
			
			System.out.println(contador);
			
			if(contador % 2 == 0) {
				System.out.println("Es par");
				continue;
			}
			
			System.out.println("Es impar");
		}
				
	}

}
