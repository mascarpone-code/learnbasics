package _08;

import java.util.Scanner;

public class CharsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            if (Character.isLetter(currentChar)) {
                lettersCount++;
            } else if (Character.isDigit(currentChar)) {
                digitsCount++;
            } else if (Character.isWhitespace(currentChar)) {
                spacesCount++;
            } else {
                otherSymbolsCount++;
            }
        }

        System.out.printf("Количество букв %d.%nКоличество цифр %d.%nКоличество пробельных символов %d.%nКоличество остальных символов %d.",
                lettersCount, digitsCount, spacesCount, otherSymbolsCount);
    }
}
