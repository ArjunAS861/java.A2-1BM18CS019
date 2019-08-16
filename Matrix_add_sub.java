//program to add and subtract two matrices
import java.util.*;
class Matrix_add_sub
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Dimensions of first Matrix: ");
		int r1=obj.nextInt();
		int c1=obj.nextInt();
		int a1[][]= new int[r1][c1];
		System.out.println("Enter the elements : ");
		for(int i=0;i<r1;i++)
		for(int j=0;j<c1;j++)
			a1[i][j]=obj.nextInt();
		System.out.println("Enter the Dimensions of second Matrix: ");
		int r2=obj.nextInt();
		int c2=obj.nextInt();
		int a2[][]= new int[r2][c2];
		System.out.println("Enter the elements : ");
		for(int i=0;i<r2;i++)
		for(int j=0;j<c2;j++)
			a2[i][j]=obj.nextInt();
		if(r1==r2 && c1==c2)
		{	int a3[][]=new int[r1][c1];
			int a4[][]=new int [r1][c1]; 
			for(int i=0;i<r1;i++)
				for(int j=0;j<c1;j++)
				{	a3[i][j]=a1[i][j]+a2[i][j];
					a4[i][j]=a1[i][j]-a2[i][j];
				}	
			System.out.println("Addition : ");	
			for(int i=0;i<r1;i++)
			{	for(int j=0;j<c1;j++)
				{	System.out.print(a3[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Subtraction : ");
			for(int i=0;i<r1;i++)
			{	for(int j=0;j<c1;j++)
				{	System.out.print(a4[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
			System.out.println("Adittion and Subtraction of Matrices is not possible.");
	}
}
