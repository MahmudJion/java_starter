package printmultiple;
import java.util.Scanner;

public class PrintMultiple {

    /**
     * @param args the command line arguments
     */

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        printMultiple("Hello", 5);
        printMultiple("World", -1);
        printMultiple("Love", 1);
    }

    static void printMultiple(String str, int num){
       while(num > 0){
         System.out.print(str+" ");
         num--;
        }
    }

}
