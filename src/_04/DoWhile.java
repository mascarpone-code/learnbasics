package _04;

public class DoWhile {
    public static void main(String[] args) {
        int rangeStart = 3;
        int rangeEnd = 16;

        int allNumbersSum = 0;
        int evenNumbersSum = 0;

        int allNumbersCount = rangeEnd - rangeStart + 1;
        int evenNumbersCount = 0;

        int i = rangeStart;

        do {
            allNumbersSum += i;

            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            ++i;
        } while (i <= rangeEnd);

        double allNumbersAverage = (double) allNumbersSum / allNumbersCount;
        System.out.println("Среднее арифметическое всех чисел равно " + allNumbersAverage);

        double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
        System.out.println("Среднее арифметическое чётных чисел равно " + evenNumbersAverage);
    }
}
