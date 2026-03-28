/*
15. Student Marks Table 
Create a program: 
Requirements: 
 Store marks of 3 students in 3 subjects using 2D array 
 Calculate: 
 Total per student 
 Average marks 
 Display in table format 
*/
import java.util.Scanner;

public class StudentMarksTable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String []name = new String[3];
		int [][]marks = new int[3][3]; 
		
		for(int i = 0 ; i < 3 ; i++){
			System.out.println("Enter Student Name "+(i+1)+" : ");
			name[i] = sc.nextLine();
			for(int j = 0 ; j < 3 ; j++){
				System.out.println("Enter marks of "+(j+1)+" Subject ");
				marks[i][j] = sc.nextInt();
			
			}
			sc.nextLine();
		}
		System.out.println("\nName\tSub1\tSub2\tSub3\tTotal\tAverage");
		for(int i = 0 ; i < 3 ; i++){
			int total = 0;
			System.out.print(name[i]+"\t");
			for(int j = 0 ; j < 3 ; j++){
				System.out.print(marks[i][j]+"\t");
				total += marks[i][j];
			}
			double average = total / 3.0;
			System.out.print(total+"\t"+average);
			System.out.println();
		}
		
	}
}