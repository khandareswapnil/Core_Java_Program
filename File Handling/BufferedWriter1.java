import java.io.*;
import java.util.*;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String filePath = "D:\\java\\PROGRAM\\File Handling\\Demo2\\text.txt";
        
        try (FileWriter fw = new FileWriter(filePath);
             BufferedWriter bw = new BufferedWriter(fw);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the String: ");
            String str = scanner.nextLine();
            bw.write(str);
            bw.newLine();
            
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
