import java.util.*;
class Account
{
private String name;
private int id;
float balance;
Account()
	{
	name="";
	id=0;	
	balance=0;
	}
void input()
 {
 Scanner ob=new Scanner(System.in);
 System.out.println("Enter Name :");
 name=ob.next();
 System.out.println("Enter Customer No. :");
 id=ob.nextInt();
 System.out.println("Enter Balance :");
 balance=ob.nextFloat();
 }
void display()
{
System.out.println("Name= "+name+"\tCustomer ID = "+id+"\t Balance= "+balance);
}
}
class Savings extends Account
{
	float rate;
	int time;
  Savings()
 {
	super();
	rate=0;
	time=0;
 }
void input()
 {
	super.input();
	System.out.println("Enter Rate :");
	Scanner sc=new Scanner(System.in);
	rate=sc.nextFloat();
	System.out.println("Enter Time :");
	time=sc.nextInt();
 }
void display()
 {
	super.display();
	System.out.println("Rate= "+rate+"\tTime= "+time+"\tInterest= "+compute());
 }
 float compute()
 {
	return (balance*time*rate)/100;
 }
}
class Savings_Inherit
{
	public static void main(String args[])
	{
	Savings s=new Savings();
	s.input();
	s.display();
	}
}

