package _04.tennumbersinrow;

public class TenNumbersInRow {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 100;

        int i = rangeStart;

        while (i <= rangeEnd) {
            System.out.print(i + " ");

            if (i % 10 == 0) {
                System.out.println();
            }

            ++i;
        }
    }
}
