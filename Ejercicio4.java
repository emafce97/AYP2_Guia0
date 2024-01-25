import excepciones.ArregloVacioEx;

public class Ejercicio4 {

	/**
	 * Escribir una función que reciba un arreglo de enteros y devuelva la suma
	 * de los elementos que se encuentran en posiciones pares (incluido el
	 * elemento de la posición 0)
	 * 
	 * @param arreglo
	 * @return
	 * @throws ArregloVacioEx
	 */
	public int sumarPosiciones(int[] arreglo) throws ArregloVacioEx {
		if (arreglo.length != 0) {
			int suma = 0;
			for (int i = 0; i < arreglo.length; i++) {
				if (i % 2 == 0) {
					suma += arreglo[i];
				}
			}
			return suma;
		} else {
			throw new ArregloVacioEx();
		}
	}

	public static void main(String[] args) {
		Ejercicio4 e4 = new Ejercicio4();
		int[] arreglo = { 1, 2, 13, 4, 8, 6 };
		int suma = 0;
		try {
			suma = e4.sumarPosiciones(arreglo);
			System.out.println(suma);
		} catch (ArregloVacioEx e) {
			System.out.println("Ocurrio la excepcion: " + e);
		}

	}

}
