/*Define a class called CUSTOMER with the following specifications: private members Customer_number, customer_name, quantity, price, total_price, discount and net_price, public methods :
1..a paarmeterized constructor to assign initial
2. input() function to read data members, call CalDiscount()
3. Caldiscount() to calculate discount according to total price and net price
TotalPrice=Price * Qty
TotalPrice>=50000 - Discount 25% of TotalPrice
TotalPrice>=25000 - Discount 10% of TotalPrice
NetPrice=TotalPrice-discount
4. Show() to display customer details

Develop a java program to accept details of n customers, calculate the discounts given to them and print their details*/
class Customer
{
	private int customer_number,quantity;
	private String customer_name;
	private double price, total_price, discount ,net_price;
	Customer(int customer_number,String customer_name,int quantity,float price)
	{
		this.customer_number=customer_number;
		this.customer_name=customer_name;
		this.quantity=quantity;
		this.price=price;
		
	}
	public void input()
	{
		Scanner sc=new Scanner();
		System.out.println("Enter Customer NO.");
		customer_number=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		customer_name=sc.nextLine();
		System.out.println("Enter Quantity: ");
		quantity=sc.nextInt();
		System.out.println("Enter Price: ");
		price=sc.nextFloat();
		
		total_price=price*quantity;		
	}

	public void Caldiscount()
	{	
		if(total_price>=50000)
			discount=0.25*total_price;
		if(total_price>=25000)
			discount=0.10*total_price;
		net_price=total_price-discount;
	}
	public void display()
	{
		System.out.println("Customer No.: "+customer_number+"\nCustomer Name : "+customer_name+"\nQuantity: "+quantity+"\nPrice: "+price+"\nTotal Price : "+total_price+"\nDiscount : "+discount+"\n
		

		
	

		
