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
	
//	public static boolean isFinDeSemana(Date fecha) {
//
//	Calendar cal = Calendar.getInstance();// factory, singleton
//
//	cal.setTime(fecha);
//
//	if (fecha == "Sábado" && "Domingo")
//
//		return cal.get(Calendar.DAY_OF_WEEK, "");
//}
	
	
	
	
	
	


}