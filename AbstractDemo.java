/*Develop a Java program to create an abstract class named Shape that contains two integers and an empty method named printArea( ).
 Provide three classes named Rectangle, Triangle and Circle such that each one of the classes extends the class Shape. 
Each one of the classes contain only the method printArea( ) that prints the area of the given shape.*/

import java.util.*;
import java.lang.*;
abstract class Shape
{
	int a,b;
	abstract void printarea();
}
class Triangle extends Shape
{
	Scanner sc=new Scanner(System.in);
	Triangle()
	{ 	System.out.println("Enter the Base and Height of Triangle :");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	void printarea()
	{
		System.out.println("Area of Triangle = "+(0.5*a*b)+" sq.units");
	}	
	
}

class Rectangle extends Shape
{
	
	
	Scanner sc = new Scanner(System.in);
	Rectangle()
	{
		System.out.println("Enter the Length and Breadth of Rectangle :");
		a = sc.nextInt();
		b = sc.nextInt();
	}
       	void printarea()
	{
		System.out.println("Area of Rectangle: "+(a*b)+" sq.units");
	}
}


class  Circle extends Shape
{
	Scanner s = new Scanner(System.in);
	Circle()
	{
		System.out.println("Enter the Radius of Circle : ");
		a = s.nextInt();	
	}
	void printarea()
	{	
		System.out.println("Area of circle: "+(3.14*a*a)+" sq.units");
	}
}


class AbstractDemo
{
	 public static void main(String args[])
	
 	{	
			Shape ref=null;         //Creating a Base class Reference
			Scanner sc=new Scanner(System.in);
			do
			{
			System.out.println("------------------------------------------------------------");
			System.out.println("Press 1: Triangle\nPress 2: Rectangle\nPress 3: Circle\nPress 4 : Exit");
			System.out.println("Enter your Choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
					case 1: ref=new Triangle();//Super-class Reference pointing to sub-class object
						break;
					case 2: ref=new Rectangle();
						break;
					case 3: ref=new Circle();
						break;
	
					case 4: System.out.println("Program Terminated safely.");
						System.exit(0);
						break;
					default: System.out.println("Invalid Choice.");
			}
			ref.printarea();
			}while(true);
	}
}
/*
OUTPUT:

*/
