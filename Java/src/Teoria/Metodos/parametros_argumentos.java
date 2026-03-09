package Teoria.Metodos;

import java.util.Scanner;

public class parametros_argumentos {

    public static void main(String[] args) {

        printName("Nicolas", 23);   // This is argument "Nicolas"
        printName("Sara",    43);      // This is argument "Sara"
        printName("Carlos",  53);    // This is argument "Carlos"

        String name = "";
        int age = 0;



        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("What is your age?");
        age = sc.nextInt();
        printName(name, age);



    }

    static void printName (String name, int age){ // This is a parameters
        System.out.println("Hi, "+ name + "You age is: " + age + " years old");

    }






}
