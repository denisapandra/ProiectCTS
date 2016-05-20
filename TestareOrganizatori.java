package testare;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Organizator;
public class TestareOrganizatori {

	@Test
	public void testOvertime() {
		Organizator o1 = new Organizator("Ion Popescu",44, "0744320912",900);
		assertTrue(o1.overtime());
	}
	
	@Test
	public void testDisponibilitateLocatie() {
		Organizator o1 = new Organizator("PopescuMaria",44, "0744320912",0);
		assertTrue(o1.disponibilitateLocatie());
	}
	@Test
	public void testDisponibilitateLocatieFalse() {
		Organizator o1 = new Organizator("PopescuMaria",44, "0744320912",900);
		assertFalse(o1.disponibilitateLocatie());
	}
}
