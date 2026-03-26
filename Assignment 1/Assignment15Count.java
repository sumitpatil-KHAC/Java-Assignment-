// 15. Write a program to count digits in a number. 
import java.util.Scanner;
class Assignment15Count{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		int count = 0;
		while( a != 0){
            a = a / 10;
            count++;			
		}
		System.out.println("Count: "+count);
		
	}
}