package universitysprotscentreapp.USC_Booking;

import java.util.ArrayList;
import java.util.Scanner;

public class U_Booking {

	public String d = null; // Variable for storing weekends day.
	String exe_name = null; // Variable for storing group exercise name.
	String time_slot = null; // Variable for storing time_slot slot.
	int fees = 0; // Integer variable for storing fees.
	Scanner s = new Scanner(System.in);

	static U_Booking modify ;

	public U_Booking() {
		System.out.println("Select either Saturday or Sunday\n");
		d = s.next();
		System.out.println("Yoga\nZumba\nAquacise\nBoxFit\nBodyBlitz");
		System.out.println("Enter the name of Group Exercise from the above list");
		exe_name = s.next();

		if (d.equalsIgnoreCase("Saturday") && exe_name.equalsIgnoreCase("zumba") || exe_name.equalsIgnoreCase("yoga")
				|| exe_name.equalsIgnoreCase("Aquacise") || exe_name.equalsIgnoreCase("BoxFit")
				|| exe_name.equalsIgnoreCase("BodyBlitz")) {
			Saturday_Class();
		}

		else if (d.equalsIgnoreCase("Sunday") && exe_name.equalsIgnoreCase("zumba") || exe_name.equalsIgnoreCase("yoga")
				|| exe_name.equalsIgnoreCase("Aquacise") || exe_name.equalsIgnoreCase("BoxFit")
				|| exe_name.equalsIgnoreCase("BodyBlitz")) {

			Sunday_Class();
		}
	}

	private void Saturday_Class() {
		System.out.println("\nSelect Time Slot\n1.Morning: 8:00-11:00\n2.Afternoon: 12:00-3:00\n3.Evening: 6:30-9:30\n");

		int slot = 0;
		slot = s.nextInt();
		if(exe_name.equalsIgnoreCase("zumba")) {
			fees=400;
		}
		else if(exe_name.equalsIgnoreCase("Aquacise")) {
			fees=450;
		}
		else if(exe_name.equalsIgnoreCase("yoga")) {
			fees=500;
		}
		else if(exe_name.equalsIgnoreCase("BoxFit")) {
			fees=480;
		}
		else if(exe_name.equalsIgnoreCase("BodyBlitz")) {
			fees=400;
		}

		switch (slot) {
		case 1:
			time_slot = "Morning: 8:00-11:00";
			//fees = 500;

			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name
					+ "\nShift: " + " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Modify Succesful !\n");
			another_booking();

			break;

		case 2:
			time_slot = "Afternoon: 12:00-3:00";
			//fees = 400;
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Modified !\n");
			another_booking();
			break;

		case 3:
			//fees = 450;
			time_slot = "Evening: 6:30-9:30";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Modified !\n");
			another_booking();
			break;
		default:
			System.out.println("Invalid Input\nEnter a valid option\n");
			break;
		}

	}

	private void Sunday_Class() {
		System.out.println("\nSelect Time Slot\n1.Morning: 8:00-11:00\n2.Afternoon: 12:00-3:00\n3.Evening: 6:30-9:30\n");

		int slot = 0;
		slot = s.nextInt();
		if(exe_name.equalsIgnoreCase("zumba")) {
			fees=400;
		}
		else if(exe_name.equalsIgnoreCase("Aquacise")) {
			fees=450;
		}
		else if(exe_name.equalsIgnoreCase("yoga")) {
			fees=500;
		}
		else if(exe_name.equalsIgnoreCase("BoxFit")) {
			fees=480;
		}
		else if(exe_name.equalsIgnoreCase("BodyBlitz")) {
			fees=400;
		}
		switch (slot) {
		case 1:
			time_slot = "Morning: 8:00-11:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name
					+ "\nShift: " + " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Modified !\n");
			another_booking();
			break;

		case 2:
			time_slot = "Afternoon: 12:00-3:00";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Modified !\n");
			another_booking();
			break;

		case 3:
			time_slot = "Evening: 6:30-9:30";
			System.out.println("Booking Details:\nDay:" + " " + d + "\n" + "Enrolled To: " + " " + exe_name + "\nSlot: "
					+ " " + time_slot + "\n" + "Fees: " + " " + fees);
			System.out.println("Booking Modified !\n");
			another_booking();
			break;
		default:
			System.out.println("Invalid Input\nProvide a valid one");
			break;
		}

	}

	private void another_booking() {
		String ch = null;
		System.out.println("Do you want to book another Exercise class???\nPress y for Yes\nPress n for No\n");
		ch = s.next();
		switch (ch) {
		case "y":
			modify=new U_Booking();
			break;
		case "n":
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
	}

	public void bookingList() {
		ArrayList<String> lt = new ArrayList<>(); // STRING ARRAY LIST FOR STORING BOOKING//
		lt.add("Day: " + " " + d);
		lt.add("Enrolled Class: " + " " + exe_name);
		lt.add("Time Slot: " + " " + time_slot);
		lt.add("Fees: " + " " + fees);
		// Traversing list through for-each loop//
		lt.forEach((a) -> {
			System.out.println(a + "\n");
		});

	}
}
