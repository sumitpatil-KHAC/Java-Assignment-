/* 
Question 2: Report Generator (Generic Method) 
A business analytics system needs to generate reports for different types of data (sales, employee names, 
product IDs). 
Task: 
Create a generic method to generate and display reports for any data type. 
Requirements: 
 Accept an array or list of any type 
 Print all elements in a formatted way 
 Test with: 
 Sales figures (Integer/Double) 
 Employee names (String) 
 Product IDs (Integer) 
*/
import java.util.Scanner;
class ReportGenerator{
	static <T> void display(T[] obj){
		System.out.println("\n===== " + title + " =====");
		for(T s : obj){
			System.out.println(s);
		}
        System.out.println("=========================");

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Double sales Array Size : ");
		int sizeI = sc.nextInt();
		Double[] sales = new Double[sizeI];
		System.out.println("Enter Sales value ");
		for(int i = 0 ; i < sales.length ; i ++){
			sales[i] = sc.nextDouble();
		}
		display(sales);
		System.out.println("Enter Employee Name Array Size : ");
		int sizeE = sc.nextInt();
		sc.nextLine();
		String[] name = new String[sizeE];
		System.out.println("Enter Employee Name ");
		for(int i = 0 ; i < name.length ; i ++){
			name[i] = sc.nextLine();
		}
		display(name);
		System.out.println("Enter Integer ProductId Array Size : ");
		int sizeP = sc.nextInt();
		Integer[] product = new Integer[sizeP];\
		System.out.println("Enter product value ");
		for(int i = 0 ; i < product.length ; i ++){
			product[i] = sc.nextInt();
		}
		display(product);
	}
}