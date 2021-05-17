package TestCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.DeleteCustomer;

class DeleteCustomerTest {
	
	DeleteCustomer dc;
	
	@BeforeEach
	void setUp() throws Exception {
		dc = new DeleteCustomer();
	}

	@Test
	void testDeleteRecord() {
		assertEquals(true, dc.deleteRecord(""));
	}

}
