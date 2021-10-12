package modulo5;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ingrese un texto a codificar en clave murciélago");
		
		Scanner sc = new Scanner(System.in);
		
		//MURCIELAGO
		//0123456789
		
		String strTextoOriginal = sc.nextLine();
		
		System.out.println("Texto original=" + strTextoOriginal);
		System.out.println("Todo en mayúscula=" + strTextoOriginal.toUpperCase());
		System.out.println("Todo en minúscula=" + strTextoOriginal.toLowerCase());
		System.out.println("Texto original=" + strTextoOriginal);
		
		System.out.println("\n\n\ny la clave murciélago para cuándo?, ahora");
		
		//Llamado on the fly, ...llamar a objetos
		
		String strMurcielago = strTextoOriginal.toLowerCase()
			                                   .replace('m', '0')
			                                   .replace('u', '1')
			                                   .replace('r', '2')
			                                   .replace('c', '3')
			                                   .replace('i', '4')
			                                   .replace('e', '5')
			                                   .replace('l', '6')
			                                   .replace('a', '7')
			                                   .replace('g', '8')
			                                   .replace('o', '9')
											   .toUpperCase();
		
		System.out.println("En clave murciélago=" + strMurcielago);
		
		
		//Recorro el string
		
		for(int i =0; i < strTextoOriginal.length(); i ++)
			System.out.println("posición= " + i  + " char= " + strTextoOriginal.charAt(i));

	}

}
