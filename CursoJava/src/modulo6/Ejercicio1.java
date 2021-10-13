package modulo6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Presentar fechas
		Date fechaHoy = new Date();
		
		//La otra clase para manejar fechas: Calendar
		//Como es clase abstracta, no puedo instanciarla. Es decir, crear objetos
		//Puedo utilizar el m�todo est�tico 'Get instance'. Es un m�tofo que puedo utilizar sin necesidad
		//de crear un objeto
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat ("EEEEEEEEEE dd-MM-yyyy- HH:mm:ss");
		System.out.println("Hoy es " + fechaHoy);
		System.out.println("Hoy es " + sdf.format(fechaHoy));
		System.out.println("El mes del d�a de hoy " + cal.get(Calendar.DATE));
		System.out.println("El mes del d�a de hoy " + (cal.get(Calendar.MONTH)+ 1));
		System.out.println("El mes del d�a de hoy " + cal.get(Calendar.YEAR));
		
		//Si quiero saber el d�a de hoy
		
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case Calendar.SUNDAY:
			System.out.println("Hoy es Domingo");
			break;
		case Calendar.MONDAY:
			System.out.println("Hoy es Lunes");
			break;
		case Calendar.TUESDAY:
			System.out.println("Hoy es Martes");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("Hoy es Mi�rcoles");
			break;
		case Calendar.THURSDAY:
			System.out.println("Hoy es Jueves");
			break;
		case Calendar.FRIDAY:
			System.out.println("Hoy es Viernes");
			break;
		case Calendar.SATURDAY:
			System.out.println("Hoy es S�bado");
			break;
		
			
		default:
			break;
			
			
		}
		
		//Tambi�n puedo hacer operaciones
		
		System.out.println("La fecha de hoy m�s 10 d�as");
		cal.add(Calendar.DATE, 10);
		System.out.println("La fecha de hoy m�s 10 d�as es " + sdf.format(cal.getTime()));
		System.out.println("Y ahora... 3 meses m�s");
		cal.add(Calendar.DATE, 90);
		System.out.println("Y ahora... 3 meses m�s " + sdf.format(cal.getTime()));		
		
	}

}
