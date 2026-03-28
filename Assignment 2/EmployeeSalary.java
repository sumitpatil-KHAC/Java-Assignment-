/*
5. Employee Salary Slip Generator 
Create a Java program to generate salary slips for employees. 
Requirements 
 Accept employee name, ID, basic salary. 
 Calculate: 
 HRA = 20% of basic salary 
 DA = 10% of basic salary 
 PF = 8% of basic salary 
 Calculate net salary. 
 Display a formatted salary slip.
*/
import java.util.Scanner;
class Salary{
	String empName ;
	int empId;
	double empBasicSal;
	double hra;
	double da;
	double pf;
	double netSal ;
	
	Salary(){
		
	}
	public void setEmpName(String empName){
		this.empName = empName;
	}
	public String getEmpName(){
		return empName;
	}
	public void setEmpId(int empId){
		this.empId = empId;
	}
	public int getEmpId(){
		return empId;
	}
	public void setEmpBasicSal(double empBasicSal){
		this.empBasicSal = empBasicSal;
	}
	public double getEmpBasicSal(){
		return empBasicSal;
	}
	public void calculate(){
		hra = empBasicSal * 0.2;
		da = empBasicSal * 0.1;
		pf = empBasicSal * 0.08;
		netSal = empBasicSal + hra + da - pf ;
	}
	public void printDetails(){

    System.out.println("\n============= SALARY SLIP =============");

    System.out.printf("%-20s : %s\n", "Employee Name", empName);
    System.out.printf("%-20s : %d\n", "Employee ID", empId);

    System.out.println("----------------------------------------");

    System.out.printf("%-20s : %10.2f\n", "Basic Salary", empBasicSal);
    System.out.printf("%-20s : %10.2f\n", "HRA (20%)", hra);
    System.out.printf("%-20s : %10.2f\n", "DA (10%)", da);
    System.out.printf("%-20s : %10.2f\n", "PF (8%)", pf);

    System.out.println("----------------------------------------");

    System.out.printf("%-20s : %10.2f\n", "Net Salary", netSal);

    System.out.println("========================================");
}
	
	
}
class EmployeeSalary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Salary s = new Salary();
		
		System.out.println("Enter Employee Name : ");
		s.setEmpName(sc.nextLine());
		
		System.out.println("Enter Employee Id : ");
		s.setEmpId(sc.nextInt());
		
		System.out.println("Enter Employee Basic Salary : ");
		s.setEmpBasicSal(sc.nextDouble());
		
		s.calculate();
		s.printDetails();
		
	}
	
}