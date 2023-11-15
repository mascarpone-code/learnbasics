package courseworks.euclideanalgorithm;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.println("НОД не определён.");
        } else {
            int greatestCommonDivisor = number1;
            int divisionRemainder = number2;

            while (divisionRemainder != 0) {
                int temp = greatestCommonDivisor;
                greatestCommonDivisor = divisionRemainder;
                divisionRemainder = temp % divisionRemainder;
            }

            System.out.println("НОД = " + greatestCommonDivisor);
        }
    }
}
