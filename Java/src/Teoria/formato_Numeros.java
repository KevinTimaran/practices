package Teoria;

import java.text.NumberFormat;
import java.util.Locale;

public class formato_Numeros {
    public static void main(String[] args) {

        // Is used for change numbers to money number, but the change only is to euros
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        String result = numberFormat.format(1099.90);
        System.out.println(result);


        // Now, this is the form of selection my local money o currency.
        // Firsts: search in Google "Colombia local code". Colombia in this case
        Locale locale = Locale.forLanguageTag("es-CO");
        NumberFormat localNumberFormat = NumberFormat.getCurrencyInstance(locale);
        String localeResult = localNumberFormat.format(1099.90);
        System.out.println(localeResult);


        // Now, we Formatted a number for change to percentage
        NumberFormat percentage = NumberFormat.getPercentInstance();
        System.out.println(percentage.format(0.30));





    }
}
