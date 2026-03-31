package Ejercicios.JuegoPokemon.Logica.Personajes;

import Ejercicios.JuegoPokemon.Logica.Interfaces.IFuego;
import Ejercicios.JuegoPokemon.Logica.Pokemon;

public class Charmander extends Pokemon implements IFuego {

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hi, I am Charmander and this is my attack placaje");
    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hi, I am Charmander and this is my attack araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hi, I am Charmander and this is my attack mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hi, I am Charmander and this is my attack punio fuego");
    }

    @Override
    public void atacarLanzaLLamas() {
        System.out.println("Hi, I am Charmander and this is my attack lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hi, I am Charmander and this is my attack ascuas");
    }
}
