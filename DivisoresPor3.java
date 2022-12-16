/*
 * DivisoresPor3.java
 * Programa que muestra en consola los divisores por tres de un número, ejemplo
 * n = 10, muestra 3, 6, 9
 * n = -10 muestra -3, -6, -9
 * n = 0 no muestra nada
 */
import java.util.Scanner;	

public class DivisoresPor3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero");
		int numero   = sc.nextInt();
		int contador = 3;
		sc.close();
		
		if (numero == 0) {
			System.out.println("0 no tiene divisores");
			System.exit(1);
		}
		
		do {
			if (contador % 3 == 0) {
				if ( numero < 0 ) {
					System.out.print( -contador + "\t");
				} else {
					System.out.print( contador + "\t");
				}
			}
			contador++;
		} while (contador <= Math.abs(numero));
		
	}
}
