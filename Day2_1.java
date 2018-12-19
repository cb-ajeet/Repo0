import java.util.Scanner;
public class Day2_1{
public static void main(String []args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter n");
int n = scanner.nextInt();

for(int row = 0; row < n; row++){
int toPrint = 1;
for(int column = 1; column < 2*n; column++){
if(column >= (n-row) && column <= (n+row)){
System.out.print(toPrint + " ");
if(column<n) toPrint++; else toPrint--;
} else {
System.out.print("  ");
}
}
System.out.println();
} 
}
}
