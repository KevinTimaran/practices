package Ejercicios.JuegoPokemon.Logica.Personajes;

import Ejercicios.JuegoPokemon.Logica.Interfaces.IElectrico;
import Ejercicios.JuegoPokemon.Logica.Pokemon;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hi, I am Pikachu and this is my attack placaje");
    }

    @Override
    public void atacarAraniazo() {
            System.out.println("Hi, I am Pikachu and this is my attack araniazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hi, I am Pikachu and this is my attack mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hi, I am Pikachu and this is my attack impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hi, I am Pikachu and this is my attack punio trueno");
    }
}
