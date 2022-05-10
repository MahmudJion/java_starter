package universitysprotscentreapp.USC_Booking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Monthly_Report {
	static Monthly_Report mr;

	public Monthly_Report() {

		System.out.println("Monthly Report: \n");
		System.out.println("First Week");

		System.out.println("Number of Students");
		System.out.println("Saturday");
		System.out.println("Yoga 		: 5");
		System.out.println("Zumba 		: 6");
		System.out.println("Aquacise	: 10");
		System.out.println("Box Bit 	: 4");
		System.out.println("BodyBlitz 	: 11\n");

		System.out.println("Sunday");
		System.out.println("Yoga		: 3");
		System.out.println("Zumba		: 6");
		System.out.println("Aquacise	: 11");
		System.out.println("Box Bit		: 5");
		System.out.println("BodyBlitz 	: 12\n\n");

		System.out.println("Average Rating From Student \n");
		System.out.println("4 Satisfied");
		System.out.println("5 Very Satisfied");
		System.out.println("3 Ok");
		System.out.println("2 Dissatisfied");

		System.out.println("Second Week");

		System.out.println("Saturday");
		System.out.println("Yoga		: 5");
		System.out.println("Zumba		: 6");
		System.out.println("Aquacise	: 10");
		System.out.println("Box Bit 	: 4");
		System.out.println("BodyBlitz 	: 8\n");


		System.out.println("Sunday");
		System.out.println("Youga 		: 8");
		System.out.println("Zumba 		: 6");
		System.out.println("Aquacise	: 5");
		System.out.println("Box Bit 	: 4");
		System.out.println("BodyBlitz 	: 9\n\n");


		System.out.println("Average Rating From Student \n");
		System.out.println("Average Rating From Student \n");
		System.out.println("Satisfied");
		System.out.println("Ok");
		System.out.println("Very Satisfied\n");


		System.out.println("Third Week");

		System.out.println("Saturday");
		System.out.println("Yoga 		: 3");
		System.out.println("Zumba 		: 6");
		System.out.println("Aquacise	: 11");
		System.out.println("Box Bit 	: 2");
		System.out.println("BodyBlitz 	: 7\n");


		System.out.println("Sunday");
		System.out.println("Yoga 		: 2");
		System.out.println("Zumba 		: 6");
		System.out.println("Aquacise 	: 1");
		System.out.println("Box Bit 	: 2");
		System.out.println("BodyBlitz 	: 5\n\n");


		System.out.println("Average Rating From Student \n");

		System.out.println("5 Very Satisfied");
		System.out.println("3 Ok");
		System.out.println("1 Very dissatisfied\n");

		System.out.println("Fourth Week");

		System.out.println("Saturday");
		System.out.println("Youga 		: 6");
		System.out.println("Zumba 		: 5");
		System.out.println("Aquacise 	: 8");
		System.out.println("Box Bit 	: 4");
		System.out.println("BodyBlitz 	: 6\n");


		System.out.println("Sunday");
		System.out.println("Youga 		: 9");
		System.out.println("Zumba 		: 6");
		System.out.println("Aquacise 	: 1");
		System.out.println("Box Bit 	: 2");
		System.out.println("BodyBlitz 	: 8\n\n");


		System.out.println("4 Satisfied");
		System.out.println("3 Ok");

	}
	public void ratinglist(){
		try {
			File f1 = new File("files.txt");
		    try (Scanner read = new Scanner(f1)) {
		    	while (read.hasNextLine()) {
		    		String review = read.nextLine();
		    		System.out.println(review);
		    	}
		    	}
		    } catch (FileNotFoundException ex) {
		      System.out.println("Error Occured.");
		      ex.printStackTrace();
		    }
		    }
}
