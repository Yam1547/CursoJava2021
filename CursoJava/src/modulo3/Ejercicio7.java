package modulo3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Ingrese el curso: ");
		
		Scanner sc = new Scanner(System.in);
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		
		
		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("El " + valor1 + " es mayor.");
		} 

		else if (valor2 > valor1 && valor2 > valor3) {
			
			System.out.println("El " + valor2 + " es mayor.");
		}
		
		else {
			
			System.out.println("El " + valor3 + " es mayor.");
		}
		
		
		
	}

}
