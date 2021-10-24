package modulo3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese un mes: ");
		
		Scanner scnum = new Scanner(System.in);
				
		String mes = scnum.next();
		
		
		    if (mes.equals("Junio")|| mes.equals("Abril") || mes.equals("Septiembre") || mes.equals("Noviembre") ) {
		        System.out.println("El mes de " + mes + " tiene 30 días");
		    } else if((mes.equals("Enero") || mes.equals("Marzo") || mes.equals("Mayo") || mes.equals("Julio")|| mes.equals("Agosto")|| mes.equals("Octubre")|| mes.equals("Diciembre"))) {
		    	System.out.println("El mes de " + mes + " tiene 31 días");
		    } else {
		    	System.out.println("El mes de Febrero tiene 28 días");
		    }
		
	
	
		
		
		
	}
	}


