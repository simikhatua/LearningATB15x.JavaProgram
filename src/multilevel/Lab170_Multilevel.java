package multilevel;

public class Lab170_Multilevel {
    public static void main(String[] args) {
     Son pramod = new Son();
     pramod.home();
     pramod.bhk3();
     pramod.gf();
     pramod.extraMoney();

     Father f = new Father();
     f.gf();
     f.home();
     // f.extraMoney();

        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        //dynamic dispatch
        GrandFather g1 = new Son();
        Father f1 = new Son();
        System.out.println();

        //Son s1 = new Grandfather();
        //Son s2 = new Father();




    }
}
