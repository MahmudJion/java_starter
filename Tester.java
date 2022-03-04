/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hc18aau
 */

public class Tester {
    public static void main(String[] args)
    {
        System.out.println("start");
        Date date = new Date(1,10,2018);
        StockItem bob = new StockItem("Baked Beans 415g", 65.0, 10, date);
        bob.printReport();
        //System.out.println(bob.toString());
        bob.setPrice(75.0);
        //System.out.println(bob.toString());
        bob.setSellByDate(01,10,2019);
        bob.printReport();
        bob.doDelivery(10);
        //System.out.println(bob.toString());
        bob.doSale(8);
        
       // System.out.println(bob.toString());
        System.out.println(bob.getStockLevel());
        System.out.println(bob.getDescription());
        System.out.println("done");
    }
}
