/*Write a program that demonstrates handling of exceptions in inheritance tree. 
Create a base class called “Father” and derived class called “Son” which extends the base class.
 In Father class, implement a constructor which takes the age and throws the 
exception WrongAge( ) when the input age=father’s age.*/
import java.util.*;
class Father
{
	int fage;
	Father(int a) throws WrongAge
	{
		if(a<0)
			throw new WrongAge();
			fage=a;
	}
}
class Son extends Father
{
	int sage;
	Son(int a,int b) throws WrongAge,AgeException
	{	super(a);
		if (b<0)
			throw new WrongAge();
		
		if(a>=b+21)
			sage=b;
		else
			throw new AgeException();
	}
	void display()
	{
		System.out.println("Father is "+(fage-sage) +" Older than Son.");
	}
}
class ExcepDem
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter Father's Age : ");
			int x=sc.nextInt();
			System.out.println("Enter Son's Age : ");
			int y=sc.nextInt();
		try{
			
			Son a= new Son(x,y);
			a.display();
		   }
		catch(WrongAge w)
		{
			System.out.println("Exception: "+w);
		}
		catch(AgeException e)
		{
			System.out.println("Exception: "+e);
		}
		
	}
}
class WrongAge extends Exception
{
	public String toString()
	{
		return"Invalid Age";
	}
}
class AgeException extends Exception
{	public String toString()
	{	return"Age of Father Must Exceeds Son by 21 ";
	}
}/*OUTPUT:
RUN 1:
Enter Father's Age : 
28
Enter Son's Age : 
2
Father is 26 Older than Son.
RUN 2:
Enter Father's Age : 
-1
Enter Son's Age : 
2
Exception: Invalid Age
RUN3:
Enter Father's Age : 
21
Enter Son's Age : 
5
Exception: Age of Father Must Exceeds Son by 21 
*/	
