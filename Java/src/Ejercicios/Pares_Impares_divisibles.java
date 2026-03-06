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

        if  (operatingNumber == 0) {
            System.out.println("This number is even");

        } else {
            System.out.println("This number is odd");}

        if (operatingNumber / 3 == 0 && operatingNumber % 4 == 0) {
            System.out.println("This number is divisible for three and four");
        }else if (operatingNumber / 3 == 0) {
            System.out.println("This number is divisible for three");
        }else if (operatingNumber / 4 == 0) {
            System.out.println("This number is divisible for four");
        }





    }
}
