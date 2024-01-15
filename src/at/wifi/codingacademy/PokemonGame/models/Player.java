package at.wifi.codingacademy.PokemonGame.models;

import java.util.ArrayList;

public class Player {
    protected ArrayList<Pokemon> pokemons;
    protected double attackMultiplier;
    protected double healthMultiplier;
    protected Pokemon selectedPokemon;

    public Player(double attackMultiplier, double healthMultiplier) {
        this.pokemons = new ArrayList<Pokemon>();
        this.attackMultiplier = attackMultiplier;
        this.healthMultiplier = healthMultiplier;
    }

    //Methods

    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public double getAttackMultiplier() {
        return attackMultiplier;
    }

    public void setAttackMultiplier(double attackMultiplier) {
        this.attackMultiplier = attackMultiplier;
    }

    public double getHealthMultiplier() {
        return healthMultiplier;
    }

    public void setHealthMultiplier(double healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
    }


    public Pokemon getSelectedPokemon() {
        return selectedPokemon;
    }

    @Override
    public String toString() {
        return "Player{" +
                "pokemons: " + pokemons +
                ", attackMultiplier: " + attackMultiplier +
                ", healthMultiplier: " + healthMultiplier +
                '}';
    }
}
