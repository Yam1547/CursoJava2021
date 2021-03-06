package util;

import java.util.Calendar;
import java.util.Date;

/**
 * Esta clase tiene m?todos vinculados al manejo de fechas, ofreciendo un
 * conjunto de serv.
 * @author Yam1589
 *
 */

public class DateUtil {
	
	
	//Este m?todo devuelve el a?o de la fecha que se env?a por par?metro
	//@param pFecha corresponde al par?metro donde se env?a la fecha
	//Return devuelve valor tipo int
	public static int getAnio(Date fecha ) {
		
	Calendar cal = Calendar.getInstance();//factory, singleton
	
	cal.setTime(fecha);
	
	return cal.get(Calendar.YEAR);
}
	
	public static int getMes(Date fecha ) {
		
	Calendar cal = Calendar.getInstance();//factory, singleton
	
	cal.setTime(fecha);
	
	return cal.get(Calendar.MONTH)+1;
}
	
	public static int getDia(Date fecha ) {
		
	Calendar cal = Calendar.getInstance();//factory, singleton
	
	cal.setTime(fecha);
	
	return cal.get(Calendar.DATE);
}
	
	public static boolean isFinDeSemana(Date fecha){
		
	Calendar cal = Calendar.getInstance(); 
		
	cal.setTime(fecha);
		
	int d = cal.get (Calendar.DAY_OF_WEEK);
		
	if((d == Calendar.SATURDAY) || (d == Calendar.SUNDAY));
		
	return true;
		
	}
	
	//SimpleDateFormat -> recibe una fecha
	// inclusiva, exclusiva
    // int dia = Integer.parseInt( strfecha.subString(0,2))	
    // int mes = Integer.parseInt( strfecha.subString(3,5))	
//	public static boolean isFinDeSemana(Date fecha) {
//

	
	
	
	
	
	


}