package Ejercicios;

import java.util.Scanner;

public class Calculator_and_Nasa {
    public static void main(String[] args) {

        //==============================================
        //Structure While for the question
        //==============================================
        terminar :while(true){
            //==============================================
            // Welcome to user
            //==============================================
            String welcome= "Welcome to system";

            // We show to user the option valid
            System.out.println(welcome);

            //==============================================
            //Ask
            //==============================================
            // Creating Scanner for Ask
            Scanner sc = new Scanner(System.in);

            // Ask for user answer
            String ask = "You select a option: \n1.Calculator. \n2.Nasa. \n3.Exit";

            System.out.println(ask);
            //creating ask the user for the option
            int opcion = sc.nextInt();

            //==============================================
            //Conditional if
            //==============================================
            if (opcion == 1){
                //==============================================
                //Calculator
                //==============================================

                // Welcome to calculator
                System.out.println("welcome to calculator, please enter a number");

                //Var for numbers
                int a = 0;
                int b = 0;

                while (true){
                    System.out.println("enter a number one");
                    Scanner Num1 = new Scanner(System.in);

                    if (Num1.hasNextInt()){ // Verify that the number is present
                        a = Num1.nextInt();
                        break;
                    }else {
                        System.out.println("Please enter a number");
                    }
                }

                while (true){
                    System.out.println("enter a number two");
                    Scanner Num2 = new Scanner(System.in);

                    if (Num2.hasNextInt()){ // Verify that the number is present
                        b = Num2.nextInt();
                        break;
                    }else {
                        System.out.println("Please enter a number");
                    }
                }

                int resultado = a + b;
                System.out.println("The result is: " + resultado);




            //==============================================
            //NASA
            //==============================================
            }else if (opcion == 2){
                // Welcome
                System.out.println("This is the hacking for the NASA");
                System.out.println("Entering the system...............");
                // Array to long
                String log = "";
                // Loop for
                for (int i = 0; i < 100; i++) {
                    log = log + "*";
                    System.out.println(log);

                }
            }else if (opcion == 3) {
                System.out.println("Thank you for using our system :)");
                break terminar;
            } else {
                System.out.println("Invalid option aaaaaaaaaaaaaaaa");
            }

        }
    }
}

