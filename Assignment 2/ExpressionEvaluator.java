/*
18. Expression Evaluator 
Create a program: 
Requirements: 
 Take 3 numbers 
 Perform: 
 (a + b) * c 
 a > b && b > c 
 a % b 
 Show results with explanation
*/
import java.util.Scanner;
public class ExpressionEvaluator{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter 3 numbers ");
		System.out.println("Enter 1st number ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number ");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number ");
		int c = sc.nextInt();
		
		System.out.println("(a + b) * c = (" + a + " + " + b + ") * " + c + " = " + ((a+b)*c));

        System.out.println("a > b && b > c = (" + a + " > " + b + ") && (" + b + " > " + c + ") = " + (a > b && b > c));
        if(b != 0){
            System.out.println("a % b = remainder when " + a + " is divided by " + b + " = " + (a % b));
        } else {
            System.out.println("Cannot divide by zero");
        }
		
		
		
	}	
}