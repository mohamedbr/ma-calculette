import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class jUnitTestCalculette {
	private Calculatrice cal;
	@Before
	public void unitcal(){
		this.cal=new Calculatrice();
	}
	@Test
	public void testResultat() {
		assertEquals(0, cal.resultat());
	}
	
	@Test
	public void testResultat1(){
	assertEquals(1, cal.click(1).resultat());
}
	@Test
	public void testUnplusRetourneUn(){
		assertEquals(1, cal.click(1).click("+").resultat());
	}
	
	@Test
	public void testUnplusdeuxRetourneDeux(){
		assertEquals(2, cal.click(1).click("+").click(2).resultat());
	}
	
	@Test
	public void testUnplusDeuxplusTroisRetourneTrois(){
		assertEquals(3,cal.click(1).click("+").click(2).click("+").click(3).resultat());
	}

	@Test
	public void testUnplusDeuxEgalRetourne3(){
		assertEquals(3,cal.click(1).click("+").click(2).click("=").resultat());
	}
	@Test
	public void testDeuxMoinsUnRetourne1(){
		assertEquals(1,cal.click(2).click("-").click(1).resultat());
	}
	@Test
	public void testDeuxMoinsUnEgalRetourne1(){
		assertEquals(1,cal.click(2).click("-").click(1).click("=").resultat());
	}
	@Test
	public void testCinqMoinsDeuxEgalRetourne3(){
		assertEquals(3,cal.click(5).click("-").click(2).click("=").resultat());
	}
	@Test
	public void testUnDeuxRetourne12(){
		assertEquals(12,cal.click(1).click(2).resultat());
	}
	@Test
	public void testUnQuatre(){
		assertEquals(14,cal.click(1).click(4).resultat());
	}
	@Test
	public void testDeuxTroisPlus5(){
		assertEquals(28,cal.click(2).click(3).click("+").click(5).click("=").resultat());
	}
	@Test
	public void testUnplusQuatorze(){
		assertEquals(15,cal.click(1).click(4).click("+").click(1).click("=").resultat());
	}
	@Test
	public void test10Moins7(){
		assertEquals(3,cal.click(1).click(0).click("-").click(7).click("=").resultat());
	}
	@Test
	public void test10Multipl7(){
		assertEquals(70,cal.click(1).click(0).click("*").click(7).click("=").resultat());
	}
	@Test
	public void test4diviser2(){
		assertEquals(2,cal.click(4).click("/").click(2).click("=").resultat());
	}
	@Test
	public void test4diviser0(){
		assertEquals(-1,cal.click(4).click("/").click(0).click("=").resultat());
	}
	@Test
	public void test4diviser7(){
		assertEquals(0,cal.click(4).click("/").click(7).click("=").resultat());
	}
	@Test
	public void test4Plus7Plus9(){
		Calculator c=new Calculator();
		c.click(4);c.clickPlus();c.click(7);c.clickPlus();c.click(9);
		assertEquals(20,c.getResultat());
	}
	@Test
	public void test10Moins7Moins2(){
		Calculator c=new Calculator();
		c.click(10);c.clickMoins();c.click(7);c.clickMoins();c.click(2);
		assertEquals(1,c.getResultat());
	}
}
