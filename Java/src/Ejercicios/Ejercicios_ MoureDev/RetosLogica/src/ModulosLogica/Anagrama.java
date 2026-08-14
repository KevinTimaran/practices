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
        System.out.println("Enter the one word");
        Scanner askOneWord = new Scanner(System.in);
        String oneWord = askOneWord.nextLine();


        System.out.println("Enter the two word");
        Scanner askTwoWord = new Scanner(System.in);
        String twoWord = askTwoWord.nextLine();

        char [] listOneWord = oneWord.toCharArray();
        char [] listTwoWord = twoWord.toCharArray();

        if (listOneWord.length > 1  ){
            int palabra = listOneWord.length;

            System.out.println("La palabra"+ askOneWord + "si es una anagrama debido \n" +
                    "a que esta tiene: " + palabra + "letras" );

            for (int i = 0; i < listOneWord.length;  i++ ){
                System.out.println("Letra"+i+":"+listOneWord[i]);}

        } else {
            int palabra = listOneWord.length;
            System.out.println("la palabra no es un anagrama debido a que tiene"+palabra+"letras");

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
