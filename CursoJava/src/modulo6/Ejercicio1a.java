package modulo6;

public class Ejercicio1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "Validación de espacios y números";
		String resultado = "No contiene nímeros";
		
		for (int i = 0; i < texto.length(); i++) {
			boolean isdigit = Character.isDigit(texto.charAt(i));
			if ( isdigit == true) resultado = "Contiene Números";
		}
		
		System.out.println(resultado);


	}

}
