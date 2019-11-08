package SEE;
import java.util.*;
public class External extends CIE.Personal
{
	public int see[]=new int[5];
	public void set()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter SEE Marks Of 5 Courses : ");
	for(int i=0;i<5;i++)
	see[i]=sc.nextInt();
	}
}
