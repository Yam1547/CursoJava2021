package modulo6;

public class Ejercicio1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Validaci�n de espacios y n�meros";
		String resultado = "No contiene n�meros";
		
		for (int i = 0; i < texto.length(); i++) {
			boolean isdigit = Character.isDigit(texto.charAt(i));
			if ( isdigit == true) resultado = "Contiene N�meros";
		}
		
		System.out.println(resultado);


	}

}
