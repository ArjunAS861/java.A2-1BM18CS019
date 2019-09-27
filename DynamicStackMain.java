/*Design an interface named Stack with the following methods:
a) push and pop elements from the stack
b) check whether the stack is empty or not.
Implement the stack with the help of arrays and if the size of the array becomes too small to hold the elements, create a new one. 
Test this interface by inheriting it in its subclass StackTest.java*/
import java.util.*;
import java.lang.*;
interface Stack
{
	void push(int item);
	int pop();
	void display();
}
class Dynamicstk implements Stack
{
	int Stk[];
	int size;
	int top;
	Dynamicstk()
	{	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Stack ");
		size=sc.nextInt();
		top=-1;
		Stk=new int[size];
	}
	public void push(int item)
	{
		if(top==size-1)
		{
			size*=2;
			int temp[]=new int[size];
			for(int i=0;i<(size/2);i++)
				temp[i]=Stk[i];
			Stk=temp;
		}
		Stk[++top]=item;
	}
	public int pop()
	{
		int ele=0;
		if(top==-1)
		{
			System.out.println("Stack Underflow.");
				return -9999;
		}
		ele=Stk[top];
		--top;
		return(ele);
	}
	public void display()
	{	if(top==-1)
		{
			System.out.println("Stack is Empty.");
				return;		
		}
		System.out.println("The Contents of Stack are: ");		
		for(int i=top;i>-1;i--)
			System.out.print(Stk[i]+" ");
			System.out.println();
	}
}
class DynamicStackMain
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			Dynamicstk ob=new Dynamicstk();
			int x,y;
			do
			{
			System.out.println("------------------------------------------------------------");
			System.out.println("Press 1: PUSH\nPress 2: POP\nPress 3: DISPLAY\nPress 4 : Exit");
			System.out.println("Enter your Choice: ");
			int ch=sc.nextInt();
			switch(ch)
			{
					case 1: System.out.println("Enter the Element : ");
						x=sc.nextInt();
						ob.push(x);
						break;
					case 2: y=ob.pop();
						if(y!=-9999)
						{
							System.out.println("The popped element is "+y);
						}
						break;
					case 3: ob.display();
						break;
	
					case 4: System.out.println("Program Terminated safely.");
						System.exit(0);
						break;
					default: System.out.println("Invalid Choice.");
			}
			}while(true);
		}
}
/*
OUTPUT:
Enter the Size of Stack 
1
------------------------------------------------------------
Press 1: PUSH
Press 2: POP
Press 3: DISPLAY
Press 4 : Exit
Enter your Choice: 
1
Enter the Element : 
5
------------------------------------------------------------
Press 1: PUSH
Press 2: POP
Press 3: DISPLAY
Press 4 : Exit
Enter your Choice: 
1
Enter the Element : 
8
------------------------------------------------------------
Press 1: PUSH
Press 2: POP
Press 3: DISPLAY
Press 4 : Exit
Enter your Choice: 
3
The Contents of Stack are: 
8 5 
------------------------------------------------------------
Press 1: PUSH
Press 2: POP
Press 3: DISPLAY
Press 4 : Exit
Enter your Choice: 
4
Program Terminated safely.
*/
