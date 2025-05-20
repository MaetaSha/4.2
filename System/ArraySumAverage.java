import java.util.Scanner;

public class ArraySumAverage {


    public static int calculateSum(int[] arr, int size) {
        int sum = 0;
        int i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < size);
        return sum;
    }

    public static double calculateAverage(int[] arr, int size) {
        int sum = calculateSum(arr, size); 
        return (double) sum / size;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

      
        int sum = calculateSum(arr, size);
        double average = calculateAverage(arr, size);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        input.close();
    }
}
