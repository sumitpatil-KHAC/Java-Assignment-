/*
Question 1: Design a College ERP (Student Module) 
Requirements: 
 Each student has: 
 Roll number, name 
 Marks in multiple subjects 
 Contact details (phone, email) 
 System should: 
 Store multiple students 
 Calculate total & average marks 
 Track total students admitted 
 Support: 
 Flexible average calculation 
 Display formatted student report 
*/
import java.util.Scanner;
class Student{
	int rollNumber;
	String name;
    int marks[];
	long phone ;
	String email;
	static int count= 0;
	
	
	Student(){
	}
	Student(int index ,int rollNumber , String name , int marks[] , long phone , String email){
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.phone = phone;
		this.email = email;
		
		count++;
	}
	
	/*
	void printDetails(){
		int total = 0;
		System.out.println("Student Roll Number : "+rollNumber);
		System.out.println("Student Name        : "+name);
		for(int i = 0 ; i < 3 ; i++){
			total += marks[i];
		    System.out.println("Student Marks   : "+marks[i]);
		}
		System.out.println("Student Phone       : "+phone);
		System.out.println("Student Email       : "+email);
		System.out.println("Student Total Marks : "+total);
		double avg = 0;
		avg = total / 3.0 ;
		System.out.println("Student Average Marks: "+avg);
	    System.out.println("Students Admitted are: "+count);
	}
	*/
	void printDetails() {
    int total = 0;

    for (int m : marks) {
        total += m;
    }

    double avg = total / (double) marks.length;
    System.out.printf("%-10s %-15s %-15s %-10s %-15s %-25s\n",
	        "Roll Number",
		    "Name",
            "Total",
            "Average",
            "Phone",
            "Email");
    System.out.printf("%-10d %-15s %-15d %-10.2f %-15s %-25s\n",
            rollNumber,
            name,
            total,
            avg,
            phone,
            email);
    }
	
}
class CollegeERP{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Students you want to add ");
		int size = sc.nextInt();
		Student s[] = new Student[size];
		for(int i = 0 ; i < s.length ; i++){
			int index = i;
			System.out.println("Enter Student "+(i+1)+"Details");
			System.out.println("Enter Student Roll Number ");
			int roll = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Student Name ");
			String name = sc.nextLine();
			
			System.out.println("Enter Marks of 3 subject ");
			int []marks = new int[3];
			for(int j = 0 ; j < 3 ; j++){
				marks[j] = sc.nextInt();
			}
			sc.nextLine();
			System.out.println("Enter Student's Phone Number ");
			long phone = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter Student's email ");
			String email = sc.nextLine();
			
			s[i] = new Student(index,roll,name,marks,phone , email );
		}
		for(int i = 0 ; i < s.length ; i++){
            s[i].printDetails();
		}
	
	}
	
}