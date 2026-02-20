import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] numeros = new int[10]; // Se crea y se selecciona la cantidad de items que debe tener el array
        int[] numbers = {2,1,32,4,3,2,3,4,2,4,2};

        // Para el array sin numeros iniciales, esta es la forma de agregar datos al array
        numeros[1] = 10;
        numeros[0]= 1000;
        numeros[9] = 200;

        // Esta es la forma de remplazar un array que ya tiene datos iniciales
        numbers [0]= 100;
        numbers [1] = 200;
        numbers [2] = 300;

        // Se puede ver los valores iniciales del array
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numbers));

        // Indica la cantidad de elementos dentro del array
        System.out.println(numeros.length);
        System.out.println(numbers.length);

        // Hace Que los numeros se ordenen de nemor a mayor
        Arrays.sort(numeros);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numbers));




    }

}
