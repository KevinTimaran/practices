package Teoria;

public class condicional_if {
    public static void main(String[] args) {
        int age = 1;
        String movieClassificationOne = "R18";
        String movieClassificationTwo = "RP18";
        boolean isWithAdult = true;

        boolean isRestrictedOne = movieClassificationOne.contains("R18");
        boolean isRestrictedTwo = movieClassificationTwo.contains("RP18");

        // In this code part, only validate the age
        if(age > 17) {
            System.out.println("You can now see the movie! ");
        } else {
            System.out.println("You can't see the movie ");
        }

        // Validate that the classification is R18 and the age is > 18
        if(isRestrictedOne && age > 17) {
            System.out.println("You can now see the movie! ");
        } else {
            System.out.println("You can't see the movie ");
        }


        // Now we go to see if the movie have restriction and the restriction RP18
        if (!isRestrictedTwo) {
            System.out.println("You can now see the movie! ");
        } else if (age > 17 ) {
            System.out.println( "You can now see the movie, too!");
        } else if (isWithAdult ) {
            System.out.println("Comes with an adult, you can now the movie");

        } else  {
            System.out.println("You can't see the movie! ");
        }



        // Now we go to see if the movie accept the two restrictions
        if (!isRestrictedTwo) {
            System.out.println("You can now see the movie! ");
        } else if (age > 17 ) {
            System.out.println( "You can now see the movie, too!");
        } else if (isWithAdult && movieClassificationTwo.contains("RP")) {
            System.out.println("Comes(viene) with an adult, you can now the movie");

        } else  {
            System.out.println("You can't see the movie! ");
        }






    }
}
