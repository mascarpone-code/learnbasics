package _04.rowsum;

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в ряду: ");
        int numbersCount = scanner.nextInt();

        int i = 1;
        int numbersSum = 0;

        while (i <= numbersCount) {
            numbersSum -= i % 2 == 0 ? i * i : -i * i;
            i++;
        }

        System.out.println("Сумма чисел в ряду равна: " + numbersSum);
    }
}
