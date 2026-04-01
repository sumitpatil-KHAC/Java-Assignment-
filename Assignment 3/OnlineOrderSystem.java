/*
Question 8: Design an Online Order System 
Requirements: 
Each order has: 
 Order ID, customer name 
 Items and price 
System should: 
 Store multiple orders 
 Calculate total bill 
 Apply GST 
*/
import java.util.Scanner;
class Item{
	String itemName ;
	int itemQty ;
	int itemPrice;
	int totalPerItem = 0 ;
    int totalBill = 0 ;
	Item(String itemName , int itemQty , int itemPrice){
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.itemPrice = itemPrice;
	}
}
class Order{
	int orderId;
	String customerName;
	Item[] items ;
	
	
	Order(int orderId , String customerName , Item[] items){
		this.orderId = orderId ; 
		this.customerName = customerName;
		this.items = items;
	}
	void printDetails(){
		System.out.println("Order Id      : "+orderId);
		System.out.println("Customer Name : "+customerName);
		for(int i = 0 ; i < items.length ; i++){
		    System.out.println("Item Name     : "+items[i].itemName);
		    System.out.println("Item Price    : "+items[i].itemPrice);
		    System.out.println("Item Quantity : "+items[i].itemQty);
		}
		
	}
	
}
public class OnlineOrderSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Order ");
		int osize = sc.nextInt();
		Order[] o = new Order[osize];
		Item[] item ;
		for(int i = 0 ; i < o.length ; i++){
			System.out.println("Enter Details of "+(i+1)+" Details");
			System.out.println("Enter OrderId : ");
			int oId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Customer Name : ");
			String oName = sc.nextLine();
			System.out.println("Enter Items you want to add ");
			int noItem = sc.nextInt();
			item = new Item[noItem];
			sc.nextLine();
			for(int j = 0 ; j < item.length ; j++){
				System.out.println("Enter Details of "+(j+1)+" Item");
				System.out.println("Enter Item Name : ");
			    String oItemName = sc.nextLine();
			    System.out.println("Enter Quantity of Item : ");
			    int oQty = sc.nextInt();
			    sc.nextLine();
			    System.out.println("Enter Price of Item : ");
			    int oPrice = sc.nextInt();
			    sc.nextLine();
				item[j] = new Item(oItemName , oQty , oPrice);
			}
			
			o[i] = new Order(oId , oName , item);
		}
		System.out.println("============ Order Details ===============");
	    double grandTotal = 0;
		for(int i = 0 ; i < o.length ; i++){
			o[i].printDetails();
			double orderTotal= 0; 
			for(int j = 0 ; j < o[i].items.length ; j++){
                o[i].items[j].totalPerItem = o[i].items[j].itemQty * o[i].items[j].itemPrice;
				System.out.println("Total Per Item : " + o[i].items[j].totalPerItem);
                orderTotal += o[i].items[j].totalPerItem;
	     	}
			double gst = orderTotal* 0.18;
            double finalAmount = orderTotal + gst;
            
			System.out.println("Order Total    : " + orderTotal);
            System.out.println("GST (18%)      : " + gst);
            System.out.println("Final Amount   : " + finalAmount);
            System.out.println("--------------------------------");
		    grandTotal += finalAmount;
			}
		    System.out.println("Total Bill : "+grandTotal);
			
		}
	
}