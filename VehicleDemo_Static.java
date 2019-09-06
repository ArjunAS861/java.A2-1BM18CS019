import java.util.*;
class Vehicle
{
	String model;
	int year;
	String colour;
	static int totalveh;
	 Vehicle(String model,int year,String colour)
		{
			this.model=model;
			this.year=year;
			this.colour=colour;
			totalveh++;
		}
	void display()
	{
	  System.out.println(" Vehilce Model : "+model);
	  System.out.println(" Year  : "+year);
	  System.out.println(" Colour : "+colour);
	}
	static void disp()
	{
	System.out.println("Number of Vehicles is "+totalveh); 
	}
}
class VehicleDemo_Static
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of VEHICLES :");
		int n=sc.nextInt();
		Vehicle arr[]=new Vehicle[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter VEHICLE Model: ");
			String a=sc.next();
			System.out.println("Enter Year: ");
			int b=sc.nextInt();
			System.out.println("Enter the Colour: ");
			String c=sc.next();
			arr[i]=new Vehicle(a,b,c);
		}
		for(int i=0;i<n;i++)
		arr[i].display();
		Vehicle.disp();
	}
}
	  
