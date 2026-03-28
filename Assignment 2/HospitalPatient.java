/*
8. Hospital Patient Record System 
Create a simple patient management program. 
Requirements 
 Create a class Patient with: 
 patient ID 
 patient name 
 age 
 disease 
 Create objects for at least 3 patients. 
 Display patient details. 
 Add a method to check whether the patient is a senior citizen (age 60 or above).
*/
import java.util.Scanner;
class Patient{
	int patientId;
	String patientName;
	int age;
	String disease;
	Patient(int patientId , String patientName , int age , String disease){
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.disease = disease;
	}
	
	void checkAge(){
		if(age >= 60 && age <= 150){
			System.out.println("Patient is a Senior Citizen");
		}
		else if(age >= 25 && age <= 59){
			System.out.println("Patient is Adult ");
		}
		else if(age >= 18 && age <= 24){
			System.out.println("Patient is Mature");
		}
		else if(age > 0 && age <= 17){
			System.out.println("Patient is a Child");
		}
		else 
			System.out.println("Invalid Age ");
	}
	void printDetails(){
		System.out.println("Patient Id      : "+patientId);
		System.out.println("Patient Name    : "+patientName);
		System.out.println("Patient Age     : "+age);
		System.out.println("Patient Disease : "+disease);
		checkAge();

	}
}
class HospitalPatient{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Patient to add");
		int noOfPatient = sc.nextInt();
		Patient pat[] = new Patient[noOfPatient];
		for(int i = 0 ; i < pat.length ;i++){
			System.out.println("Enter  "+(i+1)+" Patient Details");
			System.out.println("Enter Patient Id : ");
			int patientId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Patient Name : ");
			String patientName = sc.nextLine();
			System.out.println("Enter Patient Age : ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Patient Disease : ");
			String disease = sc.nextLine();
			
			pat[i] = new Patient(patientId,patientName,age,disease);
		}
		for(int i = 0 ; i < noOfPatient ; i++){
			pat[i].printDetails();
		}
	}
}