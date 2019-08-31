/*Write a java program to find the distance between two points. 
Include zero argument constructor, parameterised constructor, copy constructor to initialise different objects.*/
import java.util.*;
class Point 
{
	private int x,y;
	
	Point()
	{
	x=y=0;
	}
	Point(int x,int y)
	{
	this.x=x;
	this.y=y;
	}
	Point(Point z)
	{
	x=z.x;
	y=z.y;
	}
	float distance(Point k)
	{
	float m=(float)Math.sqrt(Math.pow(k.x-x,2)+Math.pow(k.y-y,2));
	return m;
	}
}
class PointDemo
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	Point p=new Point();
	int x;
	do
	{
	System.out.println("Enter the coordinates(x,y) of Point 1:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	Point p1=new Point(a,b);
	System.out.println("Enter the coordinates(x,y) of Point 2:");
	int c=sc.nextInt();
	int d=sc.nextInt();
	Point p2=new Point(c,d);
	System.out.println("Distance between Point 1 and Point 2 : "+p1.distance(p2));
	System.out.println("Distance of Point 1 from Origin : "+p.distance(p1));
	System.out.println("Distance of Point 2 from Origin : "+p.distance(p2));
	System.out.println("Do you want to try again (1/0):");
	x=sc.nextInt();
	}while(x!=0);
}
}
/*Output:
Enter the coordinates(x,y) of Point 1:                                                                                  
2 3                                                                                                                     
Enter the coordinates(x,y) of Point 2:                                                                                  
6 7                                                                                                                     
Distance between Point 1 and Point 2 : 5.656854                                                                         
Distance of Point 1 from Origin : 3.6055512                                                                             
Distance of Point 2 from Origin : 9.219544                                                                              
Do you want to try again (1/0): 
0	
*/
	