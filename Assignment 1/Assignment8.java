// 8. Write a program to check whether a year is a leap year. 
import java.util.Scanner;
class Assignment8{
	public static void main(String[] args){
		Scanner sc =  new Scanner (System.in);
		int year;
		System.out.println("Enter year");
		year = sc.nextInt();
		if(year%4 == 0 || year%100 == 0 || year%400 == 0)
			System.out.println(year+ " Is a Leap year ");
		else 
			System.out.println(year+ " Is not a Leap Year");
	}
}