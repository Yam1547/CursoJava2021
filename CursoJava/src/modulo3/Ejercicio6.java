package modulo3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese el curso: ");
		
		Scanner sc = new Scanner(System.in);
		int puesto = sc.nextInt();
		
		
		
		if (puesto == 0) {
			System.out.println("Jardín de infantes");
		} 

		else if (puesto >= 1 && puesto <= 6) {
			
			System.out.println("Primaria");
		}
		
		else {
			
			System.out.println("Secundaria");
		}
		
		
	}

}
