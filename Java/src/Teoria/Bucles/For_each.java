package Teoria.Bucles;

public class For_each {
    // This function is used to interact with both arrays and collections.

    public static void main(String[] args) {
        String[] personjes = {"Carlos", "Mono", "David", "Jose" };

        for (int i = 0; i < personjes.length; i++) {
            System.out.println(personjes[i]);
        }

        String[]  nombres= {"--------------------------------","Carlos", "David", "Jose", "juan"};

        for (String nombre : nombres) {
            System.out.println(nombre);
        }


    }
}
