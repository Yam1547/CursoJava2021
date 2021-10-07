package modulo3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		float i = 0;
//		float j = i/0;
//		
//		System.out.println("i=" + i);
//		System.out.println("i=" + j);

		System.out.println("Ingrese una nota1...");
		
		//Scanner es la clase, sc es el objeto
		
		Scanner sc = new Scanner(System.in);
		float nota1 = sc.nextFloat();
		
		System.out.println("Ingrese una nota2...");
		float nota2 = sc.nextFloat();
		
		System.out.println("Ingrese una nota3...");
		float nota3 = sc.nextFloat();
		
		float promedio =(nota1 + nota2 + nota3)/3;
		
		if (promedio >= 7)
			System.out.println("Aprobaste...con:" + promedio);
		
		else
			System.out.println("Muelte ... :( " + promedio);
		
		
		
	
	}

}
