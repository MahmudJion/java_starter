package ResultUntilInput.src.resultuntilinput;
import java.util.Scanner;

public class ResultUntilInput {

    /**
     * @param args the command line arguments
     */
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        int mark;

        System.out.println("Please enter your mark");
        mark = console.nextInt();
        while (mark != -1) {
            mark = console.nextInt();
        }
        System.out.println("You have entered -1, brilliant");
    }

}
