/*
 * DivisoresPor5.java
 * Programa que muestra en consola los divisores por tres de un número, ejemplo
 * n = 10, muestra 3, 6, 9
 * n = -10 muestra -3, -6, -9
 * n = 0 no muestra nada
 */
import java.util.Scanner;	

public class DivisoresPor5 {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero");
		int numero   = sc.nextInt();
		
		sc.close();
				
		for (int contador = 5; contador <= Math.abs(numero); contador++) {
			if (contador % 5 == 0) {
				if ( numero < 0 ) {
					System.out.print( -contador + "\t");
				} else {
					System.out.print( contador + "\t");
				}
			}
		}
		
	}
}
