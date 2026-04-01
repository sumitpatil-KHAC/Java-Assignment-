/*
Question 7: Design an Employee Management System 
Requirements: 
Each employee has: 
 Employee ID, name 
 Salary 
System should: 
 Store multiple employees 
 Calculate salary with allowances 
 Track total employees 
Support: 
 Use method overloading for salary calculation 
Display: 
 Employee salary details
*/
import java.util.Scanner;
class Employee{
	int empId;
	String empName;
	double basicSalary;
	static int count ;
	
	Employee(int empId , String empName , double basicSalary){
	   this.empId = empId;
	   this.empName = empName;
	   this.basicSalary= basicSalary;
	   count++;
	}
    double totalSalary = 0;
    void calculateSalary(double hra) {
        totalSalary = basicSalary + hra ; 
		System.out.println("Basic Salary + HRA = "+totalSalary);
    }
	void calculateSalary(double hra , double specialAllowance){
        totalSalary = basicSalary + hra + specialAllowance;
		System.out.println("Basic Salary + HRA + specialAllowance = "+totalSalary);
		
    }
	void printDetails(){
		System.out.println("Employee Id           : "+empId);
		System.out.println("Employee Name         : "+empName);
		System.out.println("Employee Basic Salary : "+basicSalary);	
		System.out.println("Employee Total Salary : "+totalSalary);

	}
	
}
public class EmployeeManagementSystem{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Employee to add");
		int size = sc.nextInt();
		
		Employee e[] = new Employee[size];
		for(int i = 0 ; i < e.length ; i++){
			System.out.println("Enter Details of "+(i+1)+" Employee ");
			
			System.out.println("Enter Employee Id");
			int eId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Employee Name ");
			String eName = sc.nextLine();
			
			System.out.println("Enter Employee Salary ");
			double eSalary = sc.nextDouble();
			sc.nextLine();
			
			e[i] = new Employee(eId , eName , eSalary);
		}
		System.out.println("========= Employee Details ========");
		for(int i = 0 ; i < e.length ; i++){
			e[i].printDetails();
		}
	    System.out.println("Total Employees: " + Employee.count);

		System.out.println("Did you want to calculate the Salary based on HRA and Special Allowance ");
		System.out.println("Enter your choice (y/n)");
		char c = sc.next().charAt(0);
		if(c == 'y'){
			int choice = 0;
			System.out.println("Enter Employee Id");
			int eId = sc.nextInt();
			boolean found = false;
			for(int i = 0 ; i < e.length ; i++){
			    if(e[i].empId == eId){
					found = true;
			       do{
			       System.out.println("1. Calculate Salary based on HRA ");
			       System.out.println("2. Calculate Salary based on HRA ,Special Allowance ");
			       System.out.println("3. Exit ");
			       System.out.println("Enter your choice ");
			       choice = sc.nextInt();
			       sc.nextLine();
				   switch(choice){
					   case 1 :System.out.println("Enter HRA ");
					           double hra = sc.nextDouble();
							   e[i].calculateSalary(hra);
							  
					           break;
					   case 2 :System.out.println("Enter HRA ");
					           double hra1 = sc.nextDouble();
							   sc.nextLine();
							   System.out.println("Enter Special Allowance");
							   double specialAllowance = sc.nextDouble();
							   e[i].calculateSalary(hra1 , specialAllowance);
							   
					           break;
					   case 3 : System.out.println("Exiting.....");
					            break;
					   default : System.out.println("Invalid choice ");
					}
			       }while(choice != 3);
		        }	
		    }
			if(!found)
					System.out.println("Invalid eId");
		}
		else if(c == 'n'){
			System.out.println("You exited successfully");
		}
	}	
}