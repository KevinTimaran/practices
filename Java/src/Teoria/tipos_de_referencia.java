package Teoria;

public class tipos_de_referencia {
    public static void main(String[] args) {
        String text = "Hola mundo";
        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("mundo", "Chaolin"); // Para remplazar un palbra con otra
        System.out.println(texto);

        //Metodos
        System.out.println(texto.endsWith("lin")); // Si la cadena de texto termina con "lin"
        System.out.println(texto.startsWith("Hol")); // Si la cadena de texto comienza con "Hol"
        System.out.println(texto.contains("aol")); // Para ver si la cadena de texto contiene una cadena de texto en especifico "aol"
        System.out.println(texto.indexOf("la")); // Para ver en que pocision se encuentra una cadena de texto en especifico "la"

        System.out.println(texto.toUpperCase()); // pasa todo el texto a mayusculas
        System.out.println(texto.toLowerCase()); // pasa sodo el texto en minusculas

        //Metodo para aliminar los espacios imnecesarios entre las palabras
        String malo = "    Chanchito    feliz";
        System.out.println(malo);
        System.out.println(malo.trim());
    } 

}