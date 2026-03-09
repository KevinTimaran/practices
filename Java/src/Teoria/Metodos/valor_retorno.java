package Teoria.Metodos;

public class valor_retorno {
    public static void main(String[] args) {

        int solution = som(32, 43);
        System.out.println(solution);


    }

    // To make a method returnable, the void must be removed
    static  int som(int a, int b){
        return a+b;
    }
}
