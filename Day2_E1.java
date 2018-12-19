import java.util.Scanner;
public class Day2_E1{
public static void main(String []args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter Input String");
String input = scanner.nextLine();
int summationOfIndices = 0;
for(int index = 0; index < input.length(); index++){
    summationOfIndices += (input.charAt(index)-'a'+1);
    }
if(summationOfIndices%2==0){
   System.out.println("Even");
   } else {
   System.out.println("Odd");
   }
}
}
