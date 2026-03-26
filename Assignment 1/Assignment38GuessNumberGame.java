// 38. Create a number guessing game. 
import java.util.Scanner;
import java.util.Random;
class Assignment38GuessNumberGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int a = rand.nextInt(100)+1;
		System.out.println("Guess a number Game : ");
		int guess = 0;
		boolean win = false;
		for(int i = 1 ; i <= 5 ;i++){
			System.out.println("Guess a number between 1 to 100 ");
			guess = sc.nextInt();
			if(guess == a){
					System.out.println("You win , you have guessed a right number ");
					win = true;
					break ;
			}	
			else if(guess > a){
					System.out.println("You have guessed a larger number ");
			}
			else if(guess < a)	
					System.out.println("You have guessed a smaller number ");
				
		}
		if(!win){
			System.out.println("You Lose ");
			System.out.println("Randomly Choosen number was : "+a);
		}
		
	}
}

