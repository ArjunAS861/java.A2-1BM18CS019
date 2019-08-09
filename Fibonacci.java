import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a=0;
int b=1;
int c=0;
System.out.println("Enter n ");
int n= sc.nextInt();
for(int i=0;i<n;i++)
{
c=a+b;
a=b;
b=c;
c=a;

}
System.out.println(c);
}
}
