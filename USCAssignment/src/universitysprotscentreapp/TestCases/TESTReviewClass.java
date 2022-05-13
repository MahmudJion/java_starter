package universitysprotscentreapp.TestCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import universitysprotscentreapp.USC_Booking.Student_Reviews;

class TESTReviewClass {

	@Test
	void testReviewClass() {
		Student_Reviews rc =new Student_Reviews();
        String expected =" ";  //Expected
        String actual=rc.reviews_input; //Actual
        assertEquals(expected, actual);
	}
}
