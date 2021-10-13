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
		//Puedo utilizar el método estático 'Get instance'. Es un métofo que puedo utilizar sin necesidad
		//de crear un objeto
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sdf = new SimpleDateFormat ("EEEEEEEEEE dd-MM-yyyy- HH:mm:ss");
		System.out.println("Hoy es " + fechaHoy);
		System.out.println("Hoy es " + sdf.format(fechaHoy));
		System.out.println("El mes del día de hoy " + cal.get(Calendar.DATE));
		System.out.println("El mes del día de hoy " + (cal.get(Calendar.MONTH)+ 1));
		System.out.println("El mes del día de hoy " + cal.get(Calendar.YEAR));
		
		//Si quiero saber el día de hoy
		
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
			System.out.println("Hoy es Miércoles");
			break;
		case Calendar.THURSDAY:
			System.out.println("Hoy es Jueves");
			break;
		case Calendar.FRIDAY:
			System.out.println("Hoy es Viernes");
			break;
		case Calendar.SATURDAY:
			System.out.println("Hoy es Sábado");
			break;
		
			
		default:
			break;
			
			
		}
		
		//También puedo hacer operaciones
		
		System.out.println("La fecha de hoy más 10 días");
		cal.add(Calendar.DATE, 10);
		System.out.println("La fecha de hoy más 10 días es " + sdf.format(cal.getTime()));
		System.out.println("Y ahora... 3 meses más");
		cal.add(Calendar.DATE, 90);
		System.out.println("Y ahora... 3 meses más " + sdf.format(cal.getTime()));		
		
	}

}
