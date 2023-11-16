package courseworks.fibonaccinumber;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс числа Фибоначчи: ");
        int requiredFibonacciNumberIndex = scanner.nextInt();

        int requiredFibonacciNumber = 0;
        int nextFibonacciNumber = 1;
        int i = 1;

        while (i <= requiredFibonacciNumberIndex) {
            int currentFibonacciNumber = nextFibonacciNumber;
            nextFibonacciNumber = requiredFibonacciNumber;
            requiredFibonacciNumber = currentFibonacciNumber + nextFibonacciNumber;

            ++i;
        }

        System.out.println("Число Фибоначчи с таким индексом: " + requiredFibonacciNumber);
    }
}
