import java.io.*;
import java.util.*;

public class FileCalculator {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        File file = new File(inputFile);
        if (!file.exists()) {
            System.out.println("File not found! Looking in: " + file.getAbsolutePath());
            return;
        }

        try (
            Scanner sc = new Scanner(file);
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            int caseNumber = 1;

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split("\\s+");
                int[] numbers = new int[parts.length];

                for (int i = 0; i < parts.length; i++) {
                    numbers[i] = Integer.parseInt(parts[i]);
                }

                int sum = 0;
                int sub = numbers[0];
                int mul = 1;
                int div = numbers[0];

                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                    mul *= numbers[i];
                    if (i != 0) {
                        sub -= numbers[i];
                        if (numbers[i] != 0)
                            div /= numbers[i];
                    }
                }

                writer.write("Case-" + caseNumber + ": " + sum + " " + sub + " " + mul + " " + div);
                writer.newLine();
                caseNumber++;
            }

            System.out.println("✅ Calculation complete. Check 'output.txt' for results.");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
