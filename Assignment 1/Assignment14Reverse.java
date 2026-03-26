// 14. Write a program to reverse a number. 
import java.util.Scanner;
class Assignment14Reverse{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = 0;
		while(a > 0){
			int rem = a % 10;
			temp = temp*10 + rem;
			a = a / 10;
		}
		System.out.println(temp);
	}
}