package _06.ordercost;

import java.util.Scanner;

public class OrderCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара №1: ");
        double item1Price = scanner.nextDouble();

        System.out.print("Введите количество товара №1: ");
        int item1Quantity = scanner.nextInt();

        System.out.print("Введите цену товара №2: ");
        double item2Price = scanner.nextDouble();

        System.out.print("Введите количество товара №2: ");
        int item2Quantity = scanner.nextInt();

        System.out.printf("Стоимость заказа: %.2f", getOrderCost(item1Quantity, item1Price, item2Quantity, item2Price));
    }

    private static double getOrderCost(int item1Quantity, double item1Price, int item2Quantity, double item2Price) {
        int itemsCount = item1Quantity + item2Quantity;
        double orderCost = (item1Quantity * item1Price) + (item2Quantity * item2Price);

        final int orderCostForDiscount = 1000;
        final int itemsCountForDiscount = 10;
        final double itemsCountOrOrderCostDiscount = 0.95;
        final double itemsCountAndOrderCostDiscount = 0.9;

        boolean isItemsCountDiscount = itemsCount >= itemsCountForDiscount;
        boolean isOrderCostDiscount = orderCost >= orderCostForDiscount;

        if (isItemsCountDiscount && isOrderCostDiscount) {
            orderCost *= itemsCountAndOrderCostDiscount;
        } else if (isItemsCountDiscount || isOrderCostDiscount) {
            orderCost *= itemsCountOrOrderCostDiscount;
        }

        return orderCost;
    }
}
