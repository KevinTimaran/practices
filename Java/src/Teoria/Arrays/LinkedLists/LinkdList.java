package Teoria.Arrays.LinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkdList {
    public static void main(String[] args) {

        List<Persona> lista = new LinkedList<Persona>();

        lista.add(new Persona(20, "Juan", 1));
        lista.add(new Persona(30, "Camilo", 2));
        lista.add(new Persona(40, "Diego", 3));
        lista.add(new Persona(50, "Carlos", 4));
        lista.add(new Persona(60, "Diego", 5));

        System.out.println("---------------Agregar elementos a la lista---------------");
        lista.add(0,new Persona(70, "PErro", 1));


        System.out.println("---------------FOREACH--------------");
        for (Persona persona : lista) {
            System.out.println(persona.getNombre());
        }

        //====================================
        //Delete a data from LinkdList
        //====================================
        System.out.println("---------------DELETE ELEMENT FROM LINKDLIST--------------");
        String nombreBorrar = "PErro";
        for (Persona persona : lista) {
            if (persona.getNombre().equals(nombreBorrar)) {
                lista.remove(persona);

                for (Persona p : lista){
                    System.out.println(p.getNombre());
                }
                break;
            }
        }


    }

}
