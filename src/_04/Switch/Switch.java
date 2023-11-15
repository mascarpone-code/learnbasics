package _04.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первый операнд: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второй операнд: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите код команды: ");
        int commandCode = scanner.nextInt();

        double result;

        switch (commandCode) {
            case 1:
                result = number1 + number2;
                System.out.println("Результат: " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Результат: " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Результат: " + result);
                break;
            case 4:
                final double epsilon = 1.0e-10;

                if (Math.abs(number2) <= epsilon) {
                    System.out.println("Данную операцию невозможно выполнить, так как на ноль делить нельзя.");
                } else {
                    result = number1 / number2;
                    System.out.println("Результат: " + result);
                }

                break;
            default:
                System.out.println("Неизвестная операция.");
        }
    }
}
