import java.util.Scanner;

public class ProductInfo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter the name: ");
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
