package Ejercicios;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        //**
        // Creat a calculator of receive
        //two numbers and then print the resulted
        // of the sum.
        // */

        // The vars for the numbers
        byte num1 = 0;
        byte num2 = 0;


        // Ask for the first number
        System.out.println( "Write the firsts number: ");

        Scanner askNum1 = new Scanner(System.in);
        byte questionNum1 = askNum1.nextByte();
        num1 = questionNum1;

        //Ask for the second number
        System.out.println( "Write the seconds number: ");

        Scanner askNum2 = new Scanner(System.in);
        byte questionNum2 = askNum2.nextByte();
        num2 = questionNum2;

        int solution = num1 + num2;

        System.out.println( "The solution of you sum is: "+solution);






    }
}
