import java.util.Scanner;

public class Result {

    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter number:");

            int mark = reader.nextInt();
            if(mark >= 50)
            System.out.println("The student has passed.");
            else
            System.out.println("The student has failed.");
        }

    }
}