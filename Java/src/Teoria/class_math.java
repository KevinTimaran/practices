package Teoria;

public class class_math {
    public static void main(String[] args) {

        System.out.println(Math.abs(-15)); // Delivery the valor absolute
        System.out.println(Math.ceil(10.1)); // round the number up
        System.out.println(Math.floor(10.99999));// round the number down

        System.out.println(Math.max(23, 53));// Delivery the data major
        System.out.println(Math.min(23, 53));// Delivery the minor fact

        System.out.println(Math.round(15.5)); //Delivery data serious

        //Delivery a random number
        double random = Math.random();
        System.out.println(random);
        System.out.println(random*100); //Delivery a random number from 1 to 100 with decimal
        System.out.println((int)(random*100)); // Delivery a random number from 1 to 100 without decimal



    }
}
