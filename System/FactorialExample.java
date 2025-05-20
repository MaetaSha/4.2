import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ইউজার ইনপুট
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // factorial using for loop
        int factFor = 1;
        for (int i = 1; i <= number; i++) {
            factFor *= i;
        }

        // factorial using while loop
        int factWhile = 1;
        int i = 1;
        while (i <= number) {
            factWhile *= i;
            i++;
        }

        // রেজাল্ট দেখানো
        System.out.println("Factorial using for loop: " + factFor);
        System.out.println("Factorial using while loop: " + factWhile);

        // যাচাই
        if (factFor == factWhile) {
            System.out.println("✅ Both results are same.");
        } else {
            System.out.println("❌ Results are different. Something is wrong.");
        }

        input.close();
    }
}
