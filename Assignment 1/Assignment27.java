// 27. Take marks of 5 subjects and: 
// Calculate total 
// Calculate percentage 
// Print grade (A/B/C/Fail) 
import java.util.Scanner;
class Assignment27{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for C++");
		int c = sc.nextInt();
		System.out.println("Enter marks for DBT");
		int d = sc.nextInt();
		System.out.println("Enter marks for Java");
		int j = sc.nextInt();
		System.out.println("Enter marks for WebProgramming");
		int w = sc.nextInt();
		System.out.println("Enter marks for Data Structures");
		int ds = sc.nextInt();
		int total = 0;
		total = c + d + j + w + ds;
		double percentage = 0.0;
		percentage = double (total / 5);
		if(percentage > 80 )
			System.out.println("Grade A with "+percentage);
		else if(percentage > 60 )
			System.out.println("Grade B with "+percentage);
		else if(percentage > 50 )
			System.out.println("Grade C with "+percentage);
		else
			System.out.println("Grade Fail with "+percentage);
	}
}