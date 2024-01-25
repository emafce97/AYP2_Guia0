import java.util.Arrays;

import excepciones.ArregloDesordenadoEx;
import excepciones.ArregloVacioEx;

public class Ejercicio6 {

	/**
	 * Intercala dos arreglos que esten ordenados.
	 * El nuevo arreglo debe estar ordenado con los elementos que componen a los anteriormente mencionados.
	 * @param a1
	 * @param a2
	 * @return
	 * @throws ArregloDesordenadoEx
	 */
	public int[] intercalarArreglos(int[] a1, int[] a2) throws ArregloDesordenadoEx {
		int[] a3 = new int[a1.length + a2.length];
		try {
			if (this.estaOrdenado(a1) && this.estaOrdenado(a2)) {
				for(int i=0;i<a1.length;i++){
					a3[i] = a1[i];
				}
				for(int i = 0, j = a1.length; i < a2.length && j<a3.length ;i++, j++){
					a3[j] = a2[i];
				}
				Arrays.sort(a3);
				return a3;
			} else {
				throw new ArregloDesordenadoEx();
			}
		} catch (ArregloVacioEx e) {
			System.out.println("Ocurrio la excepcion: " + e);
		}
		return a3;
	}

	/**
	 * Verifica si un arreglo esta ordenado
	 * 
	 * @param arreglo
	 * @return
	 * @throws ArregloVacioEx
	 */
	private boolean estaOrdenado(int[] arreglo) throws ArregloVacioEx {
		if (arreglo.length == 0) {
			throw new ArregloVacioEx();
		} else {
			for (int i = 0; i < arreglo.length - 1; i++) {
				if (arreglo[i] > arreglo[i + 1]) {
					return false;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Ejercicio6 e6 = new Ejercicio6();
		int[] a1 = {1,3,5};
		int[] a2 = {2,4};
		int[] a3;
		try{
			a3 = e6.intercalarArreglos(a1, a2);
			System.out.println(Arrays.toString(a3));
		}catch(Exception e){
			System.out.println("Ocurrio la excepcion: " + e);
		}

	}

}
