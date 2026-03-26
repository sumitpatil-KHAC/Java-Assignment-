// 37. Check whether a number is perfect number. 
import java.util.Scanner;
class Assignment37PerfectNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i < a ; i++){
			if( a % i == 0 )
				sum = sum+i;
		}
		if( sum == a )
		    System.out.println(a+" is a perfect number ");
	    else
			System.out.println(a+" is not a perfect number ");

	}
}