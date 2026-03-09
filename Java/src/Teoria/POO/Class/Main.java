package Teoria.POO.Class;

import Teoria.POO.Class.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Juan";

        User user2 = new User();
        user2.name = "Camilo";

        System.out.println(user.name);
        System.out.println(user2.name);

    }




}
