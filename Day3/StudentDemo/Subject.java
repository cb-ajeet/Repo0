package studentPackage;

public class Subject{

  //Class Attributes
  private String subject1;
  private float marks1;
  private String subject2;
  private float marks2;
  private String subject3;
  private float marks3;

/*
//Class Constructor
  Student(String subject1, float marks1, String subject2, float marks2, String subject3, float marks3 ){
    this.subject1 = subject1;
    this.marks1 = marks1;
    this.subject2 = subject2;
    this.marks2 = marks2;
    this.subject3 = subject3;
    this.marks3 = marks3;
  }
*/

//Getters for class attributes
  public String getSubject1(){
    return this.subject1;
  }
  public float getMarks1(){
    return this.marks1;
  }
  public String getSubject2(){
    return this.subject2;
  }
  public float getMarks2(){
    return this.marks2;
  }
  public String getSubject3(){
    return this.subject3;
  }
  public float getMarks3(){
    return this.marks3;
  }

//Setters for class attributes
  public void setSubject1(String subject1){
    this.subject1 = subject1;
  }
  public void setMarks1(float marks1){
    this.marks1 = marks1;
  }
  public void setSubject2(String subject2){
    this.subject3 = subject2;
  }
  public void setMarks2(float marks2){
    this.marks2 = marks2;
  }
  public void setSubject3(String subject3){
    this.subject3 = subject3;
  }
  public void setMarks3(float marks3){
    this.marks3 = marks3;
  }

}
