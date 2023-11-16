package _06.overload;

public class Overload {
    public static void main(String[] args) {
        byte byteNumber = 0;
        short shortNumber = 0;
        int intNumber = 0;
        long longNumber = 0;
        float floatNumber = 0;
        double doubleNumber = 0;

        System.out.println("Количество байт под переменную типа byte: " + getTypeSize(byteNumber));
        System.out.println("Количество байт под переменную типа short: " + getTypeSize(shortNumber));
        System.out.println("Количество байт под переменную типа int: " + getTypeSize(intNumber));
        System.out.println("Количество байт под переменную типа long: " + getTypeSize(longNumber));
        System.out.println("Количество байт под переменную типа float: " + getTypeSize(floatNumber));
        System.out.println("Количество байт под переменную типа double: " + getTypeSize(doubleNumber));
    }

    private static int getTypeSize(byte number) {
        return 1;
    }

    private static int getTypeSize(short number) {
        return 2;
    }

    private static int getTypeSize(int number) {
        return 4;
    }

    private static int getTypeSize(long number) {
        return 8;
    }

    private static int getTypeSize(float number) {
        return 4;
    }

    private static int getTypeSize(double number) {
        return 8;
    }
}
