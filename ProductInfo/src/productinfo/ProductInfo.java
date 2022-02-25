/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductInfo.src.productinfo;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ProductInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the name:");
            String name = scanner.nextLine();

            System.out.println("Please enter the price:");
            float price = scanner.nextFloat();

            System.out.println("Please enter the quantity:");
            int quantity = scanner.nextInt();

            System.out.println("Product Name : " +name);
            float total = (float) (price * quantity * 1.2);
            System.out.printf("Total cost: ¡ê%.2f %n", total);
        }
    }

}
