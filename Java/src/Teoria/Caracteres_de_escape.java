package Teoria;

public class Caracteres_de_escape {
    public static void main(String[] args) {
        String texto = "C: \\Hola \" mundo\">";
        String separacion = "Hola \nmundo";
        String cadena = "texto \tseparacion";
        System.out.println(texto);
        System.out.println(separacion);
        System.out.println(cadena);
    }
}
