package ex_Exceptions_CF_01_LIST;
import java.util.*;

public class Lab231_ArrayList_95 {
    public static void main(String[] args) {
List list = new ArrayList<>();
list.add("bread"); //0
list.add("milk");  //1
list.add("butter"); //2
list.add("paneer"); //3
list.add("jam"); //4
list.add("cheese"); //5
list.add(123); //6
list.add(true); //7
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
