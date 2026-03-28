/*
4. Grocery Store Bill Generator 
Create a billing system for a small grocery shop. 
Requirements 
 Accept item names, quantity, and price for multiple items. 
 Store item totals in arrays. 
 Calculate total bill amount. 
 Apply discount: 
 10% discount if bill is above Rs. 3000 
 Print the final bill in proper format.
*/
import java.util.Scanner;
class Bill{
	String itemName ; 
	int quantity;
	double price;
	Bill []bill;            // Array initilization of Bill 
	
	Bill(){         // 0-arg constructor 
	}
	Bill(int size){         
		itemName = "";
		quantity = 0;
		price = 0.0;	
		bill = new Bill[size];         // Array Creation with size
		for(int i = 0 ; i < size ; i++)
			bill[i] = new Bill();         // Assigning Oject to Array index
	}
	public void setItemName(int index , String itn ){
		bill[index].itemName = itn ;          // Assigning itemName to bill[]
	}
	public void setQuantity(int index ,int qty ){
		bill[index].quantity = qty ;
	}
	public void setPrice(int index ,double pr){
		bill[index].price = pr;
	}
	
	double total ;
	public void calculate(){
		total = 0;
		for(Bill b : bill){
		    total = total + b.price * b.quantity ;
		}
		
	}
	public void printDetails(){
		double discount = 0;
		if(total >= 3000 )
				discount = total * 0.1;
		double finalAmount = total - discount ;	
		System.out.printf("%-15s %10s %10s %12s \n" ,"Item Name", "Quantity",  "Price" , "Item Total");
		System.out.println("-------------------------------------------------------");
		for(Bill b : bill){
            System.out.printf("%-15s %10d %10.2f %12.2f \n",b.itemName, b.quantity , b.price, b.quantity*b.price);			
			System.out.println("-----------------------------------------------------");
		}
		System.out.println();
		System.out.println("==============================================================");
		System.out.printf("%-15s %32.2f \n" ,"Gross Total Bill: " , total);
		System.out.printf("%-15s %34.2f\n", "Discount (10%) :", discount);
        System.out.println("------------------------------------------------");
        System.out.printf("%-15s %37.2f\n", "Final Payable :", finalAmount);
			
	}
	
}
class GroceryStore{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Items");
		int n = sc.nextInt();   // nextInt() do not consume newline
		sc.nextLine();         // read line with leftover  
		Bill b = new Bill(n);
		
		for(int i = 0 ; i < n ; i++){
			System.out.println("\nEnter Item " + (i + 1) + " Details");

			System.out.println("Enter Item Name ");
			b.setItemName(i,sc.nextLine());
			
			System.out.println("Enter Item Quantity ");
			b.setQuantity(i,sc.nextInt());

			System.out.println("Enter Price of Item ");
			b.setPrice(i,sc.nextDouble());
			sc.nextLine();
			
		}
		b.calculate();
		b.printDetails();
		
	}
}