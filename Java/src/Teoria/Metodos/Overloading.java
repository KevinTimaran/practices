package Teoria.Metodos;

public class Overloading {
    public static void main(String[] args) {
        int result = sum(43, 53);
        int result2 = sum(43, 53, 53);

        System.out.println(result);
        System.out.println(result2);

        //Print a String of sum
        String tex = sum();
        System.out.println(tex);
    }


    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static String sum(){
        return "Hola mundo";
    }
}
