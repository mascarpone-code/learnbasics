package _04.numberdigits;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int allDigitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        int i = number;

        while (i > 0) {
            int currentDigit = i % 10;
            allDigitsSum += currentDigit;

            if (currentDigit % 2 != 0) {
                oddDigitsSum += currentDigit;
            }

            if (currentDigit > maxDigit) {
                maxDigit = currentDigit;
            }

            i /= 10;
        }

        System.out.println("Сумма всех цифр: " + allDigitsSum);
        System.out.println("Сумма нечётных цифр: " + oddDigitsSum);
        System.out.println("Максимальная цифра: " + maxDigit);
    }
}