package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {
     ICICIBank amit = new ICICIBank("Amit",100);
     long bal = amit.getBal();
     System.out.println(bal);

    }
}

class ICICIBank{
    private String name;
    private long bal;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        this.bal = bal;
    }
    public ICICIBank(String name, long bal){
        this.name = name;
        this.bal = bal;

    }

}
