package ex_17_OOPs;

public class Lab164_Car {
public static void main(String[] args) {
  Car t = new Car();
  System.out.println(t.name);
}
}
class Car {
  String name;
  int year;
  String model;


  Car(){
    name = "Unknown Car";
    year = 1991;
    model = "XxX";

  }
}