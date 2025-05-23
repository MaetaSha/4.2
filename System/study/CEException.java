package study;
import java.io.*;

public class CEException {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("study.ExistClass");
            System.out.println("Class Found inside package.\n---------");
        } catch(ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        }

        System.out.println("EOF exception for output ");
        DataInputStream dis = new DataInputStream(new FileInputStream("input.txt"));
        while(true) {
            try {
                byte ch = dis.readByte();
                System.out.print((char)ch);
            } catch(EOFException e) {
                System.out.println("\nEnd of file reached");
                break;
            }
        }
        dis.close();
    }
}
