package modulo5;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String texto = "gcasas1972@gmail.com";
		
		
		System.out.println("Posición de @: " + texto.indexOf('@'));
		System.out.println("Usuario: " + texto.substring(0, texto.indexOf('@')));
		System.out.println("Dominio: " + texto.substring(texto.indexOf('@')+1, texto.length()));

	}

}
