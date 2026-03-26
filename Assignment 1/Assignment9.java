// 9. Create a simple calculator using switch: 
// Input: two numbers + operator 
//  Perform: +, -, *, / 
import java.util.Scanner;
class Assignment9{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int ch ;
		int num1 ;
		int num2 ;
		System.out.println("Enter first number ");
		num1 = sc.nextInt();
		System.out.println("Enter second number");
		num2 = sc.nextInt();
		
		do{
			System.out.println("1. Addition ");
			System.out.println("2. Subtraction ");
			System.out.println("3. Multiplication ");
			System.out.println("4. Division ");
			System.out.println("5. Modulus ");
			System.out.println("Enter your Choice ");
		    ch = sc.nextInt();
			int total;
		    switch(ch)
			{
			case 1 : total = num1 + num2 ;
			         System.out.println("Addition : "+total);
					 break;
			case 2 : total = num1 - num2 ;
			         System.out.println("Subtraction : "+total);
					 break;
			case 3 : total = num1 * num2 ;
			         System.out.println("Multiplication : "+total);
					 break;
			case 4 : float div = (float)num1 / num2 ;
			         System.out.println("Division : "+div);
					 break;
			case 5 : total = num1 % num2 ;
			         System.out.println("Modulus: "+total);
					 break;
			default :System.out.println("Invalid choice ");
					 break;
		    }
		}while(ch < 5);
		
		
	}
}