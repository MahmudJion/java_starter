/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addnumbers;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class AddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter two numbers");
            int first = reader.nextInt();
            int second = reader.nextInt();

            int sum = first + second;
            System.out.println("The sum is: " + sum);
        }

    }

}
