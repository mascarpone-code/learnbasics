package _03.maxmin;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе целое число: ");
        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println("Наибольшее число: " + number1 + ". Наименьшее: " + number2);
        } else {
            System.out.println("Наибольшее число: " + number2 + ". Наименьшее: " + number1);
        }

        int max = (number1 > number2) ? number1 : number2;
        int min = (number1 < number2) ? number1 : number2;

        System.out.println("Наибольшее число: " + max + ". Наименьшее: " + min);
    }
}
