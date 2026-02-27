package Teoria;

import java.awt.*;

public class class_point {
    public static void main(String[] args) {

        Point point1 = new Point();
        Point point2 = point1;
        point2.x = 15;
        System.out.println(point1);


        String a = new String("Hi word");
        String b = a;
        String c = a.toUpperCase();
        System.out.println(c);



    }
}
