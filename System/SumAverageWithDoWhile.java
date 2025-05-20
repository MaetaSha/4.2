import java.util.Scanner;

public class SumAverageWithDoWhile {

    // Function 1: Calculate the sum of array elements
    public static int calculateSum(int[] arr, int size) {
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while(i < size);
        return sum;
    }

    // Function 2: Calculate the average
    public static double calculateAverage(int sum, int size) {
        return (double) sum / size;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[100];
        int n, i = 0;

        System.out.print("Enter how many numbers you want to input: ");
        n = scanner.nextInt();

        // Taking input using do-while loop
        do {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        } while(i < n);

        // Calling functions to get sum and average
        int sum = calculateSum(arr, n);
        double average = calculateAverage(sum, n);

        System.out.println("\nSum of the numbers: " + sum);
        System.out.printf("Average of the numbers: %.2f\n", average);
    }
}
