package Ejercicios.JuegoPokemon.Logica.Personajes;

import Ejercicios.JuegoPokemon.Logica.Interfaces.IAgua;
import Ejercicios.JuegoPokemon.Logica.Interfaces.IPlanta;
import Ejercicios.JuegoPokemon.Logica.Pokemon;

public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hi, I am Squirtle and this is my attack placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hi, I am Squirtle and this is my attack araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hi, I am Squirtle and this is my attack mordisco");
    }


    @Override
    public void atacarHidrobomba() {
        System.out.println("Hi, I am Squirtle and this is my attack Hidrobomba");
    }

    @Override
    public void atacarBorbuja() {
        System.out.println("Hi, I am Squirtle and this is my attack Borbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hi, I am Squirtle and this is my attack Pistola Agua");
    }
}
