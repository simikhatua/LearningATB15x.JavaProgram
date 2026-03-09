package ex_05_TypeCasting;

public class Lab062_Extra_Example_Char {
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = ch; //widening
        int num = 66; //narrow
        char letter = (char) num;


    }
}
