// 6. Write a program to check whether a number is: 
// Positive 
// Negative 
// Zero
import java.util.Scanner;
class Assignment6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		if(val > 0 )
			System.out.println("Positive");
		else if(val < 0 )
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}
}


