package Teoria.Bucles;
// For
// While
// Do While

public class bucles {
    public  static void main(String[] args) {
        //-----------------------------------------------------
        //This is the loop for
        //-----------------------------------------------------
        String [] texto = {"Hello word", "User", "User one"};

        for (int i = 0; i < 5; i++){
            System.out.println("Hello word " + i);
        };


        //-----------------------------------------------------
        //This is the loop whale
        //-----------------------------------------------------
        int p = 0;
        while (p < 5){
            System.out.println("Hello word " + p);
            p++;
        };

        //-----------------------------------------------------
        //This is the loop do whale
        //-----------------------------------------------------
        int t = 2;
        do{
            System.out.println("Hello word " + t);
            t++;
        } while (t < 5);



    }
}
