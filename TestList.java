public class TestList {
    
    public static void main(String[] args)
    {
        StockList stList = new StockList();

        stList.addStockItem(stList.createNewStockItem("Pasta", 12, 100));
        stList.addStockItem(stList.createNewStockItem("Rice", 10, 50));
        stList.addStockItem(stList.createNewStockItem("Noodles", 22, 10));
        stList.addStockItem(stList.createNewStockItem("Butter", 40, 75));
        System.out.println("start");
        System.out.println(stList.noOfStockItems());
        System.out.println("using showAllItems");
        stList.showAllItems();
        System.out.println("using getAllItems");
        System.out.print(stList.getAllItems());
        stList.removeItem(2);
        System.out.println("index 2 element is removed");
        System.out.println("using showAllItems");
        stList.showAllItems();
        System.out.println("using getAllItems");
        System.out.println(stList.getAllItems());
        System.out.println("Index 2's description:");
        System.out.println(stList.getItem(2).getDescription());
        System.out.println("Butter stock info:");
        System.out.println(stList.getItem("Butter").toString());
        System.out.println("done");
    }
}
