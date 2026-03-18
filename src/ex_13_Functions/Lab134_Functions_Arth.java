package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Functions_Arth {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
        int a = readInt(scannner, "Enter the num1: ");
        int b = readInt(scannner, "Enter the num2: ");

    }
    static int readInt (Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }else {
            return 0;

        }
    }

}
