//Program to compute Area of Rectangle
import java.util.*;
class Rectangle
{
	float length;
	float width;
	double area;
	void input()
	{
		System.out.println("Enter the Length and width of Rectangle (in m ): ");
		Scanner obj=new Scanner(System.in);
		length=obj.nextFloat();
		width=obj.nextFloat();
	}
	void area()
	{
		area=length*width;
	}
	void display()
	{	
		System.out.println("Length= "+length+" m	Width= "+width+" m");
		System.out.println("The Area of Rectangle is "+area+" sq.m");
	}
}
class Rectangle_Demo
{
	public static void main(String args[])
	{
	Rectangle R1=new Rectangle();
	Rectangle R2=new Rectangle();
	R1.input();
	R1.area();
	R1.display();
	R2.input();
	R2.area();
	R2.display();
	}
}
