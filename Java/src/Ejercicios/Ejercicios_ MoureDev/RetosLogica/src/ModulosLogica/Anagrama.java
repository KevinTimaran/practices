package ModulosLogica;

/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Scanner;

public class Anagrama {
    public static void main (String[] args){


        // Aks
        System.out.println("Hi, please write one word:  ");
        Scanner askFirtsWord = new Scanner(System.in);
        String firtsWord = askFirtsWord.nextLine();

        System.out.println("Hi, please write one word:  ");
        Scanner aksLastWord = new Scanner(System.in);
        String lastWord = aksLastWord.nextLine();

        //Convert a string text to characters list
        char[] firtsLetters = firtsWord.toCharArray();
        char[] lastLetters = lastWord.toCharArray();


        if (firtsLetters.length > 1){
            int letras = firtsLetters.length;
            System.out.println("VERDADER \nLa palabra: "+ firtsWord +
                    " \nes un anagrama de: " + letras+ " Letras");

            for (int i = 0; i < firtsLetters.length; i++){
                System.out.println("Letra"+i+ ": " + firtsLetters[i]);
            }
        } else {
            int letras = lastLetters.length;
            System.out.println("FALSO. \nEsta Primera palabra solo contiene "+ letras+ " letras");
        };

        System.out.println("------------------------------------");
        if (lastLetters.length > 1){

            int letras = lastLetters.length;
            System.out.println("VERDADER \nLa palabra: "+ lastWord +
                    " \nes un anagrama de: " + letras+ " Letras");

            for (int i = 0; i < lastLetters.length; i++){
                System.out.println("Letra"+i+ ": " + lastLetters[i]);

            }
        } else {
            int letras = lastLetters.length;
            System.out.println("FALSO. \nEsta segunda palabra solo contiene "+ letras+ " letras");}

    }
}
