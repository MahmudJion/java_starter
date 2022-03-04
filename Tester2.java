/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hc18aau
 */
public class Tester2 {
    public static void main(String[] args)
    {
        StockItem product1 = new StockItem("Baked beans 415g", 65, 15);
        StockItem product2 = new StockItem("Eggs (box of 6)", 175, 10);
        StockItem product3 = new StockItem("Bread", 89, 7);
        product2.setPrice(99);
        product1.doDelivery(10);
        product3.doSale(3);
        product1.printReport();
        product2.printReport();
        product3.printReport();
        
    }
}
