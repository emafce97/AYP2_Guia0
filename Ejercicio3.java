import excepciones.ArregloVacioEx;

public class Ejercicio3 {

	/**
	 * Escribir una función que reciba un arreglo de enteros y devuelva true si
	 * el arreglo está ordenado de mayor a menor y false si está desordenado.
	 * 
	 * @param args
	 */
	public boolean estaOrdenado(int[] arreglo) throws ArregloVacioEx {
		if (arreglo.length != 0) {
			for (int i = 0; i < arreglo.length - 1; i++) {
				if (arreglo[i] > arreglo[i + 1]) {
					return false;
				}
			}
			return true;
		} else {
			throw new ArregloVacioEx();
		}
	}

	public static void main(String[] args) {
		Ejercicio3 e3 = new Ejercicio3();
		int[] arreglo = { 1, 3, 2 };
		try {
			System.out.println(e3.estaOrdenado(arreglo));
		} catch (ArregloVacioEx e) {
			System.out.println(e);
		}

	}

}
