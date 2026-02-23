package Teoria;

import java.util.Scanner;
// Now, we will use the function for ask in the terminal

public class scanner_Class {
    public static void main(String[] args) {

        //Use the var to save the question
        Scanner sc = new Scanner(System.in);
        Scanner number = new Scanner(System.in);

        // In this block only accept string text
        String aks = sc.nextLine();
        System.out.println(aks);

        // In this block only accept numbers
        byte aks1 = number.nextByte();
        System.out.println(aks1);

    }
}
