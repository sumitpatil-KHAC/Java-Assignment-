// 16. Write a program to check whether a number is palindrome. 
import java.util.Scanner;
class Assignment16Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int org = a ;
		int temp = 0;
		while(a > 0){
			int rem = a % 10;
			temp = temp * 10 + rem;
			a = a / 10;
		}
		if( org == temp){
			System.out.println(temp+ " is a Palindrome");
		}
		else
			System.out.println(temp+ " is not a Palindrome");
			
		
	}
}
