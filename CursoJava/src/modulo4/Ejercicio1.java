package modulo4;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int loteria[] = new int[100];
		for(int i = 0 ;  i<100 ; i++)
			loteria[i]=(int)(Math.random()*1000%100);
		
		System.out.println("Los 100 números son");
		for(int i=0; i<100; i++)
			System.out.println("Lotería[" + i + "]=" + loteria[i]);
		
	
		System.out.println("Los 10 primeros números son");
		for(int i=0; i<10; i++)
			System.out.println("Lotería[" + i + "]=" + loteria[i]);
		
		
	 	char teclado [][]= { { '1', '2', '3', 'A'},
	 			             { '4', '5', '6', 'B'},
	 			             { '7', '8', '9', 'C'},
	 			             { '*', '0', '#', 'D'},
	 	                    };
	 	
	
	
		
		System.out.println("Muestro el teclado");
		System.out.println("Cantidad de filas=" + teclado.length);
		System.out.println("Cantidad de columnas=" + teclado[0].length);
		System.out.println("\n\nMostrar el teclado completo\n");
		
		for (int fila=0;fila<teclado.length; fila++){
			for(int col = 0; col < teclado[fila].length; col++)
				System.out.print("teclado["+fila + "]["+ col + "]=" + teclado[fila][col] + " , ");
			System.out.println();
		}

			
		
		
		
		
		

	}

}
