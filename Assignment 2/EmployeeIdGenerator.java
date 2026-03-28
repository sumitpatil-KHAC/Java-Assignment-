/*
19. Employee ID Generator 
Create a class Employee: 
Requirements: 
 Static variable: counter 
 Each employee gets auto-incremented ID 
 Use constructor to assign ID 
 Display employee details 
*/
class Employee{
	static int counter;
	int empId;
	String name ;
	Employee(){
		counter++;
		empId = counter;
	}
	Employee(String name){
		this();
		this.name = name;
	}
	void printDetails(){
		System.out.println("Emp Id   : "+empId);
		System.out.println("Emp Name : "+name);
	}
}
public class EmployeeIdGenerator{
	public static void main(String[] args){
		Employee e = new Employee();
		Employee e1 = new Employee("Sumit");
		e.printDetails();
		e1.printDetails();
	}
}