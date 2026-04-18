package ex_20_OOPs_Polymorphism.Overloading;

public class Lab187_Poly_MethodOverloading {
}
class MathOperations{
    //In the same class,when you have a method wit same
    //Same name methods but different arguments and different return type

    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    String add(String a, String b) {
        return a + b;



    }
}
