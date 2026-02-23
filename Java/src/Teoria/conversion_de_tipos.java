package Teoria;

public class conversion_de_tipos {
    public static void main(String[] args) {
        //---------------------------------------------------------------------------------------
        // Implicit conversion
        //---------------------------------------------------------------------------------------
        // The implicit conversion is when only Java change a data for a data different

        // This is the gerarchy the change the datas
        // byte -> short -> int -> long -> Float -> double

        //Example one
        byte a =1;
        int b =2;
        int c = a + b;
        System.out.println(c);

        // Example two
        byte d = 1;
        double e = 15.15;
        double f = d + e;
        System.out.println(f);


        //---------------------------------------------------------------------------------------
        // Explicit conversion
        //---------------------------------------------------------------------------------------

        // Explicit conversion occurs when we change the type to data ourselves
        // Examples

        // Example one
        int x = 1;
        double y = 15.015;
        int z = (int) (y + x); // This is the correct form to change one data for a data different of explicit form
        System.out.println(z);

        //Example two
        int h= 15;
        double g = 15.15;
        int i = h + (int) g; // And this is form to only change a data
        System.out.println(i);

        // Example three
        // When we have a string and we want a int
        String j = "1.1";
        int k = 5;
        double l = Double.parseDouble(j) + k; // This is how it becomes one string data to a int data
        double m = Byte.parseByte(j)+ k; // In this event, the byte only accepts data without a period or decimal places
        int n = Integer.parseInt(j) + k;
        System.out.println(l);
        System.out.println(n);


    }
}
