import java.util.HashMap;
import java.util.Map;

public class Ejercicio9 {

	/**
	 * Se muestra la frecuencia de aparicion de los caracteres de una cadenas
	 * 
	 * @param args
	 */
	public Map<Character, Integer> getFrecuencia(String cadena) {
		Map<Character, Integer> frecuencia = new HashMap<Character, Integer>();
		for (int i = 0; i < cadena.length(); i++) {
			char letra = cadena.charAt(i);
			if (frecuencia.containsKey(letra)) {
				frecuencia.replace(letra, frecuencia.get(letra) + 1);
			} else {
				frecuencia.put(letra, 1);
			}
		}
		return frecuencia;
	}

	/**
	 * Imprime un mapa por consola
	 * @param mapa
	 */
	public void imprimirMap(Map<Character, Integer> mapa) {
		for (Character letra : mapa.keySet()) {
			System.out.println(letra + " : " + mapa.get(letra));
		}
	}

	public static void main(String[] args) {
		Ejercicio9 e9 = new Ejercicio9();
		e9.imprimirMap(e9.getFrecuencia("hola como estas"));
	}

}
