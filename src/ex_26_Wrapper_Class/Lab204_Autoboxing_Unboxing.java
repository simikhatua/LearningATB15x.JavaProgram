package ex_26_Wrapper_Class;

public class Lab204_Autoboxing_Unboxing {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        System.out.println(b); // b has now attributes,methods


// Boxing - Primitive data type is coverted wrapper - Automatic JVM will do

        Integer aa = 43;
        int a1 = aa; // Unboxing
        System.out.println(a1);

    }
}
