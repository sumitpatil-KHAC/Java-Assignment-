// 13. Write a program to print multiplication table of a number. 
import java.util.Scanner;
class Assignment13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		for(int i = 1 ; i <= 10 ; i++){
			System.out.println(a+" * "+i+" = "+a*i);
		}			
	}
}