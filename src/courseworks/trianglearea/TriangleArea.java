package courseworks.trianglearea;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату \"x\" первой вершины треугольника: ");
        double x1 = scanner.nextDouble();

        System.out.print("Введите координату \"y\" первой вершины треугольника: ");
        double y1 = scanner.nextDouble();

        System.out.print("Введите координату \"x\" второй вершины треугольника: ");
        double x2 = scanner.nextDouble();

        System.out.print("Введите координату \"y\" второй вершины треугольника: ");
        double y2 = scanner.nextDouble();

        System.out.print("Введите координату \"x\" третьей вершины треугольника: ");
        double x3 = scanner.nextDouble();

        System.out.print("Введите координату \"y\" третьей вершины треугольника: ");
        double y3 = scanner.nextDouble();

        final double epsilon = 1e-10;

        if (Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) <= epsilon) {
            System.out.println("Вершины треугольника лежат на одной прямой. Площадь треугольника равна нулю.");
        } else {
            double aSideLength = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double bSideLength = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
            double cSideLength = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

            double semiPerimeter = (aSideLength + bSideLength + cSideLength) / 2;
            double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - aSideLength) * (semiPerimeter - bSideLength) * (semiPerimeter - cSideLength));

            System.out.printf("Площадь треугольника = %f", triangleArea);
        }
    }
}
