/* 2. Student Result Processing System 
Create a program for a school to manage a student’s marks. 
Requirements 
Accept student name, roll number, and marks in 5 subjects. 
Calculate total, average, percentage. 
Display grade using conditions: 
 90 and above → A 
 75 to 89 → B 
 60 to 74 → C 
 40 to 59 → D 
 Below 40 → Fail 
 Show whether the student is promoted or not.
*/
import java.util.Scanner;
class Student{
	String studentName ;
	int rollNumber;
	double []marks;
	
	Student(){
		studentName = null;
		rollNumber = 0;
		marks = new double[5];
	}
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	public String getStudentName(){
		return studentName;
	}
	
	public void setRollNumber(int rollNumber){
		this.rollNumber = rollNumber;
	}
	public int getRollNumber(){
		return rollNumber;
	}
	public void setMarks(int index ,double value){
		marks[index] = value;
	}
	double total ;
	double avg ;
	double percentage ;
	String grade;
	
	boolean promoted ;
	
	public void calculate(){
		total = 0;
		for(double m : marks){
			total += m;
			if(m < 40)
				promoted = false;
		}
		avg = total / (marks.length);
		percentage = total / marks.length*100 ; 
		if(percentage >= 90 )
			grade = "A";
		else if(percentage >= 75 )
			grade = "B";
		else if(percentage >= 60 )
			grade = "C";
		else if(percentage >= 40 )
			grade = "D";
		else 
			grade = "Fail";
	}
	public void printDetails(){
		System.out.println("Student Name        : "+getStudentName());
		System.out.println("Student Roll Number : "+getRollNumber());
		System.out.print("Marks in 5 subjects : ");
		for(double i : marks){
			System.out.print(i+"  ");
		}
		System.out.println("");
		System.out.println("Total Marks         : "+this.total);
		System.out.println("Average             : "+this.avg);
		System.out.println("Percentage          : "+this.percentage);
		System.out.println("Grade               : "+this.grade);
		if(promoted){
			System.out.println("Student is promoted");
		}	
		else 
			System.out.println("Student is not promoted");
		
		
	}
}
public class StudentResult{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("Enter Student Name : ");
		s.setStudentName(sc.nextLine()) ;
		
		System.out.println("Enter Roll Number : ");
		s.setRollNumber(sc.nextInt()) ;
		
		System.out.println("Enter marks of 5 subjects out of 100 for each");
        for(int i = 0 ; i < 5 ; i++){
		    System.out.print("Subject "+(i+1)+" : ");
			s.setMarks(i,sc.nextDouble());
		}
		
		s.calculate();
		s.printDetails();
		
		
	}
}