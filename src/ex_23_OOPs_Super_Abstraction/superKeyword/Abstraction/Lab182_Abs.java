package ex_23_OOPs_Super_Abstraction.superKeyword.Abstraction;

public class Lab182_Abs {
}

class Vehicle{
    public int maxSpeed = 360;
    Vehicle() {
        System.out.println("Default Cons");
    }
    Vehicle(int a) {
        System.out.println("Param Con");
    }
    Vehicle(int a, int b ) {
        System.out.println("Param Con");
    }
    void message() {
        System.out.println("No Return, No Argument");
    }
    void message(int a) {
        System.out.println("PC - arguement");
    }
    void drive() {
        System.out.println("Vehicle Parent");
    }
    void noTest() {
        System.out.println("Empty!");

    }
}

class Car extends Vehicle{
    private int maxSpeed = 281;
    Car() {
        super(100);
    }
    Car(int a) {
        System.out.println("PC Car");
    }
    void test(){

    }
    @Override
    void drive() {
        super.drive();
        this.test();
        super.noTest();


    }
}