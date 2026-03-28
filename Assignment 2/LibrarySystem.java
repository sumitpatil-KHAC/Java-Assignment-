/*
20. Library System 
Create two classes: 
Class 1: Book 
 bookId, bookName 
Class 2: Library 
 Method to display books 
Requirements: 
 Create multiple books 
 Pass objects to library 
 Display all books 
*/
class Book{
	int bookId;
	String bookName;

	Book(int bookId , String bookName){
		this.bookId = bookId;
		this.bookName = bookName;
	}
}

class Library{
	Book[] books;

	Library(Book[] books){
		this.books = books;
	}

	void display(){
		System.out.println("Library Books:");
		for(int i = 0 ; i < books.length ; i++){
			System.out.println("Book ID   : " + books[i].bookId);
			System.out.println("Book Name : " + books[i].bookName);
			System.out.println("----------------------");
		}
	}
}

public class LibrarySystem{
	public static void main(String[] args){

		Book b1 = new Book(1,"Eat That Frog");
		Book b2 = new Book(2,"Bhagavad Gita");
		Book b3 = new Book(3,"Four Vedas");

		Book[] bookList = {b1, b2, b3};

		Library lib = new Library(bookList);
		lib.display();
	}
}