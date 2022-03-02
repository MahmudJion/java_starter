/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moduleresult;

import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class ModuleResult {

    /**
     * @param args the command line arguments
     */
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter your mark");
        int mark = console.nextInt();
        if (moduleResult(mark)) {
            System.out.println("The student has passed.");
        } else {
            System.out.println("The student has failed.");
        }
    }

    static boolean moduleResult(int studentMark) {
        if (studentMark >= 50) {
            return true;
        } else {
            return false;
        }
    }

}
