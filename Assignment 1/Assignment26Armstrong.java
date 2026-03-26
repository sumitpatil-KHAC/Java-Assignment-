// 26. Write a program to check whether a number is Armstrong.
import java.util.Scanner;
class Assignment26Armstrong{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
		int a = sc.nextInt();
		int temp = 0;
		int original = a;
		while( a > 0){
		    int rem = a % 10;
			temp = temp + (rem * rem * rem );
			a = a / 10;
		}
		if(temp == original){
			System.out.println(temp+" is a Armstrong number");
		}
		else 
		    System.out.println(temp+" is not a Armstrong number");
	}
}