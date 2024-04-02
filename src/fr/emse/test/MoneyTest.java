package fr.emse.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MoneyTest {

	@Test
	public void testSimpleAdd() {
		Money m12CHF = new Money(12,"CHF");
		Money m14CHF = new Money(14,"CHF");
		
		assertTrue(!m12CHF.equals(null));
		assertEquals(m12CHF,m12CHF);
		assertEquals(m12CHF,new Money(12,"CHF"));
		assertTrue(!m12CHF.equals(m14CHF));
	}

}
