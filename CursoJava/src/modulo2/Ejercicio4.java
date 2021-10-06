package modulo2;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b= (byte) (Math.random()*Byte.MAX_VALUE);
		short s=20;
		int i =30;
		long l=40;
		
		int sumabb= b+b;
		int sumabs= b+s;
		int sumabi= b+i;
		int sumaii= i+i;
		long sumasl= s+l;
		
		System.out.println(b=(byte) s);
		//System.out.println(s);
		System.out.println(l=i);
		System.out.println(b=(byte) i);
		System.out.println(s=(short) i);
	}
	

}
