package _07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начало диапазона: ");
        double from = scanner.nextDouble();

        System.out.print("Введите конец диапазона: ");
        double to = scanner.nextDouble();

        System.out.print("Введите число для проверки: ");
        double number = scanner.nextDouble();

        Range range = new Range(from, to);

        System.out.printf("Длина диапазона равна: %f.%n", range.getLength());
        System.out.println(range.isInside(number) ? "Ваше число в диапазоне." : "Ваше число вне диапазона.");

        range.setFrom(1.6574);
        range.setTo(6.28749);

        System.out.printf("Новые границы диапазона: %f и %f.%n", range.getFrom(), range.getTo());
        System.out.printf("Новая длина диапазона: %f.", range.getLength());
    }
}
