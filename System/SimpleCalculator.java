import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result = 0;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        boolean valid = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    valid = false;
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Modulo by zero is not allowed.");
                    valid = false;
                } else {
                    result = num1 % num2;
                }
                break;
            default:
                System.out.println("Invalid operator.");
                valid = false;
        }

        if (valid) {
            System.out.println((int)num1 + " " + operator + " " + (int)num2 + " = " + (int)result);
        }

        scanner.close();
    }
}
