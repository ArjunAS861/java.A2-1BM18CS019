
import java.util.*;
class SemiPrime 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number :");
	int n= sc.nextInt();
	String po= "No";
	for(int i=1;i<=n/2;i++) 
	{
		int f=i,s=n-i;
		if(isSemiPrime(f) && isSemiPrime(s))
		System.out.println(f+ " true " + s);
		po= "Yes";
	}
	System.out.println(po);
}
	static boolean isSemiPrime(int n) 
{
	int count=0;
	for(int i=2;i<n;i++)
	{
	if(n%i==0)
	if(isPrime(i) && isPrime(n/i) && (n/i!=i))
	return true;
	}
	return false;
}
static boolean isPrime(int n)
{
for(int i=2;i<=n/2;i++) 
	{
	if(n%i==0)
	return false;
	}
return true;
}
}