/*
Question 3: Financial Calculator (Bounded Generics) 
A finance company needs a system to calculate totals from numerical datasets like transactions, salaries, 
or profits. 
Task: 
Implement a program using bounded generics. 
Requirements: 
 Create a method that accepts only subclasses of Number 
 Calculate: 
 Sum 
 Average 
 Test with: 
 Integer transactions 
 Double salary data 
*/
import java.util.Scanner;
class FinancialCalculator{
	public static  <T extends Number> void display(T[] obj ){
		double total = 0;
		
		for(T sum : obj){
		   total = total + sum.doubleValue() ;
		}
		double avg = total / obj.length;
		System.out.println("Total   : "+total);
		System.out.println("Average : "+avg);
	
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Integer Transactions");
		int transact = sc.nextInt();
		Integer[] iob = new Integer[transact];
		System.out.println("Enter elements of Integer Transcation");
		for(int i = 0 ; i < iob.length ; i++){
			iob[i] = sc.nextInt();
		}
		display(iob);
		
		System.out.println("Enter size of Double Salary");
		int salary = sc.nextInt();
		Double[] dob = new Double[transact];
		System.out.println("Enter elements of Double Salary ");
		for(int i = 0 ; i < dob.length ; i++){
			dob[i] = sc.nextDouble();
		}
		display(dob);
		
		
	}
}