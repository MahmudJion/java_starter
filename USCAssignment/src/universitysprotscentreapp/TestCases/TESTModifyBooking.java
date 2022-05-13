package universitysprotscentreapp.TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import universitysprotscentreapp.USC_Booking.U_Booking;

class TESTModifyBooking {

	@Test
	//Test case for Saturday_Class method
	void testSaturday_Class() {
		U_Booking modify =new U_Booking();
        String expected =" ";
        String actual=modify.d;

        assertEquals(expected, actual);
    }
	@Test
	//Test case for Saturday_Class method
	void testSunday_Class() {
		U_Booking modify =new U_Booking();
        String expected =" ";
        String actual=modify.d;

        assertEquals(expected, actual);
    }

}
