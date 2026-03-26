// 18. Write a program to print Fibonacci series up to N terms.
import java.util.Scanner;
class Assignment18Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 0; i <= n ; i++){
			System.out.print(a+" ");
			int next = a + b;
			a = b;
			b = next ;
		}
	}
}