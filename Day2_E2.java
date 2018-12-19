import java.util.Scanner;
public class Day2_E2{
public static void main(String []args){
System.out.println("Enter n");
int n = new  Scanner(System.in).nextInt();// Trying  this way, Working Perfect
int first = 0;
int second = 1;
int count = 0;
while(count++ < n){
System.out.print(first+" ");
second += first;
first = second-first;
}
}
}
