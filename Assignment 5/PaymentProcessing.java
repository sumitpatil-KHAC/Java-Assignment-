// Question 4: Payment Processing using Generics 
import java.util.*;
class Payment{
	long paymentId;
	double amount;
	
	Payment(long paymentId , double amount){
		this.paymentId = paymentId;
		this.amount = amount;
	}
	void displayPayment(){
		System.out.println("Payment Id     : "+paymentId);
		System.out.println("Payment Amount : "+amount);
	}
}
class CreditCardPayment extends Payment{
	long creditNo ;
	
	CreditCardPayment(long creditNo , long paymentId , double amount){
		super(paymentId, amount);
		this.creditNo = creditNo;
	}
	void displayPayment(){
		System.out.println("Credit Card No : "+creditNo);
		super.displayPayment();
	}
}
class UPIPayment extends Payment{
	String upiId;
	
	UPIPayment(String upiId , long paymentId , double amount){
		super(paymentId, amount);
		this.upiId = upiId;
	}
	void displayPayment(){
		System.out.println("UPI Id/name   : "+upiId);
		super.displayPayment();
	}
}

class PaymentProcessing{
	public static void processPayments(List<? extends Payment> payments){
		for(Payment ob : payments){
		    ob.displayPayment();
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		List<CreditCardPayment> ccp = new ArrayList<>();
		System.out.println("Enter no of records of Credit Card payment");
		int ccpSize = sc.nextInt();
		for(int i = 0 ; i < ccpSize; i++){
		
		    System.out.println("Enter credit card Number: ");
		    long creditNo = sc.nextLong();
		    sc.nextLine();
		
	    	System.out.println("Enter payment id ");
		    long payId = sc.nextLong();
		    sc.nextLine();
		
		    System.out.println("Enter Payment Amount");
		    double amt = sc.nextDouble();
		    sc.nextLine();
			
			ccp.add(new CreditCardPayment(creditNo , payId ,amt));
			
		}
		List<UPIPayment> up = new ArrayList<>();
		System.out.println("Enter no of records of UPI payment");
		int upSize = sc.nextInt();
		sc.nextLine();
		for(int i = 0 ; i < upSize; i++){
		
		    System.out.println("Enter UPI Id : ");
		    String upiId = sc.nextLine();
		
	    	System.out.println("Enter payment id ");
		    long payId = sc.nextLong();
		    sc.nextLine();
		
		    System.out.println("Enter Payment Amount");
		    double amt = sc.nextDouble();
		    sc.nextLine();
			
			up.add(new UPIPayment(upiId , payId ,amt));
			
		}
		System.out.println("Credit Card Payment Records");
		processPayments(ccp);
		
		System.out.println("UPI Payment Records");
		processPayments(up);
		
		
	}
}
