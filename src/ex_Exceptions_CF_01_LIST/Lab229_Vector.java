package ex_Exceptions_CF_01_LIST;
import java.util.ArrayList;
import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pooja");
        v.add("Simi");
        v.add("Guggu");
        System.out.println(v);
        System.out.println(v.size());
        System.out.println(v.isEmpty());
        v.remove("Simi");
        System.out.println(v);
        System.out.println(v.contains("Guggu"));

        ArrayList a = new ArrayList();
        a.add("poooja");
        a.add("khatua");

    }

}
