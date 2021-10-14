package util;

import java.util.Calendar;
import java.util.Date;

/**
 * Esta clase tiene métodos vinculados al manejo de fechas, ofreciendo un
 * conjunto de serv.
 * @author Yam1589
 *
 */

public class DateUtil {
	
	
	//Este método devuelve el año de la fecha que se envía por parámetro
	//@param pFecha corresponde al parámetro donde se envía la fecha
	//Return devuelve valor tipo int
	public static int getAnio(Date pFecha ) {;
	Calendar cal = Calendar.getInstance();
	cal.setTime(pFecha);
	
	return cal.get(Calendar.YEAR);
}




}