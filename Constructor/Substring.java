import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Main String: ");
        String mainString = s.nextLine(); // e.g., "good morning"
        
        System.out.println("Enter the Search String: ");
        String searchString = s.nextLine(); // e.g., "good"
        
        if (mainString.contains(searchString)) {
            System.out.println("Substring Found");
        } else {
            System.out.println("Substring Not Found");
        }
    }
}
