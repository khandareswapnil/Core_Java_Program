// constructor Question 1

import java.util.*;
class ParkingLot
{
	int r,c;
	int a[][];
	Scanner s = new Scanner(System.in);
	ParkingLot(int r,int c,int a[][])
	{
		this.r=r;
		this.c=c;
		this.a=a;
	}
	void showAllocatedParting(int rsolt,int cslot)
	{
		int no=0;
		for(int i=0;i<r;i++)
		{
			if(i==rsolt)
			{
				for(int j=0;j<c;j++)
				{
					if(j==cslot)
					{
						System.out.println("Enter 1 for Allocating");
						no=s.nextInt(); 
						a[i][j]=no;
					}
				}
			}
			
		}
	}
	void showAvailableParkings()
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.printf("%d",a[i][j]);
			}
			System.out.println("\n");
		}
	}
	void  removeParking(int rslot,int cslot)
	{
		int no=0;
		for(int i=0;i<r;i++)
		{
			if(i==rsolt)
			{
				for(int j=0;j<c;j++)
				{
					if(j==cslot)
					{
						System.out.println("Enter 0 for Allocating");
						no=s.nextInt(); 
						a[i][j]=no;
					}
				}
			}
			
		}		
	}
}
public class ParkingLotApp
{
	public static void main(String x[])
	{
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the Row");
		int row = s.nextInt();
		System.out.println("Enter the Column");
		int col = s.nextInt();
		
		int a[][]=new int[row][col];
		System.out.println("Enter the vlaue of Position");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=s.nextInt();
			}
		}

		ParkingLot park = new ParkingLot(row,col,a);
		
		int p=0;
		do
		{
			System.out.println("1. See the Parking Slot Are Empty or Not");
			System.out.println("2. Add Vehical");
			System.out.println("3. Remove Vehical");
			
			System.out.println("Enter the Choice");
			int choice = s.nextInt();
			
			switch(choice)
			{
				case 1:
					park.showAvailableParkings();
					break;
				case 2:
					System.out.println("Enter the Parking slot  which row and column");
					int rslot=s.nextInt();
					int cslot=s.nextInt();
					park.showAllocatedParting(rslot,cslot);
					break;
				case 3:
					System.out.println("Enter the Parking slot  which row and column");
					int rslot=s.nextInt();
					int cslot=s.nextInt();
					park.removeParking(rslot,cslot);
					break;
				default:
					System.out.println("Invalid Choice");
			}
			System.out.println("Press 0 for EXIT and Press 1 for CONTINUE");
			p=s.nextInt();
		}while(p!=0);
		
	}
}

