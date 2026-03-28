/*
16. Weekly Work Hours 
Create a program: 
Requirements: 
 Each employee works different number of days 
 Use jagged array to store hours 
 Display all employee work hours 
*/
import java.util.Scanner;

public class WeeklyWork{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter No. of Employees ");
		int no = sc.nextInt();
		int [][]emp = new int[no][];
		for(int i = 0 ; i < emp.length ; i++){
			System.out.println("Enter no. of days employee work ");
			int days = sc.nextInt();
			emp[i] = new int[days];
			for(int j = 0 ; j < emp.length ; j++){
			    System.out.print("Enter hours for day " + (j+1) + ": ");
				emp[i][j] = sc.nextInt();
			}				
		}
		System.out.println("\nEmployee Work Hours:");
		for(int i = 0 ; i < emp.length ; i++){
			System.out.print("Employee " + (i+1) + ": ");
			for(int j = 0 ; j < emp.length ; j++){
				System.out.print(emp[i][j]+"\t");
			}				
			System.out.println();
		}
	}
}