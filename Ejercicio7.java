import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
	
	/**
	 * El usuario debe adivinar un numero en el rango de 0 y 100.
	 *  En caso de no querer seguir jugando, debe ingresar el "*".
	 */
	public void adivinarNumero() {
		Scanner scn = new Scanner(System.in);
		String entrada;
		int intentos = 1;
		int numAdivinar = this.generarNumero(100);
		System.out.println(numAdivinar);
		while (true) {
			System.out.print("Ingrese un numero: ");
			entrada = scn.nextLine();
			if (entrada.equals("*")) {
				System.out.println("Saliendo...");
				break;
			}else if(Integer.parseInt(entrada) == numAdivinar){
				System.out.println("Ganaste!. Te llevo " + intentos + " intentos");
				break;
			}else if(Integer.parseInt(entrada) < 0 || Integer.parseInt(entrada) > 100){
				System.out.println("<<El numero ingresado debe estar entre 0 y 100>>");
			}
			intentos++;
		}
		scn.close();
	}

	/**
	 * Genera un numero dentro de un rango [0-limite]
	 * @param limite
	 * @return
	 */
	private int generarNumero(int limite) {
		return (int) ((Math.random() * limite) + 1);
	}

	public static void main(String[] args) {
		new Ejercicio7().adivinarNumero();
	}

}
