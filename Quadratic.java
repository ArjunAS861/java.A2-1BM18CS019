import java.util.*;
class Quadratic
{
	public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Co-efficients: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
int p;
double r1=0,r2=0,s=0,t=0;
int d=((b*b)-(4*a*c));
if(d>0)
{
System.out.println("Two real roots.");
 r1=(-b+Math.sqrt(d))/(2*a);
r2=(-b-Math.sqrt(d))/(2*a);
 p=1;
}
else if(d==0)
{
System.out.println("Equal Roots.");
r1=(-b)/2*a;
r2=(-b)/2*a;
p=1;
}
else 
{System.out.println("Complex Roots.");
s=(-b)/2*a;
t=(Math.sqrt(-d))/2*a;
p=0;
}
if(p==1)
{System.out.println("Root 1= "+r1+" and Root 2= "+r2);
}else if(p==0)
{System.out.println("Root1= "+s+" + "+t+"i and Root 2= "+s+" - "+t+"i");
}
}
}

