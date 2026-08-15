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

        System.out.println("Place enter your first word: ");
        Scanner askWord = new Scanner(System.in);

        String firstWord = askWord.nextLine();

        //The  <toCharArray> function we make the word separate into letters
        char []  firstLetters = firstWord.toCharArray();

        //##############################################
        //In this part evaluation the word
        //##############################################

        //with the function <length> we count the letter of the word
        if (firstLetters.length > 1 ){
            int palabra = firstLetters.length;
            System.out.println("your word if is a anagram, a anagram of: " +palabra+ " words ");

            // This is a loop that print the letters of word
            for (int i = 0; i < firstLetters.length; i++ ){

                System.out.println("Letter: "+i+ " : " + firstLetters[i]);
            }
        }else {
            System.out.println("Your word "+firstWord+ " don't is anagram because it has one letter");
        }

        /**


        // Aks
        System.out.println("Hi, please write one word:  ");
        Scanner askFirtsWord = new Scanner(System.in);
        String firtsWord = askFirtsWord.nextLine();

        System.out.println("Hi, please write one word:  ");
        Scanner aksLastWord = new Scanner(System.in);
        String lastWord = aksLastWord.nextLine();

        //Convert a string text to characters list. toCharArray() return a characters list
        // This function separate the word in letters
        char[] firtsLetters = firtsWord.toCharArray();
        char[] lastLetters = lastWord.toCharArray();



        // The proprietary "length" count how many letters have the word
        if (firtsLetters.length > 1){

            // Save the number letters in a var
            int letras = firtsLetters.length;

            //Print the result
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
            System.out.println("FALSO. \nEsta segunda palabra solo contiene "+ letras+ " letras");}**/

    }
}
