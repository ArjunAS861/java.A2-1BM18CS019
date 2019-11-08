/*Create a package CIE which has two classes- Student and Internals. The class Personal has members like usn, name, sem. 
The class internals has an array that stores the internal marks scored in five courses of the current semester of the student. 
Create another package SEE which has the class External which is a derived class of Student.
 This class has an array that stores the SEE marks scored in five courses of the current semester of the student. 
Import the two packages in a file that declares the final marks of n students in all five courses.
*/
import java.util.*;
import CIE.*;
import SEE.*;
class Marks
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. of Students : ");
		int n=sc.nextInt();
		Internals i[]=new Internals[n];
		External e[]=new External[n];
		for(int j=0;j<n;j++)
		{
			i[j]=new Internals();
			i[j].set();
			e[j]=new External();
			e[j].set();
		}
		System.out.println("Finals Marks of "+n+" Students in 5 Courses are : ");
		for(int s=0;s<n;s++)
			for(int k=0;k<5;k++)
				System.out.println("Marks of Student "+(s+1)+" are : "+(i[s].cie[k]+e[s].see[k])); 
	}
}
