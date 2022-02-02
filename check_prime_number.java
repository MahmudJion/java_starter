import java.util.Scanner;
public class check_prime_number {

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
