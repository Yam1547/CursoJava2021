package modulo3;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese una letra:");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		
		
		
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			System.out.println("Es una vocal");
		} 

		else {
			
			System.out.println("Es una consonante");
		}
		
		
	}

}
