import java.util.*;
class Ascend
{
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the Size : ");
	int size=obj.nextInt();
	int a[]=new int[size];
	System.out.println("Enter the Elements: ");
	for(int i=0;i<size;i++)
	{
	a[i]=obj.nextInt();
	}
	
	for(int i=0;i<size;i++)
	{
	for(int j=i+1;j<size;j++)
	{	int temp=0;
		if(a[i]>a[j])
		{	temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	}
	System.out.println("Sorted array is :");
	for(int i=0;i<size;i++)
	System.out.print(a[i]+" ");
	}
}

		

