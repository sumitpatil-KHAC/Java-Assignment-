/*
Question 9: Design a Course Management System 
Requirements: 
Each course has: 
 Course ID, course name 
 Fees 
Each student: 
 Can enroll in courses 
System should: 
 Store students and courses 
 Track enrollments 
 Count total courses 
Display: 
 Student course details 
*/
import java.util.Scanner;
class Student{
	int studentId;
	String studentName;
	
	Student(int studentId , String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	void printStudentDetails(){
		System.out.println("Student Id   : "+studentId);
		System.out.println("Student Name : "+studentName);
	}
	
}
class Course{
	int courseId;
	String courseName;
	int courseFees;
	static int count;
	
	Student[] students = new Student[10];
	int studentCount = 0;
	
	Course(int courseId ,String courseName , int courseFees ){
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFees = courseFees;
		count++;
	}
	
	void printCourseDetails(){
		System.out.println("Course Id   : "+courseId);
		System.out.println("Course Name : "+courseName);
		System.out.println("Course Fees : "+courseFees);
	}
	void enrollStudent(Student s) {
        students[studentCount++] = s;
    }
	void printStudentCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        if (studentCount == 0) {
            System.out.println("No students enrolled.");
            return;
        }
        for (int i = 0; i < studentCount; i++) {
            students[i].printStudentDetails();
            System.out.println("-------------------");
        }
    }
}

public class CourseManagementSystem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Course to Add");
		int noCourse = sc.nextInt();
		Course []course = new Course[noCourse];
		
        for(int i = 0 ; i <	course.length ; i++){
			System.out.println("Enter Details of "+(i+1)+" Course ");
			System.out.println("Enter Course Id : ");
			int cId = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Course Name : ");
			String cName = sc.nextLine();
			
			System.out.println("Enter Course Fee :  ");
			int cFees = sc.nextInt();
			sc.nextLine();
			
			course[i] = new Course(cId , cName , cFees);
		}	
	    System.out.println("========== Course Details ============");
        for(int i = 0 ; i <	course.length ; i++){
			course[i].printCourseDetails();
		}
		System.out.println("Total Courses : "+Course.count);
		System.out.println("=================================");
	    System.out.println("Did you want to get enrolled to above Courses(y/n)");
        System.out.println("Enter your choice (y/n)");
		char c = sc.next().charAt(0);
		while(c == 'y'){
			System.out.println("Enter Course Id ");
			int cId = sc.nextInt();
			boolean found = false;
			for(int i = 0 ; i < course.length ; i++){
				if(course[i].courseId == cId){
					found = true;
					System.out.println("Enter Student Id ");
			        int sId = sc.nextInt();
			        sc.nextLine();
					
			        System.out.println("Enter Student Name ");
			        String sName = sc.nextLine();
					
					Student s = new Student(sId , sName);
					course[i].enrollStudent(s);
		            
					System.out.println("Student enrolled successfully!");

				}
				
			}
			if(!found)
				System.out.println("Exit from Enrollment");
            
			System.out.println("Enroll more? (y/n)");
            c = sc.next().charAt(0);			
		}
	
		
        System.out.println("========== Student Course Details ===========");
		for(int i = 0 ; i < course.length ; i++){
	         course[i].printStudentCourseDetails();
		}
		
		
	}
}