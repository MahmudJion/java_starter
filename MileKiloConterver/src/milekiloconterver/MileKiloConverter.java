/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milekiloconterver;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class MileKiloConterver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enter distance in miles:");
        try (Scanner s = new Scanner(System.in)) {
            double distanceInMiles = s.nextDouble();

            System.out.println(distanceInMiles + " miles = " + milesTokm(distanceInMiles) + " km");

            System.out.print("Enter distance in km:");
            double distanceInKm = s.nextDouble();

            System.out.println(distanceInKm + " km = " + kmTomiles(distanceInKm) + " miles");
            s.close();
        }
    }
    
    private static double milesTokm(double distanceInMiles) {
        return distanceInMiles * 1.60934;
    }

    private static double kmTomiles(double distanceInKm) {
        return distanceInKm * 0.621371;
    }
    
}
