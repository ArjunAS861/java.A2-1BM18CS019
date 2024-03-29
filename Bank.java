/*Develop a Java program to create a class Bank that maintains two kinds of account for its customers,
 one called savings account and the other current account. The savings account provides compound interest 
and withdrawal facilities but no cheque book facility.
 The current account provides cheque book facility but no interest. Current account holders should also
 maintain a minimum balance and if the balance falls below this level, a service charge is imposed.
Create a class Account that stores customer name, account number and type of account. 
From this derive the classes Curr-acct and Sav-acct to make them more specific to their requirements. 
Include the necessary methods in order to achieve the following tasks:
Accept deposit from customer and update the balance.
Display the balance.
Compute and deposit interest
Permit withdrawal and update the balance
Check for the minimum balance, impose penalty if necessary and update the balance.

*/
import java.util.*;
import java.lang.*;
class BankAccount
{
	String name;
	float bal;
	int ac_no;
	static int type;
	BankAccount()
	{
		bal=500;
	}
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name=sc.nextLine();
		System.out.println("Enter the Account Number : ");
		ac_no=sc.nextInt();
		
	}
	void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount to be Deposited : ");
		float x=sc.nextInt();
		bal+=x;
	}
	void display()
	{
		System.out.println("Account Number = "+ac_no);
		System.out.println("Balance = "+bal);
	}
	void withdrawl()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount to Withdrawl : ");
		float l=sc.nextFloat();
		bal-=l;
	}
	void interest()
	{
		System.out.println("Facility Not Available For Current Account Holders.");
	}
	void penalty()
	{
	}
}
class Saving extends BankAccount
{
	float c_int;
	void interest()
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Time(in years): ");
			int t=sc.nextInt();
			c_int=(float)(bal*Math.pow(1.08,t));
			bal+=c_int;
	}
}
class Current extends BankAccount
{
	final float m_bal=5000;
	void penalty()
	{	
		if(bal<m_bal)
		{
			System.out.println("Pay Service Charge of Rs.500 ");
			bal-=500;
		}
	}
}
class Bank
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BankAccount ref=null;
		System.out.println("! Hello Customer !");
		System.out.println("Press 1 : Savings Bank Account.\nPress 2 : Current Account.");
		BankAccount.type=sc.nextInt();
		if(BankAccount.type==1)
		{	ref=new Saving();
			ref.getdata();
			
		}
		else if(BankAccount.type==2)
		{
			ref=new Current();
			ref.getdata();
		
		}
		do
		{
		System.out.println("--------------------------------------------------");
		System.out.println("press 1 : Deposit.\nPress 2 : Withdraw.\nPress 3 : Balance Enquiry.\nPress 4 : Compound Interest(Only for Savings Account)\nPress 5 : Exit"); 
		int ch=sc.nextInt();
		switch(ch)
		{
			case 1 :  	ref.deposit();
					break;
			case 2 :  	ref.withdrawl();
					ref.penalty();
					break;
			case 3 :  	ref.display();
					break;
			case 4 : 	ref.interest();
					break;
			case 5 : 	System.exit(0);
					break;
			default :	System.out.println("Invalid Choice.");
		}
		}while(true);
	}
}
/*OUTPUT:! Hello Customer !
Press 1 : Savings Bank Account.
Press 2 : Current Account.
1
Enter the Name : 
arjun
Enter the Account Number : 
12345
--------------------------------------------------
press 1 : Deposit.
Press 2 : Withdraw.
Press 3 : Balance Enquiry.
Press 4 : Compound Interest(Only for Savings Account)
Press 5 : Exit
1
Enter Amount to be Deposited : 
100
--------------------------------------------------
press 1 : Deposit.
Press 2 : Withdraw.
Press 3 : Balance Enquiry.
Press 4 : Compound Interest(Only for Savings Account)
Press 5 : Exit
3
Account Number = 12345
Balance = 600.0
--------------------------------------------------
press 1 : Deposit.
Press 2 : Withdraw.
Press 3 : Balance Enquiry.
Press 4 : Compound Interest(Only for Savings Account)
Press 5 : Exit
4   
Enter the Time(in years): 
2
--------------------------------------------------
press 1 : Deposit.
Press 2 : Withdraw.
Press 3 : Balance Enquiry.
Press 4 : Compound Interest(Only for Savings Account)
Press 5 : Exit
3
Account Number = 12345
Balance = 1299.8401
--------------------------------------------------
press 1 : Deposit.
Press 2 : Withdraw.
Press 3 : Balance Enquiry.
Press 4 : Compound Interest(Only for Savings Account)
Press 5 : Exit
5
*/		
