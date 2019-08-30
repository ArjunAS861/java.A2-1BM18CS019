import java.util.*;
class Book
{
	String name,author;
	float price;
	int page;
 	Book(String name,String author,float price,int page)
	{
		this.name=name;
		this.author=author;
		this.price =price ;
		this.page=page;
	}
	public String toString()
	{
	return("Book Details:\n Name : "+name+"\n Author : "+author+"\n Price : Rs."+price+"\n No. of pages : "+page);
	 
	}
}
class BookDemo
{
	public static void main(String args[])
	{
	
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter No.of Books: ");
		int n=sc.nextInt();
	  	Book b[]=new Book[n];
		for(int i=0;i<n;i++)
		{	System.out.println("Enter Details of BOOK "+(i+1)+" (Name,Author,Price,Pages):");
		        String a=sc.next();
			String l=sc.next();
			float c=sc.nextFloat();
			int d=sc.nextInt();
			b[i]=new Book(a,l,c,d);
		}
		for(int i=0;i<n;i++)
		System.out.println(b[i]);
	}
}
/*OUTPUT:
Enter No.of Books: 
2
Enter Details of BOOK 1 (Name,Author,Price,Pages):
Jungle Mahesh 500 90                          
Enter Details of BOOK 2 (Name,Author,Price,Pages):
Rest Raghu 1000 550
Book Details:
 Name : Jungle
 Author : Mahesh
 Price : Rs.500.0
 No. of pages : 90
Book Details:
 Name : Rest
 Author : Raghu
 Price : Rs.1000.0
 No. of pages : 550
*/
