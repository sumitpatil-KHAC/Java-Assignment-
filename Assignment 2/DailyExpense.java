/*
9. Daily Expense Tracker 
Create a program to track a person’s daily expenses. 
Requirements 
 Accept expenses for 7 days in an array. 
 Calculate: 
 total weekly expense 
 average expense 
 highest expense 
 lowest expense 
 Display the day on which the highest expense occurred. 
*/
import java.util.Scanner;

class DailyExpense{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int expense[] = new int[7]; 
		System.out.println("Enter expense of 7Days each");
		for(int i = 0; i < expense.length ; i++){
			System.out.println("Enter Expense of "+(i+1)+" Day ");
			expense[i] = sc.nextInt();
		}
		int total =0 ;
		for(int i = 0; i < expense.length ; i++){
			total += expense[i];
		}
		System.out.println("Total Expense of 7 Days  : "+total);
		double average = (double)total / (expense.length);
		System.out.println("Average Expense each Day : "+average);
		int highest = expense[0];
		int lowest = expense[0];
		int highestDay = 1;
		for(int i = 0; i < expense.length ; i++){
		    if(expense[i] > highest){
				highest = expense[i];
				highestDay = i+1;
			}
			if(expense[i] < lowest)
				lowest = expense[i];
		}
		System.out.println("Highest Expense of 7 Day : "+highest);
		System.out.println("Lowest Expense of 7 Day  : "+lowest);
		System.out.println("Highest Expense Day      : "+highestDay);
	}
}