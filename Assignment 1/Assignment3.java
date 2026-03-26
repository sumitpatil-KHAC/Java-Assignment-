// 3. Write a program to convert: 
// int → double 
// double → int 
class Assignment3{
	public static void main(String[] args){
		int i = 10;
		double d = 20.1234567;
		i = (int)d ;  // Explicit Conversion
		d = i ;  // Implicit Conversion
		System.out.println("Value of i = "+i);
	    System.out.println("Value of d = "+d);

    }
}	
// Value of i = 20
// Value of d = 20.0



