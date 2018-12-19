import java.util.Scanner;
public class Day2_2{
   public static void main(String []args){
      Scanner scanner  = new Scanner(System.in);
      System.out.println("Enter Dimension of Matrix");
      int dimension = scanner.nextInt();
      int[][]  matrix = new int[dimension][dimension];
      System.out.println("Enter Matrix Elements : ");
      for(int row = 0; row < dimension; row++){
          for(int column = 0; column < dimension; column++){
              matrix[row][column] = scanner.nextInt();
          }
      }
      String dummy = scanner.nextLine();
      System.out.println("Rotate Left/Right");
      String toRotate = scanner.nextLine();
      if(toRotate.equals("left")){
         for(int row = dimension-1; row >= 0; row--){
             for(int column = 0; column < dimension; column++){
                 System.out.print(matrix[column][row] + " "); 
             }
             System.out.println();
         } 
      } else {
             for(int row = 0; row<dimension; row++){
                 for(int column = dimension-1; column>=0; column--){
                     System.out.print(matrix[column][row] + " ");
                     }
                 System.out.println();
                 }     
      }
}
}
