package _06.temperatureconversion;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в градусах Цельсия: ");

        double celsius = scanner.nextDouble();

        System.out.println("В градусах Кельвина это: " + getKelvin(celsius));
        System.out.println("В градусах Фаренгейта это: " + getFahrenheit(celsius));
    }

    private static double getKelvin(double celsius) {
        return celsius + 273.15;
    }

    private static double getFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }
}
