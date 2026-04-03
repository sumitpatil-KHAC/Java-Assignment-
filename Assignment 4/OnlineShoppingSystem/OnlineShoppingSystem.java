// Assignment 4 - Online Shopping System
import java.util.Scanner;
interface Payment{
	void pay(double amount);
	void refund(double amount);
}
class Product{
	int productId;
	String productName ;
	String price;
	static int count;
	
	Product(int productId , String productName , String price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		count++;
	}
	double stringToDouble(){
		return Double.valueOf(price);
		
	}
}
class Order{
	String customerName;
	Product[] product ;
	
	Order(String customerName , Product[] product){
		this.customerName = customerName;
		this.product = product;
	}
	double calculate(){
		double total = 0;
	    for(int i = 0 ; i < product.length ; i++){
		    total += product[i].stringToDouble();
	    }
		return total;
	}
	double calculate(int discount){
		double total = calculate();
		double discountTotal = total * discount / 100;
		return total - discountTotal;	
	}
	public String bill(){
		StringBuilder sb = new StringBuilder("Bill Details : \n");
		sb.append("=========================\n");
		sb.append("Customer Name : ").append(customerName).append("\n");

		for(Product prod : product){
			sb.append("Product Id   : ").append(prod.productId).append("\n");
			sb.append("Product Name : ").append(prod.productName).append("\n");
			sb.append("Product Price: ").append(prod.price).append("\n");
		}
		sb.append("Total amount : ").append(calculate()).append("\n");

		return sb.toString();
	}
}
class UPIPayment implements Payment{
	public void pay(double amount){
		System.out.println("Payment Successfully Done of  Amount : "+amount);
		System.out.println("pay() of UPIPayment ");
	}
	public void refund(double amount){
		System.out.println("Payment Successfully Refunded of  Amount : "+amount);
		System.out.println("refund() of UPIPayment ");
	}
}
class CardPayment implements Payment{
	public void pay(double amount){
		System.out.println("Payment Successfully Done of  Amount : "+amount);
		System.out.println("pay() of CardPayment ");
	}
	public void refund(double amount){
		System.out.println("Payment Successfully Refunded of  Amount : "+amount);
		System.out.println("refund() of CardPayment ");
	}
}
public class OnlineShoppingSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Orders");
		int size = sc.nextInt();
		sc.nextLine();
		Order []order = new Order[size];
		Product[] product;
		for(int i = 0 ; i < order.length ; i++){
		    System.out.println("Enter Order "+(i+1)+" Details ");
			System.out.println("Enter Customer Name : ");
			String custName = sc.nextLine();
			
			System.out.println("Enter No. of products taken by Customer");
			int productSize = sc.nextInt();
			if(productSize <= 0){
                System.out.println("Invalid product count!");
                return;
            }
			product = new Product[productSize];
			
			for(int j = 0 ; j < product.length ; j++){
		        System.out.println("Enter Product "+(j+1)+" Details ");

			    System.out.println("Enter Product Id : ");
			    int prdId = sc.nextInt();
			    sc.nextLine();
			
			    System.out.println("Enter Product Name : ");
			    String prdName = sc.nextLine();
			
			    System.out.println("Enter Product Price : ");
				String prdPrice = "";
				while(true){
					try{
			            prdPrice = sc.next();
				         Double.parseDouble(prdPrice);
						 break;
				    }catch(NumberFormatException e){
					     System.out.println("Invalid price! Enter again:");
				    }
				}
				sc.nextLine();
				product[j] = new Product(prdId , prdName , prdPrice);
			}
			
			order[i] = new Order(custName , product);	
		}
	    for(int i = 0 ; i < order.length ; i++){
            System.out.println(order[i].bill());
		}
		
		UPIPayment upay = new UPIPayment();
		CardPayment cpay = new CardPayment();
		System.out.println("Enter Customer name ");
		String cust = sc.nextLine();
		boolean found = false;
		for(int i = 0 ; i < order.length ; i++){
			if(order[i].customerName.trim().equalsIgnoreCase(cust.trim())){
				found = true;
		        char choice = ' ';
				    System.out.println("Enter discount %:");
                    int discount = sc.nextInt();
                    double finalAmount = order[i].calculate(discount);
                    System.out.println("Final Amount after discount: " + finalAmount);
		        do{
					
					
		            System.out.println("Enter your mode of payment u/c/e (u = upi / c = card / e = exit)");
                    choice = sc.next().charAt(0);
		            switch(choice){
			            case 'u': upay.pay(finalAmount);
						        break;
			            case 'c': cpay.pay(finalAmount);
						        break;
			            case 'e': System.out.println("Exiting Payment Mode....");
			                    break;
			            default : System.out.println("Invalid Choice");         
						        
				    }
			    }while(choice != 'e');
			}
		}
		if(!found){
			System.out.println("Invalid Customer name Exiting  ");
		}
		System.out.println("Did you want refund ?");
		System.out.println("Enter your choice (y/n)(y = yes / n = no)");
		char ch = sc.next().charAt(0);
		if(ch == 'y'){
		    System.out.println("Enter Customer name ");
		    sc.nextLine();
		    String custRefund = sc.nextLine();
		    boolean found1 = false;
		    for(int i = 0 ; i < order.length ; i++){
			    if(order[i].customerName.equalsIgnoreCase(custRefund)){
				    found1 = true;
		            char choice1 = ' ';
				    do{
					   System.out.println("Enter your mode of Refund u/c/e (u = upi / c = card / e = exit)");
                       choice1 = sc.next().charAt(0);
		               switch(choice1){
			                case 'u':upay.refund(order[i].calculate());
						        break;
			                case 'c':cpay.refund(order[i].calculate());
						        break;
			                case 'e': System.out.println("Exiting Refund Mode....");
			                    break;
			                default : System.out.println("Invalid Choice");
				        }
			        }while(choice1 != 'e');
			    }
		    }
		}
		
		
		
		
		
		
		
		
	}
}