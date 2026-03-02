import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        float number1, number2;
        float sum, difference, product, quotient;

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        number1 = sc.nextFloat();

        System.out.print("Enter second number: ");
        number2 = sc.nextFloat();

        // Arithmetic operations
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;

        // Printing results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);

        if (number2 != 0) {
            quotient = number1 / number2;
            System.out.println("Division: " + quotient);
        } else {
            System.out.println("Division: Not possible (division by zero)");
        }

        sc.close();
    }
}