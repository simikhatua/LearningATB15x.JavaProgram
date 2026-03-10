package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else_Scanner {
    //Allowed to vote or not - age
    //If age > 18 -> allowed to vote.
    //How to take the user input
    //1. CLI options
    // int age = integer.parseInt(args[0]);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE AGE!");
        int age = scanner.nextInt();
        System.out.println(age);

    }
}
