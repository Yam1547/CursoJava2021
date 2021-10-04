package modulo2;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Ejercicio 2
		   byte bmin = Byte.MIN_VALUE;
		   byte bmax = Byte.MAX_VALUE;
		   // reemplazar el 0 por el valor que corresponda en todos los caso
		   short smin = (short) (Short.MIN_VALUE -1);
		   short smax = Short.MAX_VALUE;
		   int imax = Integer.MAX_VALUE;
		   int imin = Integer.MIN_VALUE;
		   long lmin = Long.MIN_VALUE -1; //Si hago esto "da la vuelta", con byte y short a menos que castee no funciona
		   long lmax = Long.MAX_VALUE;
		   
		   System.out.println("tipo\tminimo\tmaximo");
		   System.out.println("....\t......\t......");
		   System.out.println("\nbyte\t" + bmin + "\t" + bmax);
		   System.out.println("\nshort\t" + smin + "\t" + smax);
		   System.out.println("\nint\t" + imin + "\t" + imax);
		   System.out.println("\nlong\t" + lmin + "\t" + lmax);
		
		
		
	}

}
