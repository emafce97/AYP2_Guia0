public class Ejercicio1 {

	/**
	 * Escribir una función que reciba un número n y devuelva true si n es primo
	 * o false en caso contrario.
	 * 
	 * @param n
	 * @return
	 */
	public boolean esPrimo(int n) throws Exception {
		if (n != 0) {
			int cantDivisores = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					cantDivisores++;
				}
			}
			return cantDivisores == 2;
		} else {
			throw new Exception("El numero debe ser distinto de cero");
		}
	}

	public static void main(String[] args) {
		Ejercicio1 e1 = new Ejercicio1();
		boolean esPrimo;
		try {
			esPrimo = e1.esPrimo(0);
			System.out.println(esPrimo);
		} catch (Exception e) {
			System.out.println("Ocurrio la excepcion: " + e);
		}
	}

}
