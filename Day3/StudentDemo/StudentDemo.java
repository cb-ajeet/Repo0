package studentPackage;

import java.util.Scanner;
// Handler class
public class StudentDemo {

  //Main Method
  public static void main(String[] args){
    Student student = new Student();
    student = storeStudentData(student);
    System.out.println(student.getStudentName());
    ResultGenerator.generateResult(student);

  }
  //Method to Store Student Data
  public static Student storeStudentData(Student student){

    Scanner scanner = new Scanner(System.in);
    String dummy = "";

    //Input student details
    System.out.println("Enter Student Details: ");
    System.out.println("Enter Student Id: ");
    int id=scanner.nextInt();
    student.setStudentId(id);

    System.out.println("Enter Student Name: ");
    student.setStudentName(scanner.next());
    System.out.println("Enter Student Gender M/F: ");
    String studentGender = scanner.next();
    if(studentGender.equals("M")){
      student.setStudentGender(true);
    } else {
      student.setStudentGender(false);
    }

    //Input Subject Details
    System.out.println("Enter Subject Details:");
    Subject subject = new Subject();
    System.out.println("Enter subject1: ");
    subject.setSubject1(scanner.next());
    System.out.println("Enter Mark1: ");
    subject.setMarks1(scanner.nextFloat());
    dummy = scanner.nextLine();

    System.out.println("Enter subject2: ");
    subject.setSubject2(scanner.next());
    System.out.println("Enter Mark2: ");
    subject.setMarks2(scanner.nextFloat());
    dummy = scanner.nextLine();

    System.out.println("Enter subject3: ");
    subject.setSubject3(scanner.next());
    System.out.println("Enter Mark3: ");
    subject.setMarks3(scanner.nextFloat());
    dummy = scanner.nextLine();

    student.setSubjects(subject);

    //Return Student with Stored Details
    return student;

  }

}
