package animalPackage;
public class Animal{
  String animalType;
  String animalColor;
  public Animal(String animalType,String animalColor){
    this.animalType = animalType;
    this.animalColor = animalColor;
  }
  public String toString(){
    return "Animal Type: " + animalType + "\nanimalColor: " + animalColor;
  }
}
