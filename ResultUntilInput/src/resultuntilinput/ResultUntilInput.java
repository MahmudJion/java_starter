/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resultuntilinput;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class ResultUntilInput {

    /**
     * @param args the command line arguments
     */
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int mark;

        System.out.println("Please enter your mark");
        mark = console.nextInt();
        while (mark != -1) {
            mark = console.nextInt();
        }
        System.out.println("You have entered -1, brilliant");
    }

}
