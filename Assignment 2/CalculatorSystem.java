/*
11. Calculator System (Overloaded Methods) 
Create a Java program for a calculator: 
Requirements: 
 Create methods named calculate 
 Overload them for: 
 int + int 
 double + double 
 int + int + int 
 Call all methods from main 
 Display results clearly
*/
class Calculator{
	
	void calculate(int num1 , int num2){
		System.out.println("Addition of int " +num1+" + "+num2+" is : "+(num1+num2));
	}
	void calculate(double num1 , double num2){
		System.out.println("Addition of double " +num1+" + "+num2+" is : "+(num1+num2));
	}
	void calculate(int num1 , int num2 ,int num3){
		System.out.println("Addition of 3 int " +num1+" + "+num2+" + "+num3+" is : "+(num1+num2+num3));
	}
}
class CalculatorSystem{
	public static void main(String[] args){
		Calculator c = new Calculator();
        c.calculate(10 , 20);
		c.calculate(20.2,30.4);
		c.calculate(40,50,60);
	}
}