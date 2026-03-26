// 12. Write a program to print sum of first N natural numbers. 
import java.util.Scanner;
class Assignment12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= n ; i++){
			sum = sum + i;
		}
        System.out.println("Sum of first "+n+" is " +sum);		
	}
}