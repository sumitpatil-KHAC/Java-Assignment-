// 10. Write a program to check whether a character is: 
// Vowel or consonant
import java.util.Scanner;
class Assignment10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char ch ;
		System.out.println("Enter a Character ");
		ch = sc.next().charAt(0);
		if(ch == 'A' || ch == 'a' ||
		   ch == 'E' || ch == 'e' ||
		   ch == 'I' || ch == 'i' ||
		   ch == 'O' || ch == 'o' ||
		   ch == 'U' || ch == 'u' ){
		   System.out.println(ch+" is a Vowel ");
		   }
        else			
		   System.out.println(ch+" is a Consonant ");	        
    }
}



