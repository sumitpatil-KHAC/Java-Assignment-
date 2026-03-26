// 2. Take two numbers (int and double) and perform: 
// Addition 
// Division 
// Type casting result to int

class Assignment2{
	public static void main(String[] args){
		int i = 10;
		double d = 20.5778;
		int sum ;
		sum = i +(int) d;
		System.out.println("Addition = "+sum);
	}
}
/*
class Assignment2{
	public static void main(String[] args){
		int i ;
		double d;
		i = Integer.parseInt(args[0]);
		d = Double.parseDouble(args[1]);
		int sum;
		sum =(int)(i + d) ;
		System.out.println("Addition = "+sum);
	}
}
*/
/*
Input : 10 20.1234567
Output : Addition = 30
*/