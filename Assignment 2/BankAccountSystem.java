/*
13. Bank Account System 
Create a class BankAccount: 
Requirements: 
 Variables: accountNumber, name, balance 
 Use: 
C-DAC Mumbai
 Default constructor 
 Parameterized constructor 
 Display account details 
 Create multiple objects using different constructors 
*/
class BankAccount{
	long accountNumber ;
	String name ;
	double balance;
	BankAccount(){
		accountNumber = 0;
		name = null;
		balance = 0.0;
	}
	BankAccount(long accountNumber , String name){
		this.accountNumber = accountNumber;
		this.name = name ;
	}
	BankAccount(long accountNumber , String name , double balance){
		this.accountNumber = accountNumber;
		this.name = name ;
		this.balance = balance;
	}
	void printDetails(){
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Name           : "+name);
		System.out.println("Balance        : "+balance);
	}
}
public class BankAccountSystem{
	public static void main(String[] args){
		BankAccount b = new BankAccount();
		BankAccount b1 = new BankAccount(768529348 ,"Sumit");
		BankAccount b2 = new BankAccount(564732892 , "Tanmay",9000.31);
		b.printDetails();
		System.out.println("-------------------------------");
		b1.printDetails();
		System.out.println("-------------------------------");
		b2.printDetails();
	}
}