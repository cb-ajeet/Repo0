package animalPackage;
import java.util.*;
public class AnimalHandler{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    List<Animal> animals = new ArrayList<Animal>();
    String choice = "";
    int animalCounter = 0;
    do{
      System.out.println("Enter Animal Type: ");
      String animalType = scanner.next();
      System.out.println("Enter Animal Color: ");
      String animalColor = scanner.next();
      animals.add(new Animal(animalType,animalColor));
      animalCounter++;
      System.out.println(animals.get(animalCounter-1) + "\n\nAnimal Counter: " + animalCounter);
      System.out.println("\nUser choice to Add more Y/N: ");
      choice = scanner.next();
    } while(choice.equalsIgnoreCase("Y"));
  }
}
