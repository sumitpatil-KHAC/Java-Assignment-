/*
12. Student Counter System 
Create a class Student: 
Requirements: 
 Instance variables: name, rollNo 
 Static variable: totalStudents 
 Increment totalStudents every time object is created 
 Display total number of students 
Bonus: Add a static method to display count 
*/
class Student{
	String name ;
	int rollNumber;
	static int totalStudents = 0;
	Student(){
		totalStudents++;
	}
	Student(String name ,int rollNumber ){
		this.name = name;
		this.rollNumber = rollNumber; 
		totalStudents++;
	}
	static void print(){
	    System.out.println("Total Students : "+totalStudents);
	}
}
public class StudentCounterSystem{
	public static void main(String[] args){
		Student s = new Student();
		Student s1 = new Student("Sumit",101);
		Student s2 = new Student("Tanmay",102);
		Student.print();
	}
}