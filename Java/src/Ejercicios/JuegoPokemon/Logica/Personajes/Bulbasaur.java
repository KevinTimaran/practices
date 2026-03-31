package Ejercicios.JuegoPokemon.Logica.Personajes;

import Ejercicios.JuegoPokemon.Logica.Interfaces.IPlanta;
import Ejercicios.JuegoPokemon.Logica.Pokemon;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hi, I am Bulbasaur and this is my attack placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hi, I am Bulbasaur and this is my attack araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hi, I am Bulbasaur and this is my attack mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hi, I am Bulbasaur and this is my attack drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hi, I am Bulbasaur and this is my attack paralizar");
    }
}
