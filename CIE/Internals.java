package CIE;
import java.util.*;
public class Internals extends Personal
{
	public int cie[]=new int[5];
	public void set()
	{	Scanner sc=new Scanner(System.in);
		getdata();
		
		System.out.println("Enter CIE Marks : ");
		for(int i=0;i<5;i++)
			cie[i]=sc.nextInt();
	}
}
		
