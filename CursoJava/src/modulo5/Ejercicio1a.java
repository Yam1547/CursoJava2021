package modulo5;

public class Ejercicio1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Realizar un programa que cree un objeto String con el contenido �Hola mundo� y mostrar:
//			a. El texto todo en may�sculas
//			b. El texto todo en min�sculas
//			c. Reemplazar la letra �o� por el n�mero 2
		
		
		String saludo = "Hola Mundo";
		
		System.out.println(saludo.toUpperCase());
		System.out.println(saludo.toLowerCase());
		System.out.println(saludo.replace("o", "2"));

	}

}
