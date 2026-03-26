// 29. Create a menu-driven program: 
// 1. Add 
// 2. Subtract 
// 3. Exit 

import java.util.Scanner;
class Assignment29{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a , b , total;
		int ch ;
		do{
			System.out.println("1. Add ");
			System.out.println("2. Subtract ");
			System.out.println("3. Exit ");
			System.out.println("Enter your Choice");
			ch = sc.nextInt();
			switch(ch){
				case 1 : System.out.println("Enter first number ");
				         a = sc.nextInt();
						 System.out.println("Enter second number ");
				         b = sc.nextInt();
						 total = a + b;
						 System.out.println("Addition is : "+total);
						 break;
				case 2 : System.out.println("Enter first number ");
				         a = sc.nextInt();
						 System.out.println("Enter second number ");
				         b = sc.nextInt();
						 total = a - b;
						 System.out.println("Subtraction is : "+total);
						 break;
				case 3 : System.out.println("Exit ");
				         break;
                default : System.out.println("Not a valid choice");						 
			}
		}while(ch != 3 );
	}
}	