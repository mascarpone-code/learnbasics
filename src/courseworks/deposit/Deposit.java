package courseworks.deposit;

import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму первоначального вклада: ");
        double initialDeposit = scanner.nextDouble();

        System.out.print("Введите срок вклада в месяцах: ");
        int monthsAmount = scanner.nextInt();

        System.out.print("Введите ставку % годовых: ");
        double interestRate = scanner.nextDouble();

        double finalDeposit = initialDeposit;
        final int monthsInYearCount = 12;
        final int hundredPercent = 100;
        double depositMonthlyIncreaseRatio = interestRate / monthsInYearCount / hundredPercent;

        for (int i = 1; i <= monthsAmount; ++i) {
            finalDeposit += finalDeposit * depositMonthlyIncreaseRatio;
        }

        double profit = finalDeposit - initialDeposit;

        System.out.printf("Выплата по окончании срока вклада составит %.2f рублей.%n", finalDeposit);
        System.out.printf("Прибыль по вкладу составит %.2f рублей.", profit);
    }
}
