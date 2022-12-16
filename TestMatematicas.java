/*
 * TestNumeros.java
 */

import java.util.Scanner;
public class TestNumeros {
	
	public static void main (String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		Numeros.mostrarEnConsolaSerie1al10();
		Numeros.mostrarEnConsolaSerie20Al80();
		Numeros.mostrarEnConsolaSerie100Al50();
		
		System.out.println("Introduce nº para calcula la multiplicación de 1 a N");
		int numeroN = sc.nextInt();
		int multiplacion = Numeros.multiplicarDe1AlN(numeroN);
		System.out.printf("Multiplica de 1 a %d vale %d%n", 
								numeroN, multiplacion);
								
		System.out.println("Introduce nº para calcula la suma de cuadrados de 1 a N");
		numeroN = sc.nextInt();
		//int sumaCuadrados = Numeros.sumaCuadradosDe1AlN(numeroN);
		//System.out.printf("La suma de cuadrados de 1 a %d vale %d%n", 
		//						numeroN, sumaCuadrados);
		System.out.printf("La suma de cuadrados de 1 a %d vale %d%n", 
								numeroN, Numeros.sumaCuadradosDe1AlN(numeroN));						
		System.out.println("Introduce nº para calcula la suma de pares a impares");
		numeroN = sc.nextInt();
		Numeros.mostrarSumaParesYSumaImpares(numeroN);

		sc.close();
		
	}
}

