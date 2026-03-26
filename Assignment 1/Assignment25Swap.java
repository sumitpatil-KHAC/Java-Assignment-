// 25. Write a program to swap two numbers: 
// With third variable 
// Without third variable 
import java.util.Scanner;
class Assignment25Swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first  number");
		int a = sc.nextInt();
		int temp ;
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swap numbers are a is "+a);
		System.out.println("Swap numbers are b is "+b);
		
		// Without third variable 
		a = a + b ;
        b = a - b ;
        a = a - b ;
       	System.out.println("Swap numbers are a is "+a);
		System.out.println("Swap numbers are b is "+b);		
		
		
		
	}
}