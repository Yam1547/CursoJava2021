package util;

import java.util.Calendar;
import java.util.Date;

/**
 * Esta clase tiene m�todos vinculados al manejo de fechas, ofreciendo un
 * conjunto de serv.
 * @author Yam1589
 *
 */

public class DateUtil {
	
	
	//Este m�todo devuelve el a�o de la fecha que se env�a por par�metro
	//@param pFecha corresponde al par�metro donde se env�a la fecha
	//Return devuelve valor tipo int
	public static int getAnio(Date pFecha ) {;
	Calendar cal = Calendar.getInstance();
	cal.setTime(pFecha);
	
	return cal.get(Calendar.YEAR);
}




}