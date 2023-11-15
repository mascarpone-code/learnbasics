package courseworks.flats;

import java.util.Scanner;

public class Flats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введи количество подъездов: ");
        int entrancesCount = scanner.nextInt();

        System.out.print("Введи количество этажей: ");
        int floorsCount = scanner.nextInt();

        System.out.print("Введи номер квартиры: ");
        int flatNumber = scanner.nextInt();

        final int flatsOnFloorCount = 4;
        int flatsInEntranceCount = floorsCount * flatsOnFloorCount;
        int totalFlatsCount = entrancesCount * flatsInEntranceCount;

        if ((flatNumber <= 0) || (flatNumber > totalFlatsCount)) {
            System.out.print("Квартиры с таким номером нет в доме.");
        } else {
            int entranceNumber = ((flatNumber - 1) / flatsInEntranceCount) + 1;
            int floorNumber = (((flatNumber - 1) / flatsOnFloorCount) + 1) - floorsCount * (entranceNumber - 1);
            int flatPosition = flatNumber % flatsOnFloorCount;

            if (flatPosition == 0) {
                System.out.printf("Квартира в подъезде №%d, на %d этаже, ближняя справа.", entranceNumber, floorNumber);
            } else if (flatPosition == 1) {
                System.out.printf("Квартира в подъезде №%d, на %d этаже, ближняя слева.", entranceNumber, floorNumber);
            } else if (flatPosition == 2) {
                System.out.printf("Квартира в подъезде №%d, на %d этаже, дальняя слева.", entranceNumber, floorNumber);
            } else {
                System.out.printf("Квартира в подъезде №%d, на %d этаже, дальняя справа.", entranceNumber, floorNumber);
            }
        }
    }
}
