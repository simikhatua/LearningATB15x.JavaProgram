package ex_23_OOPs_Super_Abstraction.superKeyword.Abstraction;

public class Lab191_Interface_Variables {
}

interface Pramod {
    int a = 10;
    String notes = "JAVA";
    void display();
}
class Dutta implements Pramod{

int aa = 10;

    @Override
    public void display() {
System.out.println(a);
System.out.println(this.aa);

    }

}
class Somya implements Pramod
{
    @Override
    public void display() {
        System.out.println(notes);

    }

}