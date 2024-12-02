// Buffered Writer

import java.io.*;
import java.util.*;
public class BufferedWriter
{
	public static void main(String x[]) throws Exception
	{
		FileWriter fw=new FileWriter("D:\\java\\PROGRAM\\File Handling\\Demo2\\text.txt");
		BufferedWriter bw =new BufferedWriter(fw);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=s.nextLine();
		bw.write(str);
		bw.newLine();
		bw.close();
		fw.close();
	}
}