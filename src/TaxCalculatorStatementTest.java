
import static org.junit.Assert.*;

import org.junit.Test;

public class TaxCalculatorStatementTest {
  
	@Test
	public void checkValidityTest1() {
		Person p=new Person(-1,4);
		assertEquals(false, p.checkValidity());
		
		//fail("Not yet implemented");
	}
	@Test
	public void checkValidityTest2() {
		Person p=new Person(20000,4);
		assertEquals(true, p.checkValidity());
		
		//fail("Not yet implemented");
	}
	@Test
	public void testCheckFamilyMembers1() {
		Person p=new Person(20000,4);
		TaxCalculator t=new TaxCalculator();
		assertEquals(0, t.checkFamilyMembers(p));
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testCheckFamilyMembers2() {
		Person p=new Person(20000,0);
		TaxCalculator t=new TaxCalculator();
		assertEquals(0, t.checkFamilyMembers(p));
		
		//fail("Not yet implemented");
	}

	@Test
	public void testCalculateTax1() {
		Person p=new Person(5000,0);
		TaxCalculator t=new TaxCalculator();
		assertEquals(0, t.calculateTax(p));
	//	fail("Not yet implemented");
	}
	@Test
	public void testCalculateTax2() {
		Person p=new Person(40000,3);
		TaxCalculator t=new TaxCalculator();
		assertEquals(0, t.calculateTax(p));
	//	fail("Not yet implemented");
	}
	@Test
	public void testCalculateTax3() {
		Person p=new Person(60000,4);
		TaxCalculator t=new TaxCalculator();
		assertEquals(0, t.calculateTax(p));
	//	fail("Not yet implemented");
	}

	@Test
	public void testCheckNegetiveTax1() {
		TaxCalculator t=new TaxCalculator(1000);
		assertEquals(true, t.checkNegetiveTax());
		
		//	fail("Not yet implemented");
	}

	@Test
	public void testCheckNegetiveTax2() {
		TaxCalculator t=new TaxCalculator(-1000);
		assertEquals(false, t.checkNegetiveTax());
		
		//	fail("Not yet implemented");
	}

}
