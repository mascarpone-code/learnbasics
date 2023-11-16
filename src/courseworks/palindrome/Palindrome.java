package courseworks.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку для проверки: ");
        String palindromeCandidate = scanner.nextLine();

        System.out.println(isPalindrome(palindromeCandidate)
                ? "Эта строка является палиндромом."
                : "Эта строка не является палиндромом.");
    }

    private static boolean isPalindrome(String palindromeCandidate) {
        int length = palindromeCandidate.length();
        boolean isPalindrome = true;

        int i = 0;
        int j = length - 1;

        while (i < length / 2) {
            char currentLeftChar = palindromeCandidate.charAt(i);

            if (!Character.isLetter(currentLeftChar)) {
                i++;
                continue;
            }

            char currentRightChar = palindromeCandidate.charAt(j);

            if (!Character.isLetter(currentRightChar)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(currentLeftChar) != Character.toLowerCase(currentRightChar)) {
                isPalindrome = false;
                break;
            }

            i++;
            j--;
        }

        return isPalindrome;
    }
}
