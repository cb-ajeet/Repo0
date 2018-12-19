import java.util.Scanner;
public class Day2_E3{
public static void main(String []args){

Scanner scanner = new Scanner(System.in);
float principalAmount,interestRate,termInYears;

System.out.println("Enter Principal Amount");
principalAmount = scanner.nextFloat();
System.out.println("Enter Interest Rate");
interestRate = scanner.nextFloat();
System.out.println("Enter Term in Year");
termInYears = scanner.nextFloat();

float simpleInterest = principalAmount * interestRate * termInYears;
float compoundInterest = principalAmount * ((float)Math.pow((interestRate+1),termInYears)-1);

System.out.println("Simple Interest : " + simpleInterest);
System.out.println("Compound Interest : " + compoundInterest);
}
}
