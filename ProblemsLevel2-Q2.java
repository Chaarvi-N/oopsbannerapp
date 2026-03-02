import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and height in cm
        System.out.print("Enter the base of the triangle (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle (cm): ");
        double height = sc.nextDouble();

        // Area in square centimeters
        double areaCm = 0.5 * base * height;

        // Conversion factor: 1 inch = 2.54 cm → 1 sq in = (2.54 * 2.54) sq cm
        double areaIn = areaCm / (2.54 * 2.54);

        // Output results
        System.out.println("The Area of the triangle in sq cm is " + areaCm);
        System.out.println("The Area of the triangle in sq in is " + areaIn);

        sc.close();
    }
}