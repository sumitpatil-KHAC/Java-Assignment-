// 24. Write a program to find largest digit in a number. 
import java.util.Scanner;
class Assignment24largestdigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		int max = 0;
		
		while( a > 0){
		    int rem = a % 10;
			if( rem > max)
				max = rem ;
		    a = a / 10;
			
		}
			
		System.out.println("Largest digit is "+max);
		
	}
}
