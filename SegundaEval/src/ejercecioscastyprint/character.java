package ejercecioscastyprint;

import java.util.Scanner;

public class character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un caracter: ");
		char caracter = teclado.next().charAt(0);
		int codigoAscii = caracter;
		System.out.println("Código ASCII de '" + caracter + "' = " + codigoAscii);
		char siguiente = (char) (codigoAscii + 1);
		System.out.println("Siguiente carácter: " + siguiente);
		String mensaje = "El siguiente carácter es " + siguiente;
		System.out.println("Mensaje: " + mensaje);
	}

}
