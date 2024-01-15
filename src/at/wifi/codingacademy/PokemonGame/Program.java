package at.wifi.codingacademy.PokemonGame;

import at.wifi.codingacademy.PokemonGame.models.Attacks;
import at.wifi.codingacademy.PokemonGame.models.Elements;
import at.wifi.codingacademy.PokemonGame.models.Player;
import at.wifi.codingacademy.PokemonGame.models.Pokemon;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", Elements.ELECTRICITY, 80, 130, 15, null);
        Pokemon glumanda = new Pokemon("Glumanda", Elements.FIRE, 90, 120, 20, null);
        Pokemon bisasam = new Pokemon("Bisasam", Elements.EARTH, 140, 55, 45, null);
        Pokemon flamiau = new Pokemon("Flamiau", Elements.FIRE, 100, 115, 10, null);
        Pokemon mewto = new Pokemon("Mewto", Elements.MAGIC, 500, 1000, 200, Attacks.INSTANTDEATH);

        Player Ash = new Player(1, 1);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ash choose your pokemon by tiping in the number: " +
                "\n 1: " + pikachu +
                "\n 2: " + glumanda +
                "\n 3: " + bisasam +
                "\n 4: " + flamiau);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Ash.addPokemon(pikachu);
                break;
            case 2:
                Ash.addPokemon(glumanda);
                break;
            case 3:
                Ash.addPokemon(bisasam);
                break;
            case 4:
                Ash.addPokemon(flamiau);
                break;
        }
        System.out.println(Ash);


        System.out.println("Ash choose your pokemon by tiping in the number: " +
                "\n 1: " + pikachu +
                "\n 2: " + glumanda +
                "\n 3: " + bisasam +
                "\n 4: " + flamiau);

        switch (choice) {
            case 1:
                Ash.addPokemon(pikachu);
                break;
            case 2:
                Ash.addPokemon(glumanda);
                break;
            case 3:
                Ash.addPokemon(bisasam);
                break;
            case 4:
                Ash.addPokemon(flamiau);
                break;
        }
        System.out.println(Ash);
    }
}
