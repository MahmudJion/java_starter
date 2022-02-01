import java.util.Scanner;

public class passed_failed {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number:48");

        int mark = reader.nextInt();
        if(mark >= 50)
        System.out.println("The student has passed.");
        else
        System.out.println("The student has failed.");

    }
}