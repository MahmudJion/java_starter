/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Result.src.result;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Result {

    /**
     * @param args the command line arguments
     */
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
