import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number or string: ");
        String original = input.nextLine(); // ইউজার থেকে ইনপুট নেই

        String reversed = ""; // উল্টো স্ট্রিং রাখার জন্য

        // স্ট্রিং উল্টো করি
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // তুলনা করি উল্টোটার সাথে
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is Not a Palindrome.");
        }

        input.close();
    }
}
