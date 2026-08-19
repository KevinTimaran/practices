package ModulosLogica;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main (String[] args){



        List<Integer> numero = new ArrayList<>();


        if ( numero.get(50) < 51){

            numero.add(0);
            System.out.println(numero.get(0));


            numero.add(1);
            System.out.println(numero.get(1));

            for (int i = 0; i < 51;)

                System.out.println(numero.get(1)+ numero.get(-i) );











        }




    }
    
    
}
