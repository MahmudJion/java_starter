import java.util.Scanner;
class Main {

  public static void main(String[] args) {

    try (Scanner reader = new Scanner(System.in)) {
        System.out.println("Enter two numbers");
        int first = reader.nextInt();
        int second = reader.nextInt();

        int sum = first + second;
        System.out.println("The sum is: " + sum);
    }
  }
}