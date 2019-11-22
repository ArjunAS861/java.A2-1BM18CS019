/*Write a program which creates two threads, one thread displaying “BMS College ofEngineering”
 once every ten seconds and another displaying “CSE” once every two seconds*/
import java.util.*;
class P1 implements Runnable
{
	Thread t1;
	P1()
	{
		t1=new Thread(this,"T1");
		t1.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("BMS College of Engineering");
			try{
				Thread.sleep(10000);
			   }
			catch(InterruptedException e)
			{
				System.out.println("Caught Interrupted Exception 1.");
			}
		}
	}
}
class P2 implements Runnable
{
	Thread t2;
	P2()
	{
		t2=new Thread(this,"T2");
		t2.start();
	}
	public void run()
	{
		while(true)
		{
			System.out.println("CSE");
			try{
				Thread.sleep(2000);
				
			   }
			catch(InterruptedException e)
			{
				System.out.println("Caught Interrupted Exception 2.");
			}
		}
	}
}
class MultiThread
{
	public static void main(String args[])
	{
		
		P1 a=new P1();
		P2 b=new P2();
		try{
		a.t1.join();
		b.t2.join();
		   }
		catch(InterruptedException e)
		{
			System.out.println("Caught Exception in Main.");
		}
	}
}
/*OUTPUT
BMS College of Engineering
CSE
CSE
CSE
CSE
CSE
BMS College of Engineering
CSE
CSE
.
.
.
.
.
.
.
.
.
.*/
