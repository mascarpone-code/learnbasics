package courseworks.fibonaccinumber;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс числа Фибоначчи: ");
        int indexOfRequiredFibonacciNumber = scanner.nextInt();

        int number2 = 1;
        int requiredFibonacciNumber = 0;
        int i = 1;

        while (i <= indexOfRequiredFibonacciNumber) {
            int number1 = number2;
            number2 = requiredFibonacciNumber;
            requiredFibonacciNumber = number1 + number2;

            ++i;
        }

        System.out.println("Число Фибоначчи с таким индексом: " + requiredFibonacciNumber);
    }
}
