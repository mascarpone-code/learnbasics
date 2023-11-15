package _04.tennumbersinrowhard;

import java.util.Scanner;

public class TenNumbersInRowHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите последнее число: ");
        int lastNumber = scanner.nextInt();

        System.out.print("Введите количество чисел в строке: ");
        int numbersInLineCount = scanner.nextInt();

        int currentNumbersInLineCount = 0;
        int i = firstNumber;

        while (i <= lastNumber) {
            System.out.printf("%4d", i);
            ++currentNumbersInLineCount;

            if (currentNumbersInLineCount == numbersInLineCount) {
                System.out.println();

                currentNumbersInLineCount = 0;
            }

            ++i;
        }
    }
}
