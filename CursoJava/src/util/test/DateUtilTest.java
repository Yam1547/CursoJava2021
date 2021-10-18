package util.test;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import util.DateUtil;

public class DateUtilTest {
	
	//lote de pruebas
	Date fechaCumple;
		
	//Junit --> Framework, conjunto de clases, resuelve problemas particulares. Por ej: el testeo
	//Patrón de diseño --> General, para resolver problemas
	
	//Antes de cada prueba
	@Before
	public void setUp() throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.set(1989, Calendar.JUNE, 15);
		fechaCumple = cal.getTime();
	}
	
	//Después de cada  prueba
	@After
	public  void tearDown() throws Exception {
		fechaCumple = null;
	}
	
//	@Test
//	public void testGetAnio1989() {
//		fechaCumple.setYear(1989);
//		assertEquals(1989, DateUtil.getAnio(fechaCumple));
//		
//	}
	
	@Test
	public void testGetAnio() {
		assertEquals(1989, DateUtil.getAnio(fechaCumple));
	}
	
	@Test
	public void testGetMes() {
		assertEquals(6, DateUtil.getMes(fechaCumple));
	}
	

	@Test
	public void testGetDia() {
		assertEquals(15, DateUtil.getDia(fechaCumple));
	}
	
	@Test
	public void testGetFinde() {
		assertEquals( true, DateUtil.isFinDeSemana(fechaCumple));
	}



}
