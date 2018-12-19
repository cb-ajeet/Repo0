import java.util.Scanner;
public class Day2_E4{
public static void main(String []args){

Scanner scanner = new Scanner(System.in);
System.out.println("Enter Array Size");
int sizeOfArray = scanner.nextInt();
int[] array = new int[sizeOfArray];
System.out.println("Enter Array Elements : ");
for(int index = 0; index < sizeOfArray; index++){
    array[index] = scanner.nextInt();
    }
int maximumElementOfArray = array[0];
int minimumElementOfArray = array[0];

for(int index = 1; index < sizeOfArray; index++){
    if(array[index] > maximumElementOfArray){
       maximumElementOfArray = array[index];
       }
    if(minimumElementOfArray > array[index]){
       minimumElementOfArray = array[index];
       }
}
}
}
