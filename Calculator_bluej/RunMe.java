package Calculator_bluej;


/**
 * Write a description of class RunMe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RunMe
{
    public static void main(String[] abc)
    {
        System.out.println("\f");
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter first Number: ");
            System.out.println("Enter Second Number: ");

            int x= reader.nextInt();
            //get the firstNumber from the user
            int y= reader.nextInt();
            //get the secondNumber from the user

            Calculator c1 = new Calculator();
            int z = c1.add(x, y);
            System.out.println("Total Number is " + z);
        }


    }
}
