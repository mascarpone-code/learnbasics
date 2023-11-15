package courseworks.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для проверки: ");
        String palindromeCandidate = scanner.nextLine();

        int length = palindromeCandidate.length();
        boolean isPalindrome = true;

        int i = 0;
        int j = length - 1;

        while (i < length / 2) {
            char c0 = palindromeCandidate.charAt(i);
            char c1 = palindromeCandidate.charAt(j);

            if (Character.isWhitespace(c0)) {
                i++;
                continue;
            }

            if (Character.isWhitespace(c1)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(c0) != Character.toLowerCase(c1)) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        System.out.println(isPalindrome
                ? "Эта строка является палиндромом."
                : "Эта строка не является палиндромом.");
    }
}
