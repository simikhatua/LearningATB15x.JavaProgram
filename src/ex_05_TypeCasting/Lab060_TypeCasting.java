package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 8908580922l;
        // short s = phone; // narrowing - implicit
        short s1 = (short) phone; // narrowing - explicit

    }
}
