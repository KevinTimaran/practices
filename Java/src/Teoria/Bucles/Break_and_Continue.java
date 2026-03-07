package Teoria.Bucles;

import java.util.Scanner;

public class Break_and_Continue {
    public static void main(String[] args) {

        Scanner sacaner = new Scanner(System.in);
        String input = "";

        while (true){  // "true" It allow that the code it is always running
            System.out.println("Enter the command ");
            input = sacaner.nextLine().toLowerCase();

            if (input.equals ("exit")){
                break;
            }

            if  (input.equals("continue")){
                continue ;
            }

            System.out.println("This line should not be executed");
        }
        System.out.println("The end the loop");


    }

}
