package Ejercicios;

import java.util.Scanner;

public class solution_Calculator_and_Nasa {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String input;

        termina: while (true ){
            System.out.println("Enter a option");
            System.out.println("1. Calculator");
            System.out.println("2. Hacker to the NASA" );
            System.out.println("3. Exit");

            input = scanner.next().toLowerCase();

            switch (input){
                case "1":
                    System.out.println("Enter a number one");
                    int a = scanner.nextInt();
                    System.out.println("Enter a number two");
                    int b = scanner.nextInt();
                    System.out.println("The solution is:");
                    System.out.println(a + b);
                    break;

                case "2":
                    System.out.println("Hacker to the NASA");
                    String hacker ="";
                    for (int i = 0; i < 10; i++ ){
                    hacker = hacker + "*";
                    System.out.println( hacker );
                    }

                    break;
                case "3":
                    System.out.println("Chaoooo mamabicho");
                    break termina;
            }
        }
    }
}
