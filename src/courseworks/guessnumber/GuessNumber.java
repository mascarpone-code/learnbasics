package courseworks.guessnumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int hiddenNumber = 1 + random.nextInt(100);
        int attemptsCount = 1;

        while (true) {
            System.out.print("Введите число: ");
            int userNumber = scanner.nextInt();

            if (userNumber < hiddenNumber) {
                System.out.println("Неверно. Загаданное число больше.");
            } else if (userNumber > hiddenNumber) {
                System.out.println("Неверно. Загаданное число меньше.");
            } else {
                System.out.println("Вы угадали! Число попыток: " + attemptsCount);
                break;
            }

            attemptsCount++;
        }
    }
}
