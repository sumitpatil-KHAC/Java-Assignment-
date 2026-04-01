/*
Question 5: Design a Product Inventory System 
Requirements: 
Each product has: 
 Product ID, name 
 Price, quantity 
System should: 
 Store multiple products 
 Calculate total inventory value 
 Update stock quantity 
Support: 
 Use constructor for initialization 
 Use method overloading for price update (discount / direct update) 
Display: 
 Product details and stock value
*/
import java.util.Scanner;
class Product{
	int productId;
	String name;
	double price;
	int quantity;
	
	Product(int productId, String name , double price , int quantity){
		this.productId = productId;
		this.name = name ;
		this.price = price;
		this.quantity = quantity; 
	}
	
	void updateStockQty(int qty){
		quantity = quantity + qty;
         System.out.println("Stock Quantity Updated successfully");		
	}
	
	void updatePrice(double directPrice){
		price = directPrice;
		System.out.println("Direct Price is Updated Successfully ");
	}
	void updatePrice(double discountPrice , String managerName){
		price = discountPrice;
		System.out.println("Discount Price is Updated Successfully , approved by : "+managerName);	
	}
	void printDetails(){
		System.out.println("Product Id       : "+productId);
		System.out.println("Product Name     : "+name);
		System.out.println("Product Price    : "+price);
		System.out.println("Product Quantity : "+quantity);
		double stockValue = price * quantity;
        System.out.println("Stock Value      : " + stockValue); 
	}
}
public class ProductInventorySystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Products ");
		int size = sc.nextInt();
		Product p[] = new Product[size];
		for(int i = 0 ; i < p.length ; i++){
			System.out.println("Enter Details of "+(i+1)+" Product ");
			
			System.out.println("Enter Product Id : ");
			int pId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Product Name ");
		    String pName = sc.nextLine();
			
			System.out.println("Enter Product price ");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter Product Quantity ");
			int pqty = sc.nextInt();
			sc.nextLine();
			p[i] = new Product(pId , pName , price , pqty );
		}
		System.out.println("========= Inventory Details =========");
	    
		double totalInventory = 0;
		for(int i = 0 ; i < p.length ; i++){
			totalInventory += p[i].price * p[i].quantity;
			p[i].printDetails();
		}
		System.out.println("Total Inventory Value: " + totalInventory);
		System.out.println("====================================");
		System.out.println("Did you want to Update Stock or its price (y/n)(y = yes , n = no )");
		System.out.println("Enter your choice (y/n) ");
		char c = sc.next().charAt(0);
        if(c == 'y'){	
            System.out.println("Enter Product id of whom you want to Update Stock or its price");	
            int prId = sc.nextInt();
            boolean found = false;			
		    for(int i = 0 ; i < p.length ; i++){
				if(p[i].productId == prId){
					found = true;
					int choice;
					do{
						System.out.println("1. Update Stock Quantity ");
						System.out.println("2. Direct price ");
						System.out.println("3. Discount price ");
						System.out.println("4. Exit ");
						System.out.println("Enter your choice ");
						choice = sc.nextInt();
						switch(choice){
							case 1 : System.out.println("Enter added Quantity ");
							         int qty = sc.nextInt();
									 p[i].updateStockQty(qty);
									 p[i].printDetails();
									 break;
							case 2 : System.out.println("Enter Direct Price to be Updated ");
							         double drPr = sc.nextDouble();
									 p[i].updatePrice(drPr);
									 p[i].printDetails();
									 break;
						    case 3 : System.out.println("Enter Discounted Price to be Updated ");
							         double disPr = sc.nextDouble();
									 sc.nextLine();
									 System.out.println("Enter Approving Manager Name ");
									 String mngName = sc.nextLine();
									 p[i].updatePrice(disPr,mngName);
									 p[i].printDetails();
									 break;
							case 4 : System.out.println("Exiting........");
							         break;
							default : System.out.println("Invalid choice");
						}
					}while(choice !=4);
				}
			}
			if(!found)
					System.out.println("Product not found");
		}
		if(c == 'n'){
			System.out.println("Thank You ....");
		}
	}
}