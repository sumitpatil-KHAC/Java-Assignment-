/*
Question 10: Design a Transport Ticket System 
Requirements: 
Each ticket has: 
 Ticket ID, passenger name 
 Source, destination 
 Fare 
System should: 
 Store multiple bookings 
 Calculate total fare 
 Update fare 
Display: 
 Ticket details
*/
import java.util.Scanner;
class Ticket{
	int ticketId;
	String passengerName;
	String source;
	String destination;
	int ticketFare;
	
	
	Ticket(int ticketId , String passengerName , String source , String destination , int ticketFare){
		this.ticketId = ticketId;
		this.passengerName = passengerName ;
		this.source = source;
		this.destination = destination;
		this.ticketFare = ticketFare;
		
	}
	void updateFare(int newFare){
		this.ticketFare = newFare;
	}
	void printDetails(){
		System.out.println("Ticket Id      : "+ticketId);
		System.out.println("Passenger Name : "+passengerName);
		System.out.println("Source         : "+source);
		System.out.println("Destination    : "+destination);
		System.out.println("Ticket Fare    : "+ticketFare);
		System.out.println("--------------------------------");
	}
	
}
public class TransportTicketSystem{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter no. of Tickets to Book ");
		int size = sc.nextInt();
		sc.nextLine();
		Ticket []booking = new Ticket[size];
		for(int i = 0 ; i < booking.length ; i++){
		    System.out.println("Enter Details of "+(i+1)+" Passenger ");
			System.out.println("Enter Ticket Id : ");
			int tickId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Passenger Name ");
			String passengerName = sc.nextLine();
			
			System.out.println("Enter Source Name ");
			String sourceName = sc.nextLine();
			
			System.out.println("Enter Destination Name ");
			String destinationName = sc.nextLine();
			
			System.out.println("Enter Ticket Fare : ");
			int ticketFare = sc.nextInt();
			
			booking[i] = new Ticket(tickId , passengerName , sourceName , destinationName ,ticketFare);
			
			
		}
		System.out.println("============ Ticket Booking Details ============");
	    int totalFare = 0 ;
	    
		for(int i = 0 ; i < booking.length ; i++){
			totalFare += booking[i].ticketFare;
			booking[i].printDetails();
		}
		System.out.println("Total Fare : "+totalFare);
        
		System.out.println("===========================");
		System.out.println("Did you want to update Fare ");
		System.out.println("Enter your choice y/n (yes/no)");
		char c = sc.next().charAt(0);
		if( c == 'y' ){
			System.out.println("Enter Ticket Id");
			int tickId = sc.nextInt();
			boolean found = false;
			for(int i = 0 ; i < booking.length ; i++){
				if(booking[i].ticketId == tickId ){
					found = true;
					System.out.println("Enter new Fare : ");
					int newFare = sc.nextInt();
				    booking[i].updateFare(newFare);
					System.out.println("Fare updated Successfully ");
				}
			}
			if(!found){
				System.out.println("Invalid Ticket Id ,Exited Successfully ");
			}
		}
		if(c == 'n')
			System.out.println("Exiting......");
			
		
	}
}