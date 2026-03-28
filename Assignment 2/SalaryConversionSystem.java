/*
14. Salary Conversion System 
Create a program: 
Requirements: 
 Take the salary as double 
 Convert it into: 
 int (explicit casting) 
 float (implicit casting) 
 Show the precision loss clearly 
*/
import java.util.Scanner;
public class SalaryConversionSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary in double ");
		double salDouble = sc.nextDouble();
		int salInt = (int) salDouble;
		float salFloat = (float)salDouble;
		
		System.out.println("Salary in Double  : "+salDouble);
		System.out.println("Salary in Integer : "+salInt);
		System.out.println("Salary in Float   : "+salFloat);
		System.out.println("Precision loss from double to int "+(salDouble - salInt));
		System.out.println("Precision loss from double to float "+(salDouble - salFloat));
		// Demonstrating implicit conversion correctly
		float f = 100.5f;
		double d = f;   // implicit
		System.out.println("Implicit (float --> double): " + d);
	}
}	