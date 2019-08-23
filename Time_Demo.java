import java.util.*;
class Time
{
	int h,m,s;
	Time()
	{
	 h=0;m=0;s=0;
	}
	Time(int x,int y,int z)
	{
	h=x;m=y;s=z;
	}
	void print()
{
	System.out.println("Time = "+h+" : "+m+" : "+s);
}
	void advance(int x,int y,int z)
	{
	s+=z;
	m=m+y+(s/60);
	s=s%60;
	h=h+x+(m/60);
	m=m%60;
	h=h%24;
	}
	void current(int x,int y,int z)
	{
	h=x;m=y;s=z;
	}
}
class Time_Demo
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int ch;
	System.out.println("INITIALIZE TIME (Enter Hour ,Minute ,Second) :");
	                int hr=sc.nextInt();
	                int mr=sc.nextInt();
	                int sr=sc.nextInt();
	                Time ob=new Time(hr,mr,sr);
	                
	while(true)
	{  
	    System.out.println("Press 1 :Update TIME  \nPress 2:  Advance TIME\nPress 3:  Display Time\nPress 4: EXIT");
	    System.out.println("Enter your choice: ");
	    ch=sc.nextInt();
	    switch(ch)
	    {
	        case 1: 
	                System.out.println("Enter Hour ,Minute ,Second :");
	                int hh=sc.nextInt();
	                int mm=sc.nextInt();
	                int ss=sc.nextInt();
	                ob.current(hh,mm,ss);
	                break;
	       case 2 :System.out.println("Enter Hour ,Minute ,Second (to advance):");
	                int k=sc.nextInt();
	                int l=sc.nextInt();
	                int m=sc.nextInt();
	                 ob.advance(k,l,m);
	                break;
	       case 3 : ob.print();
	                break;
	       case 4 : java.lang.System.exit(0);
	    };
	}
	
	   
	}
}