/*
1. Electricity Bill Calculator 
Create a Java program to calculate a household electricity bill. 
Requirements 
Accept customer name, consumer number, and units consumed. 
Calculate bill using slab rates such as: 
 First 100 units → Rs. 5 per unit 
 Next 100 units → Rs. 7 per unit 
 Above 200 units → Rs. 10 per unit 
If the bill exceeds Rs. 1500, apply a 5% surcharge. 
Display complete bill details
*/
import java.util.Scanner;
class Customer{
	String customerName ;
    long consumerNumber ;
	int units;
	
	Customer(){
		customerName = null;
		consumerNumber = 0;
		units = 0;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	public String getCustomerName(){
		return customerName;
	}
	public void setConsumerNumber(long consumerNumber){
		this.consumerNumber = consumerNumber;
	}
	public long getConsumerNumber(){
		return consumerNumber;
	}
	public void setUnits(int units){
		this.units = units;
	}
	public int getUnits(){
		return units;
	}
	public double calculate(){
		double sum = 0;
		if(units > 1 && units <= 100){
			sum = units * 5;
		}
		else if(units > 101 && units <= 200){
			sum = (100*5) + (units-100) * 7;
		}
		else if(units > 201){
			sum = (100*5 ) + (100*7) + (units-200) * 10;
		}
		if(sum > 1500){
			sum = sum + sum + 0.5;
		}
		return sum;
	}
    public void printDetails(){
		System.out.println("\n----- ELECTRICITY BILL -----");
        System.out.println("Customer Name     : " + customerName);
        System.out.println("Consumer Number   : " + consumerNumber);
        System.out.println("Units Consumed    : " + units);
        System.out.println("Total Bill Amount : Rs. " + calculate());
	}		
}
public class ElectricityBill{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		
		Customer cs = new Customer();
		
		System.out.println("Enter Customer Name : ");
		cs.setCustomerName( sc.nextLine());

		System.out.println("Enter Consumer Number : ");		
		cs.setConsumerNumber(sc.nextLong()) ;
		
		System.out.println("Enter Units Consumed : ");
		cs.setUnits(sc.nextInt()) ;
		
		cs.printDetails();
		
		
	}
}