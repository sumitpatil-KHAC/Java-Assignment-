/*
Question 4: Design a Hospital Management System 
Requirements: 
Each patient has: 
 Patient ID, name, age 
 Disease 
 Contact details 
System should: 
 Store multiple patients 
 Identify senior citizens (age ≥ 60) 
 Count total patients 
Support: 
 Use object composition (Patient → ContactDetails) 
C-DAC Mumbai
Display: 
 Patient details with status 
*/
import java.util.Scanner;
class ContactDetails{
	long mobileNo;
	String address;
	
	ContactDetails(long mobileNo , String address){
		this.mobileNo = mobileNo;
		this.address = address;
	}
}
class Patient{
	int patientId;
	String name ;
	int age;
	String disease;
	ContactDetails cd ;
	static int count;
	
	Patient(int patientId ,String name , int age , String disease ,  long mobileNo , String address ){
		this.patientId = patientId;
		this.name = name ;
		this.age = age;
		this.disease = disease;
		this.cd = new ContactDetails(mobileNo , address);
		count++;
	}
	void checkAge(){
		if(age >= 60)
		    System.out.println("Status : Senior Patient ");	
		else 
			System.out.println("Status : Normal Patient ");	
	}
	void printDetails(){
		System.out.println("Id      : "+patientId);
		System.out.println("Name    : "+name);
		System.out.println("Age     : "+age);
		System.out.println("Disease : "+disease);
		System.out.println("Mobile No : "+cd.mobileNo);
		System.out.println("Address : "+cd.address);
	}
}
public class HospitalManagementSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of Patient to add");
		int size = sc.nextInt();
		Patient p[] = new Patient[size];
		for(int i = 0 ; i < p.length ; i++){
			System.out.println("Enter Details of "+(i+1)+" Patient ");
			
			System.out.println("Enter Patient Id : ");
			int pId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Patient Name ");
		    String pName = sc.nextLine();
			
			System.out.println("Enter Patient Age");
			int page = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Patient Disease ");
			String pdis = sc.nextLine();
			
			System.out.println("Enter Patient Mobile Number ");
			long pmob = sc.nextLong();
			sc.nextLine();
			
			System.out.println("Enter Patient Address ");
			String padr = sc.nextLine();
			p[i] = new Patient(pId , pName , page , pdis ,pmob , padr );
		}
		for(int i = 0 ; i < p.length ; i++){
			p[i].printDetails();
			p[i].checkAge();
		}
	}
}