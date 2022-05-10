package universitysprotscentreapp.USC_Booking;

import java.util.Scanner;


public class Student_Reviews {
	static Student_Reviews rc;
	public String reviews_input = null;

	public Student_Reviews() {

		System.out.println("\t Feedback about the class");

		try (Scanner s = new Scanner(System.in)) {
            reviews_input = s.nextLine();

            int rating = 0; // Integer variable for storing rating
            System.out.println("\n \t Ranging from 1 to 5");
            System.out.println("\t1: Very dissatisfied\n\t2: Dissatisfied\n\t3: Ok\n\t4: Satisfied\n\t5: Very Satisfied");
            rating = s.nextInt();
            // Switch expression
            switch (rating) { // Switch case for checking user feedback
            case 1:
            	System.out
            			.println("\tStudents Review:\n" + "\tRating: " + rating + " Very dissatisfied\n" + "\tReview: " + reviews_input);
            	break;
            case 2:
            	System.out.println("\tStudents Review:\n" + "\tRating: " + rating + " Dissatisfied\n" + "\tReview: " + reviews_input);
            	break;
            case 3:
            	System.out.println("\tStudents Review:\n" + "\tRating: " + rating + "Ok\n" + "\tReview: " + reviews_input);
            	break;
            case 4:
            	System.out.println("\tStudents Review:\n" + "\tRating: " + rating + " Satisfied\n" + "\tReview: " + reviews_input);
            	break;
            case 5:
            	System.out.println("\tStudents Review:\n" + "\tRating: " + rating + " Very Satisfied\n" + "\tReview: " + reviews_input);
            	break;
            default:
            	System.out.println("\tEnter Rating from 1 to 5 \n");

            }
        }

	}

}
