package universitysprotscentreapp.USC_Booking;

import java.util.Scanner;


public class Monthly_Winner_Class {
	static Monthly_Winner_Class cc;
	public int income=0;

		public Monthly_Winner_Class() {
			int month=0; //Integer variable for taking month input
			System.out.println("\t Select Moth For Report\n");
			System.out.println("\t1. Jan\n\t2. Feb\n\t3. Mar\n\t4. Apr\n\t5. May\n\t6. Jun\n\t7. Jul\n\t8. Aug\n\t9. Sept\n\t10. Oct\n\t11. Nov\n\t12. Dec\n");
			try (Scanner sc = new Scanner(System.in)) {
                month=sc.nextInt();
            }
			switch(month) {
			case 1:
				System.out.println("\tMonth: January");
				System.out.println("\t Class of the Month");
				System.out.println("\tBodyBlitz: "+"$"+4400+" Yoga: "+"$"+4000);
				income=4400+4000;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 2:
				System.out.println("\tMonth: February");
				System.out.println("\t Class of the Month");
				System.out.println("\tYoga: "+"$"+4000+" Zumba: "+"$"+4800);
				income=4000+4800;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 3:
				System.out.println("\tMonth: March");
				System.out.println("\t Class of the Month");
				System.out.println("\tAquacise: "+"$"+5400+" Box Fit: "+"$"+5280);
				income=5400+5280;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 4:
				System.out.println("\tMonth: April");
				System.out.println("\t Class of the Month");
				System.out.println("\tZumba: "+"$"+6000+" Yoga: "+"$"+4500);
				income=6000+4500;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 5:
				System.out.println("\tMonth: May");
				System.out.println("\t Class of the Month");
				System.out.println("\tAquacise: "+"$"+7650+" Box Fit: "+"$"+5280);
				income=76540+5280;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 6:
				System.out.println("\tMonth: June");
				System.out.println("\t Class of the Month");
				System.out.println("\tBodyBlitz: "+"$"+4400+" Aquacise: "+"$"+4000);
				income=4400+4000;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 7:
				System.out.println("\tMonth: July");
				System.out.println("\t Class of the Month");
				System.out.println("\tYoga: "+"$"+4500+" BodyBlitz: "+"$"+5200);
				income=4500+5200;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 8:
				System.out.println("\tMonth: August");
				System.out.println("\t Class of the Month");
				System.out.println("\tAquacise: "+"$"+5400+" Box Fit: "+"$"+5280);
				income=5400+5280;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 9:
				System.out.println("\tMonth: September");
				System.out.println("\t Class of the Month");
				System.out.println("\tZumba: "+"$"+6000+" Yoga: "+"$"+4500);
				income=6000+4500;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 10:
				System.out.println("\tMonth: October");
				System.out.println("\t Class of the Month");
				System.out.println("\tAquacise: "+"$"+7650+" Box Fit: "+"$"+5280);
				income=76540+5280;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 11:
				System.out.println("\tMonth: November");
				System.out.println("\t Class of the Month");
				System.out.println("\tZumba: "+"$"+6000+" Yoga: "+"$"+4500);
				income=6000+4500;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			case 12:
				System.out.println("\tMonth: December");
				System.out.println("\t Class of the Month");
				System.out.println("\tAquacise: "+"$"+7650+" Box Fit: "+"$"+5280);
				income=76540+5280;
				System.out.println("\tToatl Income from this classes: "+"$"+income);
				break;
			default:
				System.out.println("\tInput not valid\nPlease Provide appropriate input");
				break;
			}

		}

	}

