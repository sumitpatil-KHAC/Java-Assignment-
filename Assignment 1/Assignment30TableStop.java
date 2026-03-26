// 30. Take a number and print its table until user stops (use loop).

import java.util.Scanner;
class Assignment30TableStop{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int choice ;
		do{
		    System.out.println("Enter a number ");
		    int a = sc.nextInt();
			
		    for(int i = 0 ; i <= 10 ; i++){
				System.out.println(a+" * "+i+" = "+(a*i));
		    }
			System.out.println("Did you want to continue (1 = yes and 0 = no)");
			choice = sc.nextInt();
			
		}while(choice == 1);
	}
	
}