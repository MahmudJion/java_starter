package universitysprotscentreapp.USC_Booking;

import java.util.ArrayList;
import java.util.Scanner;


public final class Exercise {

	public String d = null; // Variable for storing weekends day.
	String exe_name = null; // Variable for storing group exercise name.
	String time_slot = null; // Variable for storing time_slot slot.
	int fees = 0; // Integer variable for storing fees.

	Scanner s = new Scanner(System.in);

	static Exercise grp;

	public Exercise() {

		System.out.println("\t1 Sunday\n");
		System.out.println("\t2 Saturday\n");

		d = s.next();

		System.out.println("\t1 Yoga \n \t2 Zumba \n \t3 Aquacise\n \t4 BoxFit\n \t5 BodyBlitz");
		System.out.println("Enter the name of Group Exercise from the above list");

		exe_name = s.next();

		if (d.equalsIgnoreCase("2") && exe_name.equalsIgnoreCase("2") || exe_name.equalsIgnoreCase("1")
				|| exe_name.equalsIgnoreCase("3") || exe_name.equalsIgnoreCase("4")
				|| exe_name.equalsIgnoreCase("5")) {
			Saturday_Class();
		}

		else if (d.equalsIgnoreCase("1") && exe_name.equalsIgnoreCase("2") || exe_name.equalsIgnoreCase("1")
				|| exe_name.equalsIgnoreCase("3") || exe_name.equalsIgnoreCase("4")
				|| exe_name.equalsIgnoreCase("5")) {

			Sunday_Class();
		}

	}

	private void Saturday_Class() {
		System.out.println("\n\tSelect Time \n\t1.Morning: 8:00-11:00\n\t2.Afternoon: 12:00-3:00\n\t3.Evening: 6:30-9:30\n");

		int slot = 0;
		if(exe_name.equalsIgnoreCase("2")) {
			fees=400;
		}
		else if(exe_name.equalsIgnoreCase("3")) {
			fees=450;
		}
		else if(exe_name.equalsIgnoreCase("1")) {
			fees=500;
		}
		else if(exe_name.equalsIgnoreCase("4")) {
			fees=480;
		}
		else if(exe_name.equalsIgnoreCase("5")) {
			fees=400;
		}

		slot = s.nextInt();

		switch (slot) {
		case 1:
			time_slot = "Morning: 8:00-11:00";
			System.out.println("\tBooking Details:\n\tDay:" + " " + d + "\n" + "\tEnrolled To: " + " " + exe_name
					+ "\n\tShift: " + " " + time_slot + "\n" + "\tFees: " + " " + fees);
			System.out.println("\tBooking Succesful !\n");
			another_booking();

			break;

		case 2:
			time_slot = "Afternoon: 12:00-3:00";
			System.out.println("\tBooking Details:\n\tDay:" + " " + d + "\n" + "\tEnrolled To: " + " " + exe_name + "\n\tSlot: "
					+ " " + time_slot + "\n" + "\tFees: " + " " + fees);
			System.out.println("\tBooking Succesful !\n");
			another_booking();
			break;

		case 3:
			time_slot = "Evening: 6:30-9:30";
			System.out.println("\tBooking Details:\n\tDay:" + " " + d + "\n" + "\tEnrolled To: " + " " + exe_name + "\n\tSlot: "
					+ " " + time_slot + "\n" + "\tFees: " + " " + fees);
			System.out.println("\tBooking Succesful !\n");
			another_booking();
			break;
		default:
			System.out.println("\tInvalid Input\nProvide a valid one\n");
			break;
		}

	}

	private void Sunday_Class() {
		System.out.println("\nSelect Time Slot\n1.Morning: 8:00-11:00\n2.Afternoon: 12:00-3:00\n3.Evening: 6:30-9:30\n");

		int slot = 0;

		slot = s.nextInt();
		if(exe_name.equalsIgnoreCase("2")) {
			fees=400;
		}
		else if(exe_name.equalsIgnoreCase("3")) {
			fees=450;
		}
		else if(exe_name.equalsIgnoreCase("1")) {
			fees=500;
		}
		else if(exe_name.equalsIgnoreCase("4")) {
			fees=480;
		}
		else if(exe_name.equalsIgnoreCase("5")) {
			fees=400;
		}
		switch (slot) {
		case 1:
			time_slot = "Morning: 8:00-11:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name
					+ "\nShift: " + " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;

		case 2:
			time_slot = "Afternoon: 12:00-3:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;

		case 3:
			time_slot = "Evening: 6:30-9:30";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Succesful !\n");
			another_booking();
			break;
		default:
			System.out.println("Invalid Input\nProvide a valid one");
			break;
		}

	}

	private void another_booking() {

		String ch = null;
		System.out.println("\t Book another Exercise ???\nPress y for Yes\nPress n for No\n");
		ch = s.next();

		switch (ch) {
		case "y":
			grp = new Exercise();
			break;
		case "n":
			break;
		default:
			System.out.println("\tInvalid Choice");
			break;
		}
	}

	public void bookingList() {
		ArrayList<String> lt = new ArrayList<>(); // STRING ARRAY LIST FOR STORING BOOKING//
		lt.add("Day: " + " " + d);
		lt.add("Enrolled Class: " + " " + exe_name);
		lt.add("Time Slot: " + " " + time_slot);
		lt.add("Fees: " + " " + fees);
		//for-each loop for traversing the list//
		lt.forEach((a) -> {
			System.out.println(a + "\n");
		});

	}
}
