package universitysprotscentreapp.USC_Booking;

import java.util.Scanner;


public class Main_Menu_Class {

	private static Exercise grp;
    private static Monthly_Report mr;
    public static void MMClass() {

		System.out.println(
				"\tWelcome to the Dashboard\n"+
				 "\t1 Menu \r\n"
	            +"\t2 Attend class Feedback\r\n"
				+"\t3 Booking\r\n"
				+"\t4 Monthly  Report\r\n"
				+"\t5 Winner report\r\n"
				+ "\t6  Exit"
				+"\n Enter Your Choice: ");
		int ch = 0;  //integer variable for choice
		try (Scanner s = new Scanner(System.in)) {
            ch = s.nextInt();
        }
		switch(ch) {

		case 1:
			grp = new Exercise();
			System.out.println("\tWanna Select the an other option\n");
			MMClass();
			break;

		case 2:
                new Student_Reviews();
			System.out.println("\tWanna Select the an other option\n");
			MMClass();

			break;

		case 3:

			try {
			grp.bookingList();
			new U_Booking();
			System.out.println("\tWanna Select the an other option\n");
			MMClass();
			}catch(Exception e) {

				System.out.println("\tNo Booking  Avilable \n");
                MMClass();
			}



			break;
		case 4:
			mr=new Monthly_Report();
			mr.ratinglist();
			System.out.println("\tThank You\n");
			MMClass();
			break;

		case 5:
            System.out.println("\tThank You\n");
			MMClass();
			break;

		case 6:
            MMClass();
			break;
		}


	}
	public static void main(String[] args) {
		MMClass();

	}

}
