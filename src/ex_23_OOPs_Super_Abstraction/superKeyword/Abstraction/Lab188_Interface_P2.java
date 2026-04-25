package ex_23_OOPs_Super_Abstraction.superKeyword.Abstraction;

public class Lab188_Interface_P2 {
}
interface F1 {
    void icm1();
    void money();
}
interface F2 {
    void money();
}
class SON implements F1,F2 {

    @Override
    public void icm1() {
    }
    @Override
    public void money() {
        System.out.println("Son Method");

    }
}
