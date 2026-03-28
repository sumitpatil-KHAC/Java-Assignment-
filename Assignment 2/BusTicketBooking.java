/*
6. Bus Ticket Booking System 
Create a program for booking bus seats. 
Requirements 
 Assume a bus has 10 seats. 
 Use an array to mark seats as booked or available. 
 Show a menu: 
1. View Available Seats 
2. Book a Seat 
3. Cancel a Seat 
4. Exit 
 Do not allow double booking.
*/
import java.util.Scanner;
class BusTicketBooking{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        // true = booked , false = availabe 
		boolean seats[] = new boolean[10];
		int ch;
		do{
			System.out.println("1. View Available Seats");
			System.out.println("2. Book a Seat");
			System.out.println("3. Cancel a Seat ");
			System.out.println("4. Exit");
			
			System.out.println("Enter your choice ");
			ch = sc.nextInt();
			
			switch(ch){
				case 1 :System.out.println("Available Seats are "); 
				        for(int i = 0 ; i < seats.length ; i++){
				            if(seats[i] == false)
								System.out.println("Seat "+(i+1)+" is Available");
							else 
								System.out.println("Seat "+(i+1)+"is not Available");
						}
						break;
				case 2 :System.out.println("Enter Seat no. to Book(1-10)");
                        int bookSeat = sc.nextInt();
						if(bookSeat < 1 || bookSeat > 10){
							System.out.println("Invalid Seat No.");
						}
						else if(seats[bookSeat -1 ])
							System.out.println("Seat Already book "+bookSeat);
						else {
						    seats[bookSeat-1] = true;
							System.out.println("Seat No. "+bookSeat+" Booked Successfully ");
						}
						break;
				case 3 : System.out.println("Enter Seat No. to cancel seat(1-10)");
				        int cancelSeat = sc.nextInt();
						if(cancelSeat < 1 || cancelSeat > 10){
							System.out.println("Invalid Seat No.");
						}
						else if(!seats[cancelSeat -1 ])
							System.out.println("Seat is already available "+cancelSeat);
						else {
						    seats[cancelSeat-1] = false;
							System.out.println("Seat No. "+cancelSeat+" Cancelled Successfully ");
						}
						break;
				case 4 : System.out.println("Exiting... Thank you!");
                         break;
                default:
                        System.out.println("Invalid choice! Try again.");
			}
		}while(ch!=4);
	}
}