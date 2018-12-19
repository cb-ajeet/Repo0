import java.util.Scanner;
public class Day1_4{
public static void main(String []args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter x and y");
int x = scanner.nextInt();
int y = scanner.nextInt();
int power = 0;
while(Math.pow(x,power)<y){
power++;
}
System.out.println("Required Power : " + power);
}
}
