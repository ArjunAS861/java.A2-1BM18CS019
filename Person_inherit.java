/*Implement a class called PERSON having data members as name, age and address. Derive a class STUDENT from PERSON having data members rollno, and sem. Derive another class EXAM from STUDENT which has data members marks1, marks2 and computes the average and displays the topper of the class. Use suitable methods to accept and display data in these classes.*/
import java.util.*;
class Person
{	String name,adres;
	protected int age;
	static String topper="";
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		name=sc.nextLine();
		System.out.println("Enter Age: ");
		age=sc.nextInt();
		System.out.println("Enter Address: ");
		sc.nextLine();
		adres=sc.nextLine();
	}
	void display()
	{
		System.out.println("Name: "+name+"\nAge: "+age+"\nAddress: "+adres);
	}
		
}
class Student extends Person
{
	protected int roll,sem;
	void getdata()
	{
		super.getdata();
		Scanner ob1=new Scanner(System.in);
		System.out.println("Enter Roll No.: ");
		roll=ob1.nextInt();
		System.out.println("Enter Semester: ");
		sem=ob1.nextInt();
	}
	
	void display()
	{	super.display();
		System.out.println("Roll No.: "+roll+"\nSemester: "+sem);
	}
}
class Exam extends Student
{
	protected float marks1,marks2;
	float avg;
	void getdata()
	{
		super.getdata();
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Marks 1: ");
		marks1=ob.nextFloat();
		System.out.println("Enter Marks 2: ");
		marks2=ob.nextFloat();
		
	}
	void compute_avg()
	{
		avg=(marks1+marks2)/2;
	}
	
	
	void display()
	{	super.display();
		System.out.println("Marks 1: "+marks1+"\nMarks 2: "+marks2);
	}
	
}
class Person_inherit
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		String name="";
		System.out.println("Enter No. of Students:");
		int n=s.nextInt();
		Exam arr[]=new Exam[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=new Exam();
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Details of Student "+(i+1));
			 arr[i].getdata();
			arr[i].compute_avg();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(" Details of Student "+(i+1));
			 arr[i].display();
			System.out.println("---------------------------------------------------");
						
		}
		float avg=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i].avg>avg)
			{	avg=arr[i].avg;
				Person.topper=arr[i].name;
			}
		}
			
	
		System.out.println("The Topper is  "+name+" and his Average is"+avg);
	}
}
