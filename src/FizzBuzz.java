import java.util.Scanner;

public class FizzBuzz {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");

        final int number = scanner.nextInt();
        scanner.close();

        if (number % 15 == 0)
            System.out.print("FizzBuzz");
        else if (number % 5 == 0)
            System.out.print("Fizz");
        else if (number % 3 == 0)
            System.out.print("Buzz");
        else
            System.out.print(number);
    }

}
