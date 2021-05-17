package TestCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.DepositMoney;

class DepositMoneyTest {
	
	DepositMoney d;
	
	@BeforeEach
	void setUp() throws Exception {
		d = new DepositMoney();
	}
	
	@Test
	void testViewAmount() {
		assertEquals(7400, d.viewAmount("1002"));
	}


//	@Test
//	void testEditRecordDeposit() {
//		d.editRecordDeposit("1002", 100);
//		assertEquals(7400, d.viewAmount("1002"));
//	}

}
