import java.util.Scanner;
//Age verify using  Conditional Statment
public class Day1_3{
public static void main(String []args){
Scanner scanner  = new Scanner(System.in);
System.out.println("Enter Age");
int age = scanner.nextInt();
if(age<18){
System.out.println("Underage");
} else {
System.out.println("Age Verified");
}
}
}
