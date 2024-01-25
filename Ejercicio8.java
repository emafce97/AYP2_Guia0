
public class Ejercicio8 {
	
	/**
	 * recibe una cadena de caracteres y devuelve la cadena que 
	 * resulta de eliminar todas las vocales
	 * @param args
	 */
	public String quitarVocales(String cadena){
		return cadena.replace("a","").replace("e","").replace("i","").replace("o","").replace("u","");
	}
	
    public static String eliminarVocales(String cadena) {
        // Utilizamos expresiones regulares para eliminar las vocales
        return cadena.replaceAll("[aeiouAEIOU]", "");
    }

	public static void main(String[] args) {
		System.out.println(new Ejercicio8().quitarVocales("hola como estas?"));
	}

}
