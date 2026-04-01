/*
Question 3: Design a Banking System 
Requirements: 
Each account has: 
 Account number, holder name 
 Balance 
System should: 
 Store multiple accounts 
 Deposit & withdraw money 
 Prevent withdrawal if balance is insufficient 
 Track total number of accounts  
Support: 
 Overloaded methods for deposit (cash / online) 
Display: 
 Account details with updated balance 
*/
import java.util.Scanner; 
class Account{
	long accountNumber;
	String accountHolderName;
	double balance;
	static int count;
	
	Account(long accountNumber , String accountHolderName , double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		count++;
	}
	void deposit(double amount){
		balance += amount; 
		System.out.println("Amount Deposited Successfully by cash ");
	}
	void deposit(double amount , String upiId){
		balance += amount;
		System.out.println("Amount Deposited Successfully through "+upiId);
	}
	void withdraw(double amount){
		if(amount <= 0){
			System.out.println("Invalid Withdraw Amount");
		}
		else if(amount <= balance){
			balance -= amount;
			System.out.println("Successfully Withdrawn "+amount+" from your Account");
		}
		else
			System.out.println("Insufficient Balance can't withdraw the requested amount");
	}
	void printDetails(){
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Balance     : "+balance);
	}   
	
}
public class BankSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Accounts to add");
		int size = sc.nextInt();
		Account a[] = new Account[size];
		for(int i = 0 ; i < a.length ; i++){
			System.out.println("Enter Details of "+(i+1)+" Account ");
			System.out.println("Enter Account Number ");
			long acNo = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Account Holder Name ");
		    String acName = sc.nextLine();
			System.out.println("Enter Initial Balance you want to Add");
			double bal = sc.nextDouble();
			a[i] = new Account(acNo , acName , bal);
		}
		for(int i = 0 ; i < a.length ; i++){
			a[i].printDetails();
		}
		System.out.println("Enter your account number ");
		long accountNo = sc.nextLong();
		boolean found = false;
		for(int i = 0 ; i < a.length ; i++){
			
			if(accountNo == a[i].accountNumber){
				found = true;
		    int choice ;
		    do{
			System.out.println("1. Deposit by Cash");
			System.out.println("2. Deposit Online ");
			System.out.println("3. Withdraw ");
			System.out.println("4. Exit ");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch(choice){
				case 1 : System.out.println("Enter Cash Amount to Deposit ");
				        double amtCash = sc.nextDouble();
						a[i].deposit(amtCash);
						a[i].printDetails();
                        break;
                case 2 : System.out.println("Enter Digital Amount to Deposit ");
				        double amtOnline = sc.nextDouble();
						sc.nextLine();
						System.out.println("Enter UPI Id : ");
						String upiId = sc.nextLine();
						a[i].deposit(amtOnline , upiId);
						a[i].printDetails();
                        break;
				case 3 : System.out.println("Enter Amount to Withdraw ");
				        double amtWithdraw = sc.nextDouble();
						a[i].withdraw(amtWithdraw);
						a[i].printDetails();
                        break;	
                case 4 : System.out.println("Exiting.........");	
                         break;				
                default : System.out.println("Invalid Choice ");						
			    }
		    }while(choice != 4);
		}
		if(!found) 
			System.out.println("Not a valid accountNumber");
		}
	}
}