// ADD DATA IN FILE

import java.io.*;
import java.util.*;
import java.io.BufferedWriter;

class AddData
{
	File file;
	Scanner s;
	AddData(File file,Scanner s)
	{
		this.file=file;
		this.s=s;
	}
	
	void addInfo() throws IOException{
	
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bw=new BufferedWriter(fw);
		System.out.println("Enter the name of Employee");
		String name=s.nextLine();
		bw.write(name+"          ");
		System.out.println("Enter the Mobile Number of Employee");
		String mob=s.nextLine();
		bw.write(mob+"          ");
		System.out.println("Enter the Salary of Employee");
		String salary=s.nextLine();
		bw.write(salary);
		bw.newLine();
		bw.close();
		fw.close();
	}
}