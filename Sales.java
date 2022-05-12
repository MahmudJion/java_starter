
import java.util.Scanner;

public class Sales {

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int eggsWanted;
        StockItem product2 = new StockItem("Eggs (box of 6)", 175, 10);
        System.out.println("How many egges do you want?");
        //eggsWanted = reader.nextInt();
        product2.doSale(reader.nextInt());
        product2.printReport();
    }
}
