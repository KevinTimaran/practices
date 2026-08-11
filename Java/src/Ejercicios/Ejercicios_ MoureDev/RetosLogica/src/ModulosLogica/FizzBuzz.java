package ModulosLogica;

public class FizzBuzz {
    /*
     * Escribe un programa que muestre por consola (con un print) los
     * números de 1 a 100 (ambos incluidos y con un salto de línea entre
     * cada impresión), sustituyendo los siguientes:
     * - Múltiplos de 3 por la palabra "fizz".
     * - Múltiplos de 5 por la palabra "buzz".
     * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
     */


    // First: Defined a class or method main
    public static void main(String[] args) {
         // Second: i integrate a function for. This function have a
        // var i, the var i start which the number one and this var have a limit
        // of one hundred one.
        for (int i = 1; i< 101; i++){

            // This print the number of loop for
            System.out.println();

            // This part calculated the residue of number
            int isFizz = i % 3;
            int isBuzz = i % 5;

            // Are condicions
            if (isFizz == 0 && isBuzz ==0) {
                System.out.println("fizzbuzz");
            }else if (isFizz == 0) {
                System.out.println("fizz");
            }else if (isBuzz == 0) {
                System.out.println("buzz");
            } else System.out.println(i);
        };

    }
}
