package ex_13_Functions;

public class Lab132_UD_Part1 {
    public static void main(String[] args) {
        //1.without argument / parameters and without return type
        wop_wor_greet();
        String msg = wop_wor_greet_2();
        greet_with_details("pooja", 65, 100);
    }

    private static void greet_with_details(String a , int i, int i1) {
        System.out.println(a + " is a girl. Her age is " + i);
    }

    static String wop_wor_greet_2() {
        return "pooja";

    }

    static void wop_wor_greet() {

    }
}
