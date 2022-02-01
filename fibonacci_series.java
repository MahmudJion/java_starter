import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        try (Scanner reader = new Scanner(System.in)) {
            System.out.println("Enter number of term: ");
            System.out.println("Enter first term: ");
            System.out.println("Enter second term: ");

            int n = reader.nextInt();
            int firstTerm = reader.nextInt();
            int secondTerm = reader.nextInt();
            System.out.println("Fibonacci Series till " + n + " terms:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + ", ");

                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}