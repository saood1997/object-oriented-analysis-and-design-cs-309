package pkj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class modelTest {

	@Test
	void testVerify_email_address() {
		model m1 = new model();
		assertTrue(m1.verify_email_address("saood.rahman7@gmail.com"));
	}
	
	@Test
	void testVerify_email_address3() {
		model m1 = new model();
		assertFalse(m1.verify_email_address("saood.rahman7@gmail"));
	}
	
	@Test
	void testVerify_email_address4() {
		model m1 = new model();
		assertFalse(m1.verify_email_address("@"));
	}
	
	@Test
	void testVerify_email_address2() {
		model m1 = new model();
		assertEquals(false,m1.verify_email_address("saood@.com"));
	}
	
	@Test
	void testVerify_email_address5() {
		model m1 = new model();
		assertFalse(m1.verify_email_address("123"));
	}
	
	@Test
	void testVerify_email_address6() {
		model m1 = new model();
		assertFalse(m1.verify_email_address("@.com"));
	}
	
	@Test
	void testVerify_email_address9() {
		model m1 = new model();
		assertEquals(false,m1.verify_email_address("saood@g.com"));
	}
	
	@Test
	void testVerify_email_address7() {
		model m1 = new model();
		assertTrue(m1.verify_email_address("Rahman@hotmail.com"));
	}
	
	@Test
	void testVerify_email_address8() {
		model m1 = new model();
		assertFalse(m1.verify_email_address("Rahman@hotmail@hotmail.com"));
	}
	
	
	

}
