/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkprimenumber;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class CheckPrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter your number: ");
            int num = reader.nextInt();

            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {

                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }
    
}
