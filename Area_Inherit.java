import java.util.*;
class TwoD
{
	private int l,b;
	TwoD(int l, int b)
	{
		this.l=l;
		this.b=b;
	}
	int area()
		{
			return l*b;
		}
}
class ThreeD extends TwoD
{
	int h;
	ThreeD(int l, int b, int h)
	{
		super(l,b);
		this.h=h;
	}
	int volume()
	{
		return area()*h;
	}
}
class Area_Inherit
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length,Breadth,height:");

	int a=sc.nextInt();
	int b=sc.nextInt();	
	int c=sc.nextInt();
	ThreeD ob=new ThreeD(a,b,c);
	System.out.println("Volume= "+ob.volume());
	}
}
