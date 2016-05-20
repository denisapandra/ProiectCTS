package testare;

import static org.junit.Assert.*;

import java.util.Vector;

import org.junit.Test;

import clase.Bilet;
import clase.BiletComandat;
import clase.Factura;

public class TestareFactura {

	@Test
	public void testTotalcuTaxe() {
		Bilet b1= new Bilet("Madonna", "A", "Sala Palatului", 280);
		
		BiletComandat bc1 = new BiletComandat(b1,10,2);
		BiletComandat bc2 = new BiletComandat(b1,12,6);
		
		Vector<BiletComandat>bilete = new Vector<BiletComandat>();
		Factura f1 = new Factura("Factura1",bilete);
		f1.adaugaBilet(bc1);
		f1.adaugaBilet(bc2);
		
		double total = f1.getTotalCuTaxe();
		double totalAsteptat = 2332;
		assertEquals("mesaj", totalAsteptat, total,0);
	}
	
	@Test
	public void testTotalFaraTaxe() {
		Bilet b1= new Bilet("AC/DC", "B", "Romexpo", 325);
		
		BiletComandat bc1 = new BiletComandat(b1,10,2); //650
		BiletComandat bc2 = new BiletComandat(b1,12,6);
		
		Vector<BiletComandat>bilete = new Vector<BiletComandat>();
		Factura f1 = new Factura("Factura1",bilete);
		f1.adaugaBilet(bc1);
		f1.adaugaBilet(bc2);
		
		double total = f1.getTotalFaraTaxe();
		double totalAsteptat = 2600;
		assertEquals("mesaj", totalAsteptat, total,0);
	}
	
	@Test
	public void testGetTaxe() {
		Bilet b1= new Bilet("AC/DC", "B", "Romexpo", 325);
		
		BiletComandat bc1 = new BiletComandat(b1,10,2); //670
		BiletComandat bc2 = new BiletComandat(b1,12,6); //2692
		
		Vector<BiletComandat>bilete = new Vector<BiletComandat>();
		Factura f1 = new Factura("Factura1",bilete);
		f1.adaugaBilet(bc1);
		f1.adaugaBilet(bc2);
		
		double taxe = f1.getTaxe();
		double taxeAsteptate =92;
		assertEquals("mesaj",taxeAsteptate,taxe,0);	
	}
	
	@Test
	public void testTotalCategorieCuTaxe() {
		Bilet b1= new Bilet("AC/DC", "B", "Romexpo", 325);
		Bilet b2 = new Bilet("Rihanna", "B", "Arenele Romane",500);
		
		BiletComandat bc1 = new BiletComandat(b1,10,2); 
		BiletComandat bc2 = new BiletComandat(b2,12,4);
		
		Vector<BiletComandat>bilete = new Vector<BiletComandat>();
		Factura f1 = new Factura("Factura1",bilete);
		f1.adaugaBilet(bc1);
		f1.adaugaBilet(bc2);
		double total = f1.getTotalCategorieCuTaxe("B");
		double totalAsteptat =2718;
		assertEquals("mesaj",totalAsteptat,total,0);	
	}
	
	@Test
	public void testNumaraEvenimente() {
		Bilet b1= new Bilet("AC/DC", "B", "Romexpo", 325);
		Bilet b2 = new Bilet("Rihanna", "A", "Arenele Romane",500);
		Bilet b3= new Bilet("Untold", "A", "Romexpo", 325);
		Bilet b4 = new Bilet("Summerwell", "B", "Buftea",280);
		
		
		BiletComandat bc1 = new BiletComandat(b1,10,2); 
		BiletComandat bc2 = new BiletComandat(b2,12,4);
		BiletComandat bc3 = new BiletComandat(b3,20,10);
		BiletComandat bc4 = new BiletComandat(b4,10,6);
		
		Vector<BiletComandat>bilete = new Vector<BiletComandat>();
		Factura f1 = new Factura("Factura1",bilete);
		f1.adaugaBilet(bc1);
		f1.adaugaBilet(bc2);
		f1.adaugaBilet(bc3);
		f1.adaugaBilet(bc4);
		
		double count = f1.numaraEvenimenteLocatie("Romexpo");
		double rezultatAsteptat= 2;
		assertEquals("mesaj",rezultatAsteptat,count,0);	
	}
	
	@Test
	public void testNumaraEvenimenteNotNull() {
		Bilet b1= new Bilet("AC/DC", "B", "Romexpo", 325);
		Bilet b2 = new Bilet("Rihanna", "A", "Arenele Romane",500);
		Bilet b3= new Bilet("Untold", "A", "Romexpo", 325);
		Bilet b4 = new Bilet("Summerwell", "B", "Buftea",280);
		
		
		BiletComandat bc1 = new BiletComandat(b1,10,2); 
		BiletComandat bc2 = new BiletComandat(b2,12,4);
		BiletComandat bc3 = new BiletComandat(b3,20,10);
		BiletComandat bc4 = new BiletComandat(b4,10,6);
		
		Vector<BiletComandat>bilete = new Vector<BiletComandat>();
		Factura f1 = new Factura("Factura1",bilete);
		f1.adaugaBilet(bc1);
		f1.adaugaBilet(bc2);
		f1.adaugaBilet(bc3);
		f1.adaugaBilet(bc4);
		
		assertNotNull(f1.numaraEvenimenteLocatie("Romexpo"));
	}	
}
