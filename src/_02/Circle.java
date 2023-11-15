package _02;

public class Circle {
    public static void main(String[] args) {
        int circle1Radius = 1;
        double circle1Area = Math.PI * Math.pow(circle1Radius, 2);
        double circle1Length = 2 * Math.PI * circle1Radius;

        System.out.println("The area of first circle: " + circle1Area);
        System.out.println("The length of first circle: " + circle1Length);

        double circle2Area = Math.PI;
        double circle2Radius = Math.sqrt(circle2Area / Math.PI);

        System.out.println("The radius of second circle: " + circle2Radius);

        double degrees3 = Math.sqrt(360 / Math.PI);
        double circle3SectorArea = Math.PI * Math.pow(circle1Radius, 2) * degrees3 / 360;

        System.out.println("The area of the sector: " + circle3SectorArea);
    }
}
