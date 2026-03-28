/*
7. Mobile Recharge System 
Create a recharge application for prepaid mobile users. 
Requirements 
 Ask for mobile number and recharge amount. 
 Show recharge plans using switch-case. 
 Example: 
 Rs. 199 → 28 days validity 
 Rs. 399 → 56 days validity 
 Rs. 599 → 84 days validity 
 Print recharge confirmation with plan details. 
*/
import java.util.Scanner;

class MobileRecharge{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long mobileNumber;
	    int rechargeAmount;
		System.out.println("Enter Mobile Number");
		mobileNumber = sc.nextLong();
		System.out.println("Enter Recharge Amount");
		System.out.println("Available Plans are : 199 , 399 , 599");
		rechargeAmount = sc.nextInt();
		
		switch(rechargeAmount){
			case 199 : System.out.println("Recharge Done Successfully");
			           System.out.println("199 --> 28 days validity");
			           break;
			case 399 : System.out.println("Recharge Done Successfully");
			           System.out.println("399 --> 56 days validity");
			           break;
			case 599 : System.out.println("Recharge Done Successfully");
					   System.out.println("599 --> 84 days validity");
		               break;
			default : System.out.println("Not a valid plan");
		}
	}
}