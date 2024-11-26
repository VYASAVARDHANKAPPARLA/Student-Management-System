package Internship;
import java.util.*;
import java.io.*;

public class task5_Studentmanagementsystem {
	
	static class Student{
		private String name;
		private String rollno;
		private String grade;
		
		public Student(String name,String rollno,String grade) {
			this.name=name;
			this.rollno=rollno;
			this.grade=grade;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getRollno() {
			return rollno;
		}
		public void setRollno(String rollno) {
			this.rollno=rollno;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade=grade;
		}
		public String toString() {
			return "name: " +name+ ",Roll no: "+rollno+", grade: "+grade;
		}
	}
	
	static class Management_system{
		private List<Student> students;
		public Management_system() {
			students = new ArrayList<>();
		}
		public void addStudent(Student student) {
			students.add(student);
			System.out.println("student added successfully. ");
		}
		
		public boolean removeStudent(String rollno) {
			for(Student student : students) {
				if(student.getRollno().equals(rollno)) {
					students.remove(student);
					System.out.println("student removed successfully");
					return true;
				}
			}
			System.out.println("Student with roll no "+rollno+"not found");
			return false;
		}
		
		public Student searchStudent(String rollno) {
		    for (Student student : students) {
		        if (student.getRollno().equals(rollno)) {
		            return student;
		        }
		    }
		    System.out.println("Student with roll number " + rollno + " not found.");
		    return null;
		}

		public void displayAllstudents() {
			if(students.isEmpty()) {
				System.out.println("no student found");
			}
			else {
				for(Student student : students) {
					System.out.println(student);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Management_system managementSystem = new Management_system();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("----Student Management System----");
			System.out.println();
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Search Student");
			System.out.println("4. Display all Student");
			System.out.println("5. Exit");
			System.out.println();
			System.out.println("       Enter your chouse");
			int chouse=scanner.nextInt();
			switch(chouse) {
			case 1:
				System.out.println("Enter your name");
				String name=scanner.nextLine();
				System.out.println("Enter roll number");
				String rollno=scanner.nextLine();
				System.out.println("Enter grade");
				String grade=scanner.nextLine();
				
				Student student = new Student(name,rollno,grade);
				managementSystem.addStudent(student);
				break;
			case 2:
				System.out.println("Enter roll no to remove: ");
				String rollnotoremove=scanner.nextLine();
				managementSystem.removeStudent(rollnotoremove);
				break;
			case 3:
				System.out.println("Enter roll no to search: ");
				String rollnotosearch=scanner.nextLine();
				Student foundStudent=managementSystem.searchStudent(rollnotosearch);
				if(foundStudent != null) {
					System.out.println("Student found: "+foundStudent);
				}
				break;
			case 4:
			    managementSystem.displayAllstudents();
			    break;

			case 5:
				System.out.println("Exiting system. ");
				scanner.close();
				return ;
			default :
				System.out.println("Invalied chouse pleace try again");
			}
		}
	}
	public Object getrollno() {
		return null;
	}
}