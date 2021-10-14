package util.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import util.DateUtil;

class DateUtilTest {
	//lote de pruebas
	Date fechaCumple;
	
	//Antes de cada prueba
	@Before
	public void setUp() throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.set(1989, Calendar.JUNE, 15);
		fechaCumple = cal.getTime();
		
	}
	
	//Después de cada  prueba
	@After
	public void tearDown() throws Exception{
		fechaCumple = null;
		
	}
	

	@Test
	void testGetAnio() {
		assertEquals(1989, DateUtil.getAnio(fechaCumple));
		
	}

}
