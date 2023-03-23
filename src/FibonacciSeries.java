import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        System.out.println("Enter the input number");

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        int firstFibonacciNumber = 0, secondFibonacciNumber = 1, nextFibonacciNumber;

        for (int iterator = 0; iterator < inputNumber; iterator++)
        {
            System.out.println(firstFibonacciNumber);
            nextFibonacciNumber = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = nextFibonacciNumber;
        }
    }
}