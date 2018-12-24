package studentPackage;

public class Student{

  //Class Attributes
  private int studentId;
  private String studentName;
  private boolean studentGender;
  private Subject subjects;

/*
//Class Constructor
  Student(int studentId, String studentName, boolean studentGender, Subject subjects){
    this.studentId = studentId;
    this.studentName = studentName;
    this.studentGender = studentGender;
    this.subjects = subjects;
  }
*/

//Getters for class attributes
  public int getStudentId(){
    return this.studentId;
  }
  public String getStudentName(){
    return this.studentName;
  }
  public boolean getStudentGender(){
    return this.studentGender;
  }
  public Subject getSubjects(){
    return this.subjects;
  }
  
//Setters for class attributes
  public void setStudentId(int studentId){
    this.studentId = studentId;
  }
  public void setStudentName(String studentName){
    this.studentName = studentName;
  }
  public void setStudentGender(boolean studentGender){
    this.studentGender = studentGender;
  }
  public void setSubjects(Subject subjects){
    this.subjects = subjects;
  }

}
