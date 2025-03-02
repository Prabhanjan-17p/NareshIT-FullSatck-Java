/*A BLC class called Customer is given to you. 

The task is to find the applicable Credit card Type and create CardType object based on the Credit Points of a customer.

Define the following for the class.

Attributes : 
	customerName : String,private
	creditPoints: int, private

Constructor :
	parameterizedConstructor: for both cusotmerName & creditPoints in that order.

Methods :
	Name of the method : getCreditPoints
	Return Type : int
	Modifier   : public 
	Task : This method must return creditPoints
	
	Name of the method : toString, Override it, 
	Return type : String 
	Task :  return only customerName from this.

Create another class called CardType. Define the following for the class

Attributes :
	customer : Customer, private
	cardType : String, private
Constructor :
	parameterizedConstructor: for customer and cardType attributes in that order

Methods :
	Name of the method : toString  Override this.  
	Return type : String
	Modifier : public
	Task :  Return the string in the following format.
		The Customer 'Rajeev' Is Eligible For 'Gold' Card.


Create One more class by name CardsOnOffer and define the following for the class.

Method : 
	Name Of the method : getOfferedCard 
	Return type : CardType
	Modifiers: public,static
	Arguments: Customer object

	Task : 	Create and return a CardType object after logically finding cardType from creditPoints as per the below rules.
		creditPoints	    cardType
		100  - 500	-   Silver
		501  - 1000	-   Gold
		1000 >		-   Platinum
		< 100		-   EMI
		
Create  an ELC class which contains Main method to test the working of the above application.

4 files :
---------- */


// CreditCardType.java
// ----------------

import java.util.Scanner;

public class CreditCardType 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Customer Name :");
		String name = sc.nextLine();
		System.out.print("Enter Customer Credit Point :");
		int creditPoint = sc.nextInt();
		
		Customer c1 = new Customer(name, creditPoint);
		
		CardType offeredCard = CardsOnOffer.getOfferedCard(c1);
		System.out.println(offeredCard);
		
		sc.close();
	}

}

// Customer.java
// ----------------
class Customer 
{
	private String customerName;
	private int creditPoints;

	public Customer(String customerName, int creditPoints) 
	{
		super();
		this.customerName = customerName;
		this.creditPoints = creditPoints;
	}
	
	
	public int getCreditPoints()
	{
		return this.creditPoints;
    }


	@Override
	public String toString()
	{
		return this.customerName;
	}
	

}

// CardType.java
// --------------

class CardType 
{
	private Customer customer;
	private String cardType;

	public CardType(Customer customer, String cardType) 
	{
		super();
		this.customer = customer;
		this.cardType = cardType;
	}

	@Override
	public String toString() 
	{
				
		return "The Customer '"+ this.customer+"' Is Eligible For '"+this.cardType+"' Card";
	}

	
}

// CardsOnOffer.java
// --------------------

 class CardsOnOffer 
{
  public static CardType getOfferedCard(Customer cust) //cust = c1
  {
	  int creditPoint = cust.getCreditPoints();
	  
	  if(creditPoint >=100 && creditPoint <=500)
	  {
		  return new CardType(cust, "Silver");
	  }
	  else if(creditPoint >500 && creditPoint <=1000)
	  {
		  return new CardType(cust, "Gold");
	  }
	  else if(creditPoint > 1000)
	  {
		  return new CardType(cust, "Platinum");
	  }
	  else
	  {
		  return new CardType(cust, "EMI");
	  }
	 
  }
}

