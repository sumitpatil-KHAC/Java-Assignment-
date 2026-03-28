/*
3. ATM Simulation 
Create a simple ATM system. 
Requirements 
 Show a menu using switch-case: 
1. Check Balance 
2. Deposit Money 
3. Withdraw Money 
4. Exit 
 Start with an initial balance. 
 Prevent withdrawal if balance is insufficient. 
 Continue showing the menu until the user chooses Exit.
*/
import java.util.Scanner;
class Simulation{
	private double amount;
	
	Simulation(){
		amount = 1000;	
	}
	public double getAmount(){
		return amount;
	}
	public void depositMoney(int d){
		if(d > 0 ){
		    amount += d;        // internal typecasting 
			System.out.println("Amount Deposited Successfully");
		}
		else 
			System.out.println("Invalid Deposit Amount");
		
	}
	public void withdrawMoney(int i ){
		if(i <= 0){
			System.out.println("Invalid Withdraw Amount");
		}
		else if(amount >= i){
		        amount -= i;
				System.out.println("Amount Withdrawal Successfull");
	    }
	    else 
			System.out.println("Insufficient Balance ");
	}
	public void checkBalance(){
		System.out.println("Current Balance = "+amount);
    }
	
	
}
public class ATM{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Simulation si = new Simulation();
		int ch = 0;
		do{
			System.out.println("1. Check Balance ");
			System.out.println("2. Deposit Money ");
			System.out.println("3. Withdraw Money ");
			System.out.println("4. Exit ");
			
			System.out.println("Enter your choice ");
			ch = sc.nextInt();
		
			switch(ch){
				case 1 :si.checkBalance(); 
				        break;
				case 2 :System.out.println("Enter amount to deposit");
				        si.depositMoney(sc.nextInt());	
						break;
				case 3: System.out.println("Enter amount to withdraw");
				        si.withdrawMoney(sc.nextInt());
						break;
				case 4: System.out.println("Exited successfully"); 
				        break;
				default : System.out.println("Not a valid choice");		
				
			}
		}while(ch != 4);
		
	}
}





