package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import USC_Booking.Monthly_Winner_Class;

class TESTChampionClass {

	@Test
	void testChampionClass() {
		Monthly_Winner_Class cc = new Monthly_Winner_Class();
		int exp =0; //Expected
		int act=cc.income;
		assertEquals(exp,act);
	}
}