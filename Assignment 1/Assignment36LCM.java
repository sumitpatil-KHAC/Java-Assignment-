// 36. Find LCM of two numbers. 
import java.util.Scanner;
class Assignment35GCD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = sc.nextInt();
		System.out.println("Enter second number ");
		int b = sc.nextInt();
		int gcd = 0;
		while(b != 0){
			int rem = a % b;
			a = b;
			b = rem;
		}
		gcd = a ;
        int lcm = (a*b)/gcd; 		
		System.out.println("LCM is "+lcm);	
	}
}