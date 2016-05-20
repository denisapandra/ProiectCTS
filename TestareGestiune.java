package testare;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import clase.Bilet;
import clase.Gestiune;

public class TestareGestiune {

	@Test
	public void testCautaBiletNull() {
		
		Gestiune g1 = Gestiune.getInstance();
		ArrayList<Bilet>bilete= new ArrayList<Bilet>();
		Bilet b1= new Bilet("AC/DC", "B", "Romexpo", 325);
		Bilet b2 = new Bilet("Rihanna", "B", "Arenele Romane",500);
		bilete.add(b1);
		bilete.add(b2);
		assertNull(g1.cautaBilet("Rihanna", "A"));
	}
}
