/*
Question 6: Design a Library Management System 
Requirements: 
Each book has: 
 Book ID, title, author 
 Availability status 
System should: 
 Store multiple books 
 Issue and return books 
 Prevent issuing unavailable books 
Support: 
 Track total books 
Display: 
 Available and issued books
*/
import java.util.Scanner;
class Book{
	int bookId;
	String bookTitle;
	String bookAuthor;
	int quantity;
	boolean available = false;
	static int count ;
	
	Book(int bookId, String bookTitle , String bookAuthor , int quantity){
		this.bookId = bookId;
		this.bookAuthor = bookAuthor;
		this.bookTitle = bookTitle;
		this.quantity = quantity;
		if(quantity > 0) 
		   available = true;
	    count++;
	}
	
	void issueBook(String name){
		if(quantity > 0){
			quantity--;
			System.out.println("Book Issued of Book Id "+bookId+" , "+bookTitle+" to "+name);
		}
		else
			System.out.println("Book out of stock");
	}
	void returnBook(){
		quantity += 1;
		System.out.println("Book Returned Successfully");
	}
	void printDetails(){
		System.out.println("Book Id       : "+bookId);
		System.out.println("Book Title    : "+bookTitle);
		System.out.println("Book Author   : "+bookAuthor);
		System.out.println("Book Quantity : "+quantity);
	}
	
}
public class LibraryManagementSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Books to add in Library ");
		int size = sc.nextInt();
		Book b[] = new Book[size];
		for(int i = 0 ; i < b.length ; i++){
			System.out.println("Enter Details of "+(i+1)+" Book ");
			
			System.out.println("Enter Book Id : ");
			int bId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Book Title ");
		    String bTitle = sc.nextLine();
			
			System.out.println("Enter Book Author ");
			String bAuthor= sc.nextLine();
			
			System.out.println("Enter Book Quantity");
			int bQty = sc.nextInt();
			sc.nextLine();
			b[i] = new Book(bId , bTitle , bAuthor , bQty );
		}
		System.out.println("========== Library ========== ");
		int totalBook = 0;
		for(int i = 0 ; i < b.length ; i++){
			totalBook += b[i].quantity;
			b[i].printDetails();
		}
		System.out.println("Total Book Types : "+Book.count);
		System.out.println("Total No. of Books "+totalBook);
		System.out.println("\nAvailable Books:");
        for(int i = 0; i < b.length; i++){
            if(b[i].quantity > 0){
                b[i].printDetails();
            }
        }

        System.out.println("\nOut of Stock Books:");
        for(int i = 0; i < b.length; i++){
            if(b[i].quantity == 0){
                b[i].printDetails();
            }
        }
		System.out.println("\nDo you want to issue/return book? (y/n)");
        char ch = sc.next().charAt(0);

        if(ch == 'y'){
            System.out.println("Enter Book Id:");
            int id = sc.nextInt();
            boolean found = false;

            for(int i = 0; i < b.length; i++){
                if(b[i].bookId == id){
                found = true;
				int choice;
				do{
                System.out.println("1. Issue Book");
                System.out.println("2. Return Book");
				System.out.println("3. Exit");
                choice = sc.nextInt();

                sc.nextLine();

                switch(choice){
                case 1:
                    System.out.println("Enter Student Name:");
                    String name = sc.nextLine();
                    b[i].issueBook(name);
                    break;

                case 2:
                    b[i].returnBook();
                    break;
				case 3: System.out.println("Exiting.....");	
                        break;
                default:
                    System.out.println("Invalid choice");
                }
                    b[i].printDetails(); 
			  }while(choice!=3);
            }
        }

        if(!found)
             System.out.println("Book not found");
        }
		System.out.println("\nUpdated Library:");
        for(int i = 0; i < b.length; i++){
            b[i].printDetails();
        }
	}
}
		
		
		
		
		
		

