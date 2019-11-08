package CIE;
import java.util.*;
public class Personal
{
	String usn,name;
	int sem;
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details (Name,USN,SEM) : ");
		name=sc.nextLine();
		usn=sc.nextLine();
		sem=sc.nextInt();
	}
}

