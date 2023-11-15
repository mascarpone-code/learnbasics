package courseworks.maxsubstring;

import java.util.Scanner;

public class MaxSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        System.out.println("Длина максимальной подстроки: " + getMaxSubstring(line));
    }

    public static int getMaxSubstring(String line) {
        if (line.isEmpty()) {
            return 0;
        }

        int maxSubstringLength = 1;
        int tempSubstringLength = 1;
        char previousChar = line.charAt(0);

        for (int i = 1; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            if (currentChar == previousChar) {
                tempSubstringLength++;

                if (tempSubstringLength > maxSubstringLength) {
                    maxSubstringLength = tempSubstringLength;
                }
            } else {
                tempSubstringLength = 1;
                previousChar = currentChar;
            }
        }

        return maxSubstringLength;
    }
}
