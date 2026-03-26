// 28. Take user age and: 
// Check eligibility for voting 
import java.util.Scanner;
class Assignment28{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if( age >= 1 && age <= 200){
		    if(age > 18)
			   System.out.println("Eligible for voting");
		    else
		       System.out.println("Eligible for voting");
		}
		else 
			System.out.println("Not a valid age");
	}
}