package at.wifi.codingacademy.PokemonGame;

import at.wifi.codingacademy.PokemonGame.models.Attacks;
import at.wifi.codingacademy.PokemonGame.models.Elements;
import at.wifi.codingacademy.PokemonGame.models.Player;
import at.wifi.codingacademy.PokemonGame.models.Pokemon;

import java.util.Random;

public class Program {
    public static void main(String[] args) {


        Pokemon pikachu = new Pokemon("Pikachu", Elements.ELECTRICITY, 80, 130, 15, null);
        Pokemon glumanda = new Pokemon("Glumanda", Elements.FIRE, 90, 120, 20, null);
        Pokemon bisasam = new Pokemon("Bisasam", Elements.EARTH, 140, 55, 45, null);
        Pokemon flamiau = new Pokemon("Flamiau", Elements.FIRE, 100, 115, 10, null);
        Pokemon mewto = new Pokemon("Mewto", Elements.MAGIC, 500, 1000, 200, Attacks.INSTANTDEATH);
    }
}
