package ex_17_OOPs;

public class Lab162_OOPs {
    public static void main(String[] args) {
       baby b1 = new baby();
       baby b2 = new baby("Pooja");
       baby b3 = new baby("Pooja","10k");
    }
}
class baby {
    String name;

    baby() {
        System.out.println("DC");
    }


    baby (String name){
        System.out.println("PC - name");
    }

    baby (String name,String money){
        System.out.println("PC - name.age");
    }
}
