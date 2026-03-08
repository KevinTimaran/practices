package Teoria.Normal;

public class Operador_Ternario {
    public static void main(String[] args) {

        int age = 19;
        String email = "This person can't vote  ";

        if (age >= 18) {
            email = "This person can vote  ";
        }
        System.out.println(email);




        String text = age >= 18? "Can vote":"This person can't vote  ";
        System.out.println(text);

    }
}
