package at.wifi.codingacademy.PokemonGame.models;

import java.util.ArrayList;

public class Player {
    protected ArrayList<Pokemon> pokemons;   // List to store the player's Pokemon
    protected double attackMultiplier;       // Multiplier for the player's attack strength
    protected double healthMultiplier;       // Multiplier for the player's Pokemon health
    protected Pokemon selectedPokemon;       // Currently selected Pokemon for the player

    // Constructor
    public Player(double attackMultiplier, double healthMultiplier) {
        this.pokemons = new ArrayList<Pokemon>();
        this.attackMultiplier = attackMultiplier;
        this.healthMultiplier = healthMultiplier;
    }

    // Method to add a Pokemon to the player's list
    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    // Getter for the player's Pokemon list
    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    // Setter for the player's Pokemon list
    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    // Getter for the player's attack multiplier
    public double getAttackMultiplier() {
        return attackMultiplier;
    }

    // Setter for the player's attack multiplier
    public void setAttackMultiplier(double attackMultiplier) {
        this.attackMultiplier = attackMultiplier;
    }

    // Getter for the player's health multiplier
    public double getHealthMultiplier() {
        return healthMultiplier;
    }

    // Setter for the player's health multiplier
    public void setHealthMultiplier(double healthMultiplier) {
        this.healthMultiplier = healthMultiplier;
    }

    // Getter for the currently selected Pokemon
    public Pokemon getSelectedPokemon() {
        return selectedPokemon;
    }

    // toString method to represent the Player object as a string
    @Override
    public String toString() {
        return "Player{" +
                "pokemons: " + pokemons +
                ", attackMultiplier: " + attackMultiplier +
                ", healthMultiplier: " + healthMultiplier +
                '}';
    }
}