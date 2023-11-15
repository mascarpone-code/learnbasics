package _05.Break;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        String fixedString = "enigma";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String userString = scanner.nextLine();

            if (userString.equals(fixedString)) {
                System.out.println("Вы угадали!");
                break;
            }

            System.out.println("Неправильно.");
        }
    }
}
