package Ejercicios;

import java.util.Scanner;

public class Pares_Impares_divisibles {
    public static void main(String[] args) {

        int number = 0;

        // print action
        System.out.println("Enter a number");

        // We ask the user to enter number
        Scanner askNumber = new Scanner(System.in);
        int saveNumber = askNumber.nextInt();
        number = saveNumber;

        var operatingNumber = number % 2;


        String solution = operatingNumber == 0? "The number is even":"the number is odd  ";
        System.out.println(solution);







    }
}
