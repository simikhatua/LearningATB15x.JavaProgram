package ex_23_OOPs_Super_Abstraction.superKeyword.Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.loan50k();
        s1.load10k();

    }
}
abstract class Father{
    abstract void loan50k();

    //concrete - complete method
     void load10k(){
         System.out.println("Given!");

     }
}
class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Given by Son!");

    }

}