package TestCode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Model.WithdrawMoney;

class WithdrawMoneyTest {
	
	WithdrawMoney w;
	
	@BeforeEach
	void setUp() throws Exception {
		w = new WithdrawMoney();
	}

	@Test
	void testEditRecordWithdraw() {
		w.editRecordWithdraw("1002", 300);
		assertEquals(7100, w.viewAmount("1002"));
	}

}
