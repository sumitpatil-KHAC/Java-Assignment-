// Smart Banking System
import java.util.Scanner;
interface BankService{
	void deposit(double amount);
    void withdraw(double amount);	
}
class Account{
	int accountNumber;
	String accountHolderName;
	double balance;
	
	Account(int accountNumber ,String accountHolderName ,double balance){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName ; 
		this.balance = balance; 
	}
	void displayAccountDetails(){
		System.out.println("Account Number      : "+accountNumber);
		System.out.println("Account Holder Name : "+accountHolderName);
		System.out.println("Account Balance     : "+balance);
	}
	public String accountSummary(){
		StringBuilder sb = new StringBuilder("Acccount Summary \n");
		sb.append("==========================\n");
		sb.append("Account Number : ").append(this.accountNumber).append("\n");
		sb.append("Account Holder Name : ").append(this.accountHolderName).append("\n");
		sb.append("Account Balance : ").append(this.balance);
		
		return sb.toString();
	}
}
class SavingsAccount extends Account implements BankService{
	String accountType ;
	
	SavingsAccount(String accountType , int accountNumber ,String accountHolderName ,double balance){
		super(accountNumber , accountHolderName , balance);
		this.accountType = accountType;
	}
	void displayAccountDetails(){
		System.out.println("Account Type       : "+accountType);
		super.displayAccountDetails();
		System.out.println("-----------------------------------");
	}
	public void deposit(double amount){
		if(amount <= 0){
			throw new IllegalArgumentException("Invalid Deposit Amount ");
		}
		else{
	        balance = balance + amount ;
		    System.out.println("Amount Deposited Successfully ");
		    System.out.println("Increased balance is "+balance);
		}
	}
	public void deposit(double amount , double bonus){
		if(amount <= 0){
			throw new IllegalArgumentException("Invalid Deposit Amount ");
		}
		else{
		    balance = balance + amount + bonus ;
		    System.out.println("Amount Deposited Successfully ");
		    System.out.println("Increased balance with bonus is "+balance);
		}
	}
    public void withdraw(double amount){
		try{
			if(amount < 0){
				throw new Exception("Negative Withdrawal Amount");
			}
		    else if(amount >= balance){
			   throw new Exception("Insufficient Balance");
			}
		    else{
		       balance = balance - amount ;
		       System.out.println("Amount Withdraw Successfully ");
		       System.out.println("Decreased balance is "+balance);
		    }
		}
		catch(Exception e ){
			System.out.println("Invalid Withdrawal amount : "+e.getMessage());
		}
		
	}
	
	
	
}
class CurrentAccount extends Account implements BankService{
	String accountType ;
	
	CurrentAccount(String accountType , int accountNumber ,String accountHolderName ,double balance){
		super(accountNumber , accountHolderName , balance);
		this.accountType = accountType;
	}
	
	void displayAccountDetails(){
		System.out.println("Account Type       : "+accountType);
		super.displayAccountDetails();
		System.out.println("-----------------------------------");
		
	}
	public void deposit(double amount){
		if(amount <= 0){
			throw new IllegalArgumentException("Invalid Deposit Amount ");
		}
		else{
			balance = balance + amount ;
		    System.out.println("Amount Deposited Successfully ");
	     	System.out.println("Increased balance is "+balance);
		}
	}
	public void deposit(double amount , double bonus){
		if(amount <= 0){
			throw new IllegalArgumentException("Invalid Deposit Amount ");
		}
		else{
		    balance = balance + amount + bonus ;
		    System.out.println("Amount Deposited Successfully ");
		    System.out.println("Increased balance with bonus is "+balance);
		}
	}
    public void withdraw(double amount){
		try{
			if(amount < 0){
				throw new IllegalArgumentException("Negative Withdrawal Amount");
			}
		    else if(amount > balance){
			   throw new IllegalArgumentException("Insufficient Balance");
			}
		    else{
		       balance = balance - amount ;
		       System.out.println("Amount Withdraw Successfully ");
		       System.out.println("Decreased balance is "+balance);
		    }
		}
		catch(IllegalArgumentException e ){
			System.out.println("Invalid Withdrawal amount : "+e.getMessage());
		}
	}
}
public class SmartBankingSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Account to Add");
		int size = sc.nextInt();
		sc.nextLine();
		Account[] account = new Account[size];
		for(int i = 0 ; i < account.length ; i++){
			System.out.println("Enter Account "+(i+1)+" Details ");
			System.out.println("Enter Account Type (Savings / Current): ");
			String accType = sc.nextLine();
			
			
			System.out.println("Enter Account Number : ");
			int accNo = sc.nextInt();
	        sc.nextLine();
			
			System.out.println("Enter Account Holder Name : ");
			String accName = sc.nextLine();
			
     	    System.out.println("Enter Initial balance ");
			double bal = 0;
			try{
			    String accBalance = sc.nextLine();
  	            bal = Double.parseDouble(accBalance);
			
			}
			catch(NumberFormatException e){
				System.out.println("Invalid input . Please enter a numerical balance");
			}
			
            Account acc = null;			
			if(accType.trim().equalsIgnoreCase("Savings")){
				acc = new SavingsAccount(accType , accNo, accName, bal);
			}
			else if(accType.trim().equalsIgnoreCase("Current")){
				acc = new CurrentAccount(accType , accNo, accName, bal);
			}
			if(acc != null)
			   account[i] = acc;
			
		}
		System.out.println("=================Account Details================");
		for(int i = 0 ; i < account.length ; i++){
			account[i].displayAccountDetails();
		}
		System.out.println("Did you want to Withdraw or Deposit ? \n Enter your choice(y/n) (y = yes / n = no) ");
		char ch = sc.next().charAt(0);
		if(ch == 'y'){
			System.out.println("Enter Account Number ");
			int acNo = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Account Type : ");
			String acType = sc.nextLine();
			boolean found = false;
			for(int i = 0 ; i < account.length ; i++){
				if(account[i].accountNumber == acNo){
					int choice = 0 ;
					found = true;
					if(acType.trim().equalsIgnoreCase("Savings")){
					     do{
						   System.out.println("1. Deposit ");
						   System.out.println("2. Deposit with Bonus");
						   System.out.println("3. Withdraw ");
						   System.out.println("4. Exit");
						   System.out.println("Enter your Choice");
						   choice = sc.nextInt();
						   switch(choice){
							  case 1 : System.out.println("Enter Amount to Deposit ");
							           double depAmt = sc.nextDouble();
									   ((SavingsAccount)account[i]).deposit(depAmt);   
							       break;
							  case 2 :System.out.println("Enter Amount to Deposit ");
							           double depAmt1 = sc.nextDouble();
									   System.out.println("Enter Amount of Bonus ");
									   double depBonus = sc.nextDouble();
									   ((SavingsAccount)account[i]).deposit(depAmt1 , depBonus);
							       break;
							  case 3 :System.out.println("Enter Amount to Withdraw ");
							           double witAmt = sc.nextDouble();
									   ((SavingsAccount)account[i]).withdraw(witAmt);
							       break; 
							  case 4 :System.out.println("Exiting.....");
							       break;
							  default : System.out.println("Invalid choice ");
						    }
					    }while(choice != 4);
						System.out.println("====== Updated Account Details ======");
						System.out.println(account[i].accountSummary());
					}
					if(acType.trim().equalsIgnoreCase("Current")){
					     do{
						   System.out.println("1. Deposit ");
						   System.out.println("2. Deposit with Bonus");
						   System.out.println("3. Withdraw ");
						   System.out.println("4. Exit");
						   System.out.println("Enter your Choice");
						   choice = sc.nextInt();
						   switch(choice){
							 case 1 : System.out.println("Enter Amount to Deposit ");
							           double depAmt = sc.nextDouble();
									   ((CurrentAccount)account[i]).deposit(depAmt);   
							       break;
							  case 2 :System.out.println("Enter Amount to Deposit ");
							           double depAmt1 = sc.nextDouble();
									   System.out.println("Enter Amount of Bonus ");
									   double depBonus = sc.nextDouble();
									   ((CurrentAccount)account[i]).deposit(depAmt1 , depBonus);
							       break;
							  case 3 :System.out.println("Enter Amount to Withdraw ");
							           double witAmt = sc.nextDouble();
									   ((CurrentAccount)account[i]).withdraw(witAmt);
							       break; 
							  case 4 :System.out.println("Exiting.....");
							       break;
							  default : System.out.println("Invalid choice ");
						    }
					    }while(choice != 4);
						System.out.println("====== Updated Account Details ======");
						System.out.println(account[i].accountSummary());
					}
					
				}	
			}
			if(!found){
				System.out.println("Invalid Account Number");	
			}

		}
		if(ch == 'n'){
			System.out.println("Thank You......!!!");
		}
		
				
			
			
			
			
		
	}
}