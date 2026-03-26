package ex_15_StringsBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        String s0 = "Pooja";
        String s1 = new String ("Pooja");

        StringBuffer stringBuffer = new StringBuffer("Pooja");
        StringBuilder stringBuilder = new StringBuilder("Pooja");

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());

    }
}
