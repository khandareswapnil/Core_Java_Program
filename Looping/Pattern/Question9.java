// Question 9

public class Question9
{
	public static void main(String x[])
	{
		 for (int i = 1; i <= 6; i++) {
            // Print leading spaces
            for (int j = i; j <= 11; j++) {
                System.out.print(" ");
            }
            // Print hollow pyramid
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}