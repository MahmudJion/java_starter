import java.util.Scanner;
class Main {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int first = reader.nextInt();
    int second = reader.nextInt();

    System.out.println(first + " " + second);

    int sum = first + second;
    System.out.println("The sum is: " + sum);
  }
}