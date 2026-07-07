package ex_26_Wrapper_Class;
import java.util.Collection;
public class Lab204_IQ {
    public static void main(String[] args){

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);   // true (cached)

        Integer c = 128;
        Integer d = 128;
        System.out.println(   c == d);    // false! (not cached)

//Integer num = null;
//int value = num; // NullPointerException!
  //      System.out.println(value);

    }
}
