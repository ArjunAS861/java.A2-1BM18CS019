import java.util.*;
class Student 
{
	String USN,Name;
	int[] marks,credits;
	int n;
	
	void input()
	{
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the NAME of student: ");
	Name=sc.next();
	System.out.println("Enter the USN of student: ");
	USN=sc.next();
	System.out.println("Enter the No. of Subjects : ");
	n=sc.nextInt();
	credits=new int[n];
	marks=new int[n];
	System.out.println("Enter the CREDITS for Subjects : ");
	for(int i=0;i<n;i++)
	credits[i]=sc.nextInt();
	System.out.println("Enter Marks : ");
	for(int i=0;i<n;i++)
	marks[i]=sc.nextInt();
	
	}
	float compute(float x)
	{
		int sum=0;
		for(int a:credits)
			sum+=a;
	for(int i=0;i<n;i++)
	{
	if(marks[i]>=90)
	x=x+credits[i]*10;
	else if(marks[i]>=75)
	x=x+credits[i]*9;
	else if(marks[i]>=60)
	x=x+credits[i]*8;
	else if(marks[i]>=50)
	x=x+credits[i]*7;
	else if(marks[i]>=40)
	x=x+credits[i]*6;
	else
	x=x+credits[i]*0;
	}
	return (x/sum);
	}
	void display()
	{
	System.out.println("STUDENT DETAILS:");
	System.out.println("NAME :"+Name+"\nUSN : "+USN);
	}
}
class Student_SGPA
{
	public static void main(String args[])
		{
			Student s1=new Student();
			float sgpa=0;
			s1.input();
			sgpa=s1.compute(sgpa);
			s1.display();
			System.out.println("SGPA : "+sgpa);
		}
}
	

