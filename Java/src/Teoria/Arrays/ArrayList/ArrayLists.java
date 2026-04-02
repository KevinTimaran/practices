package Teoria.Arrays.ArrayList;
import java.util.List;
import java.util.ArrayList;


public class ArrayLists {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();
        lista.add(new Persona(20, "Juan", 1));
        lista.add(new Persona(30, "Maria", 2));
        lista.add(new Persona(40, "Pedro", 3));
        lista.add(new Persona(50, "Lucas", 4));
        lista.add(new Persona(60, "carlos", 5));

        System.out.println("---------------FOR--------------");
        //Recorre indice
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }

        System.out.println("---------------FOREACH--------------");
        //Recorrido foreach
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }


        //====================================
        // Delete element from list
        //====================================
        System.out.println("---------------DELETE ELEMENT FROM LIST--------------");
        lista.remove(1);
        for  (Persona persona : lista) {
            System.out.println(persona.getNombre());
        };


    }
}
