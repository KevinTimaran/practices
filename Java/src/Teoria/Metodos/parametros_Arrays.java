package Teoria.Metodos;

public class parametros_Arrays {
    public static void main(String[] args) {
        int r = sum(new int[] {1,2,3, 43, 53, 5, 3, 5, 2, 5, 32});
        System.out.println(r);

    }

    static int sum(int [] numbers){
        int result = 0;
        for (int num: numbers){
            result += num;
        }
        return result;

    }
}
