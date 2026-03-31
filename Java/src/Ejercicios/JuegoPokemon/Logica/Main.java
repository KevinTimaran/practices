package Ejercicios.JuegoPokemon.Logica;

import Ejercicios.JuegoPokemon.Logica.Personajes.Bulbasaur;
import Ejercicios.JuegoPokemon.Logica.Personajes.Charmander;
import Ejercicios.JuegoPokemon.Logica.Personajes.Pikachu;
import Ejercicios.JuegoPokemon.Logica.Personajes.Squirtle;

public class Main {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzaLLamas();

        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();

        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
    }
}
