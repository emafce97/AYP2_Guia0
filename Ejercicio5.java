import excepciones.MatricesDistintasEx;
import excepciones.MatrizVaciaEx;

public class Ejercicio5 {

	/**
	 * Escribir una función que reciba dos matrices de NxN
	 * y devuelva la suma de las mismas.
	 * @param args
	 */
	public int[][] sumarMatrices(int[][] m1, int[][] m2) throws MatricesDistintasEx {
		if (this.tienenMismaCantFilas(m1, m2) && this.tienenMismaCantCol(m1, m2)) {
			int[][] matrizSumatoria = new int[m1.length][m1[0].length];
			for (int i = 0; i < m1.length; i++) {
				for (int j = 0; j < m1[i].length; j++) {
					matrizSumatoria[i][j] = m1[i][j] + m2[i][j];
				}
			}
			return matrizSumatoria;
		} else {
			throw new MatricesDistintasEx();
		}
	}

	/**
	 * Verifica si ambas matrices tienen la misma cantidad de filas
	 * 
	 * @param m1
	 * @param m2
	 * @return
	 */
	private boolean tienenMismaCantFilas(int[][] m1, int[][] m2) {
		return m1.length == m2.length;
	}

	/**
	 * Verifica si ambas matrices tienen la misma cantidad de columnas
	 * 
	 * @param m1
	 * @param m2
	 * @return
	 */
	private boolean tienenMismaCantCol(int[][] m1, int[][] m2) {
		return this.mismaCantColumnas(m1) && this.mismaCantColumnas(m2);
	}

	/**
	 * Verifica si una matriz tiene la misma cantidad de columnas en cada una de
	 * sus filas
	 * 
	 * @param m
	 * @return
	 */
	private boolean mismaCantColumnas(int[][] m) {
		for (int i = 1; i < m.length; i++) {
			if (m[i].length != m[0].length) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Imprime una matriz por consola
	 * @param m
	 */
	public void imprimirMatriz(int[][] m) throws MatrizVaciaEx{
		if(m.length != 0 && m[0].length != 0){
			for(int i=0; i<m.length; i++){
				for(int j=0; j<m[i].length; j++){
					System.out.print(m[i][j] + " ");
				}
				System.out.println("");
			}
		}else{
			throw new MatrizVaciaEx();
		}
	}

	public static void main(String[] args) {
		Ejercicio5 e5 = new Ejercicio5();
		int[][] m1 = {{1,1,1},{1,1,1}};
		int[][] m2 = {{2,2,2},{2,2,2}};
		int[][] m;
		try{
			m = e5.sumarMatrices(m1, m2);
			try{
				e5.imprimirMatriz(m);
			}catch(MatrizVaciaEx e){
				System.out.println("Ocurrio la excepcion: " + e);
			}
		}catch(MatricesDistintasEx e){
			System.out.println("Ocurrio la excepcion: " + e);
		}
	}

}
