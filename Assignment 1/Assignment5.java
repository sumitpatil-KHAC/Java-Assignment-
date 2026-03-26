// 5. Take a character input and print: 
// Next character 
// Previous character
import java.util.Scanner;

class Assignment5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char ch;

        System.out.print("Enter a character: ");
        ch = sc.next().charAt(0);   

        char next = (char)(ch + 1);
        char prev = (char)(ch - 1);

        System.out.println("Next character = " + next);
        System.out.println("Previous character = " + prev);
    }
}



