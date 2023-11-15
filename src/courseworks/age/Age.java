package courseworks.age;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст от 1 до 112: ");
        int userAge = scanner.nextInt();

        int minAge = 1;
        int maxAge = 112;

        if (userAge < minAge) {
            System.out.println("Вы слишком малы.");
        } else if (userAge > maxAge) {
            System.out.println("Вы слишком стары.");
        } else {
            int userAgeLastDigit = userAge % 10;
            int userAgePenultimateDigit = ((userAge / 10) % 10);

            if (userAgeLastDigit == 1 && userAgePenultimateDigit != 1) {
                System.out.printf("Вам %d год.", userAge);
            } else if ((userAgeLastDigit == 2 || userAgeLastDigit == 3 || userAgeLastDigit == 4) && userAgePenultimateDigit != 1) {
                System.out.printf("Вам %d года.", userAge);
            } else {
                System.out.printf("Вам %d лет.", userAge);
            }
        }
    }
}
