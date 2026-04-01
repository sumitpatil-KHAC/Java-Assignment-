/*
Question 2: Design a Fleet Management System 
Requirements: 
 Base class: Vehicle 
 Derived classes: Car, Bike 
 System should: 
 Track brand & speed 
 Store fuel type / mileage 
 Use: 
 Static block → system initialization 
 Non-static block → object creation log 
 Allow: 
 Updating vehicle speed 
 Display vehicle details
*/
import java.util.Scanner;
class Vehicle{
	int noOfWheels;
	String fuelType;
	String brand;
	int speed;
	static{
		System.out.println("Fleet Management System is initialized ");
	}
	{
		System.out.println("Vehicle object created...");

	}
	Vehicle(int noOfWheels , String fuelType , String brand , int speed ){
		this.noOfWheels = noOfWheels;
		this.fuelType = fuelType;
		this.brand = brand;
		this.speed = speed;
	}
	void updateSpeed(int newSpeed){
		this.speed = newSpeed;
		System.out.println("Updated Speed is "+speed);
	}
	void printDetails(){
		System.out.println("Wheels : "+noOfWheels+" Wheels");
		System.out.println("Fuel Type      : "+fuelType);
		System.out.println("Brand     : "+brand);
		System.out.println("Top Speed : "+speed);
		
	}

}
class Car extends Vehicle{
	
	int mileage;
	Car(int noOfWheels , String fuelType , String brand , int speed , int mileage){
		super(noOfWheels , fuelType , brand , speed);
		this.mileage = mileage; 
	}

	
	void printDetails(){
		super.printDetails();
		System.out.println("Car Mileage   : "+mileage);
		
	}
	
}
class Bike extends Vehicle{
	int mileage;
	Bike(int noOfWheels , String fuelType , String brand , int speed , int mileage){
		super(noOfWheels , fuelType , brand , speed);
		this.mileage = mileage;
	}
	
	void printDetails(){
		super.printDetails();
		System.out.println("Bike Mileage   : "+mileage);
		
	}
	
}
public class FleetManagementSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Car c = new Car(4,"Diesel","Mahindra",140 ,14);
		Bike b = new Bike(2,"Petrol","Honda",120 ,60);
		b.printDetails();
		c.printDetails();
		System.out.println("Did you want to update speed (y/n) (y=yes , n = no)");
		System.out.println("1. Car \n 2.Bike ");
		System.out.println("Enter your choice ");
		int ch = sc.nextInt();
		System.out.println("Enter your choice (y/n)");
		char c1 = sc.next().charAt(0);
		
		if(c1 == 'y'){
			switch(ch){
			    case 1 : System.out.println("Enter new Speed of Car");
				        int speed = sc.nextInt();
			            c.updateSpeed(speed);
					    break;
				case 2 : System.out.println("Enter new Speed of Bike");
				        int s = sc.nextInt();
			            b.updateSpeed(s);
					    break;
				default : System.out.println("Invalid choice");
			}
		}
		else if(c1 == 'n'){
			System.out.println("Thank You .....!");
		}
		
		
	}
}