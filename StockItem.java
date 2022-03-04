/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hc18aau
 */
public class StockItem {
    private String description;
    private int level;
    private double price;
    private Date sellByDate;
    
    public StockItem(String desc, double pri, int lev)
    {
        this.description = desc;
        this.price = pri;
        this.level = lev;
    }
    
    public StockItem(String desc, double pri, int lev, Date sByDate)
    {
        this.description = desc;
        this.price = pri;
        this.level = lev;
        this.sellByDate = sByDate;
    }
    
    public void printReport()
    {
        System.out.println("*******Stock Report *******");
        System.out.println("   Item  :  " + this.description);
        System.out.printf("   Price: %.2fp%n", this.price);
        System.out.printf("  Stock level  : %d%n ", this.level);
        //System.out.println(" Date :" + this.sellByDate.getAsString());    
    }
    
    @Override
    public String toString()
    {
	return "*******Stock Report ******* \n Item: " +this.description+ "\n Price: " +this.price + "\n Stock level : " +this.level;
    }
    
    public void setPrice(double individualPrice)
    {
        this.price = individualPrice;
    }
    
    public void doDelivery(int amount)
    {
        this.level += amount;
        //return this.level;
    }
    
    public void doSale(int amount)
    {
        if(this.level >= amount)     
           this.level -= amount;
        //return this.level;
    }
    
    public int getStockLevel()
    {
        return this.level;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setSellByDate(int d, int m, int y)
    {
       this.sellByDate.setDate(d, m, y);
    }
}