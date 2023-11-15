package _06.overload;

public class Overload {
    public static void main(String[] args) {
        byte byteVariable = 0;
        short shortVariable = 0;
        int intVariable = 0;
        long longVariable = 0;
        float floatVariable = 0;
        double doubleVariable = 0;

        System.out.println("Количество байт под переменную типа byte: " + getTypeSize(byteVariable));
        System.out.println("Количество байт под переменную типа short: " + getTypeSize(shortVariable));
        System.out.println("Количество байт под переменную типа int: " + getTypeSize(intVariable));
        System.out.println("Количество байт под переменную типа long: " + getTypeSize(longVariable));
        System.out.println("Количество байт под переменную типа float: " + getTypeSize(floatVariable));
        System.out.println("Количество байт под переменную типа double: " + getTypeSize(doubleVariable));
    }

    private static int getTypeSize(byte byteVariable) {
        return 1;
    }

    private static int getTypeSize(short shortVariable) {
        return 2;
    }

    private static int getTypeSize(int intVariable) {
        return 4;
    }

    private static int getTypeSize(long longVariable) {
        return 8;
    }

    private static int getTypeSize(float floatVariable) {
        return 4;
    }

    private static int getTypeSize(double doubleVariable) {
        return 8;
    }
}
