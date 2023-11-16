package courseworks.maxsubstring;

import java.util.Scanner;

public class MaxSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String line = scanner.nextLine();

        System.out.println("Длина максимальной подстроки: " + getMaxSubstringLength(line));
    }

    public static int getMaxSubstringLength(String line) {
        if (line.isEmpty()) {
            return 0;
        }

        int maxSubstringLength = 1;
        int currentSubstringLength = 1;
        char previousChar = line.charAt(0);

        for (int i = 1; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            if (currentChar == previousChar) {
                currentSubstringLength++;

                if (currentSubstringLength > maxSubstringLength) {
                    maxSubstringLength = currentSubstringLength;
                }
            } else {
                currentSubstringLength = 1;
                previousChar = currentChar;
            }
        }

        return maxSubstringLength;
    }
}
