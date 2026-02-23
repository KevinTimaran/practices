package Ejercicios;

import java.util.Scanner;

public class Ask_personal_information {
    public static void main(String[] args) {

        String name = "";
        byte age = 0;

        System.out.println("Ingrese su nombre:");

        // Aks name
        Scanner askName =  new Scanner(System.in);
        String question = askName.nextLine();
        name = question;

        //Aks age
        System.out.println("Ingrese su edad: ");

        Scanner askAge = new Scanner(System.in);
        byte questionAge = askAge.nextByte();
        age = questionAge;


        System.out.println("Tu nombre es: " + name + " y Tienes: " + age + " años");







    }
}
