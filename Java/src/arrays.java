import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[1] = 10;
        numeros[0]= 1000;
        numeros[9] = 200;
        System.out.println(Arrays.toString(numeros));
        System.out.println(numeros.length);
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros)); // Ordena el array de menor a mayor


    }

}
