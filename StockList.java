import java.util.ArrayList;
public class StockList {

    ArrayList<StockItem> warehouse;
    public StockList()
    {
        warehouse = new ArrayList<StockItem>();
    }

    public void addStockItem(StockItem stoItem)
    {
        warehouse.add(stoItem);
    }

    public int noOfStockItems()
    {
        return warehouse.size();
    }

    public void removeItem(int index)
    {
        if(0<=index && index<warehouse.size())
            warehouse.remove(index);
    }

    public void showAllItems()
    {
        for(int index=0;index<warehouse.size();index++)
            System.out.println(warehouse.get(index).toString());
    }

    public String getAllItems()
    {
        String s = "";
        int index = 0;
        while (index < warehouse.size())
        {
            s = s + warehouse.get(index).toString() +"\n";
            //OR  in one line of code ??
            index++;
        }
        return s;
    }

    public StockItem getItem(int index)
    {
        if(0<=index && index<warehouse.size())
            return warehouse.get(index);

        return null;
    }

    public StockItem getItem(String descrp)
    {
        for(int index=0; index<warehouse.size(); index++)
        {
            if(warehouse.get(index).getDescription().equalsIgnoreCase(descrp))
                return warehouse.get(index);
        }
        return null;
    }

    public StockItem createNewStockItem(String desc, double pri, int lev)
    {
        StockItem stoItem = new StockItem(desc, pri, lev);
        return stoItem;
    }
}
