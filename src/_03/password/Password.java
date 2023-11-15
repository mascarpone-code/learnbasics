package _03.password;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String userInput = scanner.nextLine();

        String password = "PassWord";
        int passwordLength = password.length();
        int userInputLength = userInput.length();

        if (userInput.equals(password)) {
            System.out.println("Пароль верный.");
        } else if (userInputLength > passwordLength) {
            System.out.println("Пароль неверный, строка слишком длинная.");
        } else if (userInputLength < passwordLength) {
            System.out.println("Пароль неверный, строка слишком короткая.");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}
