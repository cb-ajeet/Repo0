package studentPackage;

public class ResultGenerator{

  //Method to Generate Result
  public static void generateResult(Student student){
    Subject subjects = student.getSubjects();
    float totalMark = subjects.getMarks1() + subjects.getMarks2() + subjects.getMarks3();
    float averageMark = totalMark/3;
    //Printing Result 
    System.out.println("Total Mark : " + totalMark + "\tAverage Mark : " + averageMark);
  }

}
