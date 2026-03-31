package Ejercicios.solos;

import java.util.Scanner;

public class primera_APP_Terminal_loop {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        String  imput = "";

        // If the word "Exit" is not entered, the loop will not close.
        while (!imput.equals("exit")){

            System.out.println("enter command");
            imput = scaner.next().toLowerCase(); // toLowerCase es para que interprete mayusculas y minusculas
            System.out.println(imput);
        }

        System.out.println("quit");


    }
}
