package ModulosLogica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {


    public static void main (String[] args){
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         */

        List<Long> num = new ArrayList<>();

        long a = 0;
        long b = 1;

        num.add(a);
        num.add(b);

        System.out.println("0:"+num.get(0));
        System.out.println("1:"+num.get(1));

        for (int i = 2; i < 51; i++ ){

            int firstNum = i-2;
            int secondNum = i-1;

            long saveNum = num.get(firstNum) + num.get(secondNum);

            System.out.println(
                    i +":"+ saveNum
            );

            num.add(saveNum);
        }
        System.out.println(num);


    }
}
