package courseworks.nextdate;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число в месяце: ");
        int day = scanner.nextInt();

        System.out.print("Введите номер месяца: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        day++;
        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        if (day > 28) {
            int monthLength = switch (month) {
                case 2 -> isLeapYear ? 29 : 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };

            if (day > monthLength) {
                if (month < 12) {
                    month++;
                } else {
                    year++;
                }

                day -= monthLength;
            }
        }

        String nextDay = day < 10 ? "0" + day : "" + day;
        String nextMonth = month < 10 ? "0" + month : "" + month;

        System.out.printf("Следующая дата %s.%s.%d", nextDay, nextMonth, year);
    }
}
