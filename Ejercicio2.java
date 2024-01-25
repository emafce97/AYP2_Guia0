public class Ejercicio2 {

	/**
	 * Escribir una función que calcule la suma de los múltiplos de 3 y 5,
	 * mayores o iguales que 0 y menores que un parámetro n.
	 * 
	 * @param args
	 */
	public int sumarMultiplos(int n) throws Exception {
		if (n > 0) {
			int suma = 0;
			for (int i = 1; i < n; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					suma += i;
				}
			}
			return suma;
		} else {
			throw new Exception("El numero debe ser mayor a cero");
		}
	}

	public static void main(String[] args) {
		Ejercicio2 e2 = new Ejercicio2();
		int suma;
		try {
			suma = e2.sumarMultiplos(16);
			System.out.println(suma);
		} catch (Exception e) {
			System.out.println("Ocurrio la excepcion: " + e);
		}
	}

}
