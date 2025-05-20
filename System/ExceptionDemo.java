import java.io.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        // Example 1: ClassNotFoundException
        try {
            // এখানে DummyClass নামে কোনো ক্লাস নেই, তাই exception আসবে
            Class.forName("DummyClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException:");
            System.out.println(e.getMessage());
        }

        // Example 2: EOFException
        try {
            // একটি টেম্পোরারি ফাইল তৈরি ও তাতে object লেখি
            FileOutputStream fos = new FileOutputStream("testfile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("Hello");
            oos.close();

            // এখন ফাইল থেকে object পড়ি (extra read করলে EOFException হবে)
            FileInputStream fis = new FileInputStream("testfile.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            System.out.println("Read: " + ois.readObject()); // প্রথম read ঠিক আছে
            System.out.println("Trying to read again...");

            // দ্বিতীয়বার পড়লে ফাইল শেষ, তাই EOFException
            System.out.println("Read: " + ois.readObject()); // এই লাইনে exception
            
            ois.close();
        } catch (EOFException e) {
            System.out.println("Caught EOFException: End of file reached.");
        } catch (Exception e) {
            System.out.println("Other Exception: " + e);
        }
    }
}
