package KilltoMileConverterUntilInput5times.src.killtomileconverteruntilinput5times;

import java.util.Scanner;

public class KilltoMileConverterUntilInput5times {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            int counter = 0;
            while (counter < 5) {
                System.out.println("Please enter the mileage");
                float mileage = console.nextFloat();
                float kilo = mileage * 8 / 5;
                System.out.printf("Kilometers : %.2f %n", kilo);
            }
        }
    }

}

