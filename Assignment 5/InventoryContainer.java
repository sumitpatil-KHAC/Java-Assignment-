/*
Question 1: E-Commerce Inventory Container 
An e-commerce company needs a flexible system to store different types of products (e.g., electronics, 
clothing, books). 
Task: 
Design a generic class Inventory<T> to store product items. 
Requirements: 
 Store a single product of type T 
 Provide methods to: 
 Add product 
 Retrieve product 
 Create and test the class with: 
 Electronics objects 
 Clothing objects 
 Display product details
*/
class Inventory<T>{
	T product;
	
	public void addProduct(T product){
		this.product = product;
	}
	public T getProduct(){
		return product;
	}
}
class Electronics{
	int id;
	String name;
	double price;
	
	Electronics(int id , String name , double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void display(){
        System.out.println("Electronics ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }	
	
}
class Clothing{
	int id;
	String name;
	double price;
	
	Clothing(int id , String name , double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void display(){
        System.out.println("Clothing ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }	
	
}
class Books{
	int id;
	String name;
	double price;
	
	Books(int id , String name , double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void display(){
        System.out.println("Books ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }	
	
}
public class InventoryContainer{
	public static void main(String[] args){
		Inventory<Electronics> electInvent = new Inventory<>();
		
		Electronics e1 = new Electronics(101,"laptop",75000);
		electInvent.addProduct(e1);
		
		Electronics retrieveElect = electInvent.getProduct();
		System.out.println("Electronics Detail");
		retrieveElect.display();
		
		System.out.println("========================");
		
		Inventory<Clothing> clothInvent = new Inventory<>();
		
		Clothing c1 = new Clothing(102,"Jeans",5000);
		clothInvent.addProduct(c1);
		
		Clothing retrieveCloth = clothInvent.getProduct();
		System.out.println("Clothing Detail");
		retrieveCloth.display();
		
		System.out.println("========================");
		
		Inventory<Books> booksInvent = new Inventory<>();
		
		Books b1 = new Books(103,"Eat that Frog",750);
		booksInvent.addProduct(b1);
		
		Books retrieveBooks = booksInvent.getProduct();
		System.out.println("Books Detail");
		retrieveBooks.display();
		
	}
}
