package modulo5;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto = "Esto es una prueba de la clase string";
		int v = 0;
		int c = 0;
		int e = 0;
		
		for (int h=0; h<texto.length(); h++) {
			switch (texto.charAt(h)) {
				case 'a', 'e', 'i', 'o', 'u': v++;
				break;
			case ' ': e++;
				break;
			default: c++;
			

			};
		}
		System.out.println("Cantidad Total de letras: " + texto.length());
		System.out.println("Vocales: " +v);
		System.out.println("Consonantes: " +c);
		System.out.println("espacios: " +e);

	}

}
