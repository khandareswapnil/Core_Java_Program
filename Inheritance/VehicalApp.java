// inheritence program

import java.util.*;
class Vehical
{
	String make;
	String model;
	int year;
	
	Vehical(String make, String model,int year)
	{
		this.make=make;
		this.model=model;
		this.year=year;
	}
	
	void displayInfo()
	{
		System.out.println("Make" +make);
		System.out.println("Model" +model);
		System.out.println("Year" +year);
	}
}

class Car extends Vehical
{
	int numberOfDoors;
	Car(String make, String model,int year,int numberOfDoors)
	{
		super(make,model,year);
		this.numberOfDoors=numberOfDoors;
	}
	void displayInfo()
	{
		super.displayInfo();
		System.out.println("Number Of Doors" +numberOfDoors);
	}
}

class Bike extends Vehical
{
	int hasCarrier;
	 Bike(String make, String model,int year,int hasCarrier)
	{
		super(make,model,year);
		this.hasCarrier=hasCarrier;
	}
	
	void displayInfo()
	{
	    super.displayInfo();
		System.out.println("Carrier" +hasCarrier);
	}
}

public class VehicalApp
{
	public static void main(String x[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the  making company of Car");
		String make=s.nextLine();
		System.out.println("Enter the Model of Car");
		String model=s.nextLine();
		System.out.println("Enter the Year of Car");
		int year=s.nextInt();
		System.out.println("Enter the Doors");
		int door=s.nextInt();
		
		System.out.println("Enter the  making company of Bike");
		String bmake=s.nextLine();
		System.out.println("Enter the Model of Bike");
		String bmodel=s.nextLine();
		System.out.println("Enter the Year of Bike");
		int byear=s.nextInt();
		System.out.println("Enter the Carrier");
		int carrier=s.nextInt();
		
		Car c=new Car(make,model,year,door);
		c.displayInfo();
		
		Bike b=new Bike(bmake,bmodel,byear,carrier);
		b.displayInfo();
	}
}