import java.util.Arrays;

public class arrays_multiples_dimensiones{
    public static void main(String[] args) {
        int[] numeros= {23,43,23,53,};
        System.out.println("This is the form of one array or list simple");
        System.out.println(Arrays.toString(numeros));

        // This is one array or list witch more than one array or list
        int [][] matrixNumbers= {{32,32,12},{43,24,23}};
        System.out.println("This is the form of one array composed of two rows");
        // Form of print the numbers of the matrix
        System.out.println(Arrays.deepToString(matrixNumbers)); // Serves for print numbers of the matrix


        //Se crea la estructura de la matriz sin numeros
        int [][] matrizNothingNumbers= new int [3][3];
        // Form of add numbers to the matrix
        matrizNothingNumbers[0][0]=1;
        matrizNothingNumbers[0][1]=1;
        matrizNothingNumbers[0][2]=2;
        // Form of print the numbers of the matrix
        System.out.println(Arrays.deepToString(matrizNothingNumbers));

        // Now creating one array of three dimensions
        int [] [] [] threeDimentionsArray = new int [3][3][3];
        threeDimentionsArray [0][0][0] = 100;
        System.out.println(Arrays.deepToString(threeDimentionsArray));



    }
}
