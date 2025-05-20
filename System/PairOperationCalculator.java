import java.util.Scanner;

public class PairOperationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter even number of integers followed by an operator (+, -, *, /):");
        String line = sc.nextLine().trim();

        String[] parts = line.split("\\s+");

        // অপারেটর শেষ অংশ থেকে নেওয়া
        char operator = parts[parts.length - 1].charAt(0);

        int totalNumbers = parts.length - 1; // অপারেটর বাদে সংখ্যার সংখ্যা

        // সংখ্যাগুলো অবশ্যই জোড়া হওয়া লাগবে
        if (totalNumbers % 2 != 0) {
            System.out.println("Error: Please enter an even number of integers.");
            sc.close();
            return;
        }

        for (int i = 0; i < totalNumbers; i += 2) {
            int num1 = Integer.parseInt(parts[i]);
            int num2 = Integer.parseInt(parts[i + 1]);

            int result = 0;
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
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.print("undefined ");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator");
                    sc.close();
                    return;
            }
            System.out.print(result + " ");
        }

        sc.close();
    }
}
