package courseworks.quadraticequation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффициент a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэффициент b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите коэффициент c: ");
        double c = scanner.nextDouble();

        double epsilon = 1e-10;

        if ((Math.abs(a) <= epsilon) && (Math.abs(b) <= epsilon) && (Math.abs(c) <= epsilon)) {
            System.out.println("Уравнение имеет бесконечное множество корней.");
        } else if ((Math.abs(a) <= epsilon) && (Math.abs(b) <= epsilon)) {
            System.out.println("Корней нет.");
        } else if (Math.abs(a) <= epsilon) {
            double x = -c / b;

            System.out.printf("x = %f", x);
        } else {
            double discriminant = Math.pow(b, 2) - (4 * a * c);

            if (discriminant < -epsilon) {
                System.out.println("Корней нет.");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);

                System.out.printf("x1 = x2 = %f", x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

                System.out.printf("x1 = %f,%nx2 = %f.", x1, x2);
            }
        }
    }
}
