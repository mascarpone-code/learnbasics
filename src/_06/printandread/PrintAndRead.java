package _06.printandread;

import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int userNumber = printAndRead("Введите число: ");
        System.out.println(userNumber);

        userNumber = printAndRead("Сколько вам лет?: ");
        System.out.println(userNumber);

        userNumber = printAndRead("Сколько у вас детей?: ");
        System.out.println(userNumber);
    }

    private static int printAndRead(String inputInvite) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(inputInvite);

        return scanner.nextInt();
    }
}
