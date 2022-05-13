package universitysprotscentreapp.TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import universitysprotscentreapp.USC_Booking.Exercise;

class TESTGrpExcercise {

	@Test
	//Test case for Saturday_Class method
	void testSaturday_Class() {
		Exercise grp =new Exercise();
        String expected =" ";
        String actual=grp.d;

        assertEquals(expected, actual);
    }
	@Test
	//Test case for Saturday_Class method
	void testSunday_Class() {
		Exercise grp =new Exercise();
        String expected =" ";
        String actual=grp.d;

        assertEquals(expected, actual);
    }

}
