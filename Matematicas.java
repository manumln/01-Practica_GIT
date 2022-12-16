
/**
 * Clase Numeros.java que contiene distintos métodos
 * para probar las estructuras de control while, do-while, for
 * @author Manuel
 * @version 1.0
 * @since 1.0
 */
public class Numeros {
	/**
	 * Método mostrarEnConsolaSerie1al10 que muestra la 
	 * serie 1 2 3 ... 10 usando un bucle do-while
	 * y separando los valores con un tabulador
	 */ 
	public static void mostrarEnConsolaSerie1al10() {
		System.out.println("Probando método mostrarEnCosolaSerie1al10()");
		int contador = 1;
		do {
			System.out.printf("%d\t", contador++);
			//contador++;
		} while(contador <= 10);
		System.out.println();
	}
	
	/**
	 * Método que muestra en consola la serie <strong>20 25 30 ... 75 80</strong>
	 * Usa bucle while y un tabulador para separar los valores
	 */ 
	public static void mostrarEnConsolaSerie20Al80() {
		System.out.println("Probando método mostrarEnConsolaSerie20Al80()");
		int contador = 20;
		while (contador <= 80) {
			System.out.printf("%d\t", contador);
			contador +=5;
		}
		System.out.println();
	}
	/**
	 * Método que muestra en consola la serie 100 98 96 ... 48 50
	 * Usa bucle while y un tabulador para separar los valores
	 */ 
	public static void mostrarEnConsolaSerie100Al50() {
		System.out.println("Probando método mostrarEnConsolaSerie100Al50()");
		for (int contador = 100; contador >= 50 ; contador -= 2) {
			System.out.printf("%d\t", contador);
		}
		System.out.println();
	}
	
	/**
	 * Método que devuelve el valor de la multiplicación desde 1 a N
	 * Ejemplo N = 5: devuelve 1 * 2 * 3 * 4 * 5
	 * @param numeroN valor de N
	 * @return el entero de la multiplicación
	 */
	public static int multiplicarDe1AlN(int numeroN) {
		int contador = 1, multiplicacion = 1;
		do {
			multiplicacion *= contador++;
			//contador++;
		} while(contador <= numeroN);
		
		return multiplicacion;
	}
	
	/**
	 * Método que devuelve la suma de cuadrados desde 1 a N²
	 * Ejemplo N = 5: devuelve 1² + 2² + 3² + 4² + 5²
	 * @param numeroN valor de N
	 * @return el entero de la suma de los cuadrados  
	 */ 
	public static int sumaCuadradosDe1AlN(int numeroN){
		int contador = 0;
		int sumaCuadrados = 0;
		while (contador <= numeroN) {
			sumaCuadrados += contador * contador;
			contador++;
		}
		return sumaCuadrados;
	}

	/**
	 * Método que muestra en consola la suma de nº pares y muestra
	 * la suma de nº impares comprendidos entre 0 y N
	 * Ejemplo N = 5, muestra la suma de pares del resultado de  0 + 2 + 4
	 * y muestra la suma de impares del resultado de 1 + 3 + 5
	 * @param numero valor de N
	 */ 
	public static void mostrarSumaParesYSumaImpares(int numero){
		int sumaPares = 0, sumaImpares = 0;
		for (int contador = 0; contador <= numero; contador++) {
			if (contador % 2 == 0)
				sumaPares += contador;
			else
				sumaImpares += contador;
		}
		System.out.printf("La suma de los números pares desde 0 a %d vale %d%n",
								numero, sumaPares);
		System.out.printf("La suma de los números impares desde 0 a %d vale %d%n",
								numero, sumaImpares);
	}
}
