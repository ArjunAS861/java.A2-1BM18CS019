import java.util.*;
class Maximum_2D
{
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter Dimensions (R C): ");
	int r=obj.nextInt();
	int c=obj.nextInt();
	System.out.println("Enter the Elements:");
	int a[][]=new int[r][c];
	for(int i=0;i<r;i++)
	for(int j=0;j<c;j++)
	a[i][j]=obj.nextInt();
	int large=0;
	for(int b[]:a)
	 	for(int x:b)
		{
			if(large<x)
			large=x;
		}
	
	System.out.println("The largest element is "+large);
}
}


