package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float NSRT_GST = 18.45f;
     //   int total = course+ NSRT_GST; //narrowing - implicit
    int total = course+ (int)NSRT_GST; //narrowing - explicit
        System.out.println(total);
       float total2 = course+ NSRT_GST; //widening - implicit
        float total3 = (float) course + NSRT_GST; // widening - explicit
        System.out.println(total2);



    }
}
