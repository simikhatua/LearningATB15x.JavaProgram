package ex_17_OOPs;

public class Lab161_Cats_OOPs {
 public static void main(String[] args) {
     Cat c1 = new Cat();
     Cat c2 = new Cat("mufasa");
     Cat c3 = new Cat("Lucy");
     Cat c4 = new Cat("Spicy");
     Cat c5 = new Cat("Fire");
     System.out.println(c2.name);


 }
 }
class Cat {
    String name;
     Cat(){
         System.out.println("DC");

     }
     Cat(String nameGiven){
         this.name = nameGiven;

     }

}