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
        Player Sindy = new Player(1, 1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ash choose your pokemon by typing in the number: " +
                "\n 1: " + pikachu +
                "\n 2: " + glumanda +
                "\n 3: " + bisasam +
                "\n 4: " + flamiau);
        int ashChoice = scanner.nextInt();

        switch (ashChoice) {
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
            case 999:
                Ash.addPokemon(mewto);
                break;
            default:
                System.out.println("Invalid choice: " + ashChoice);
                break;
        }
        System.out.println(Ash);

        System.out.println("Sindy choose your pokemon by typing in the number: " +
                "\n 1: " + pikachu +
                "\n 2: " + glumanda +
                "\n 3: " + bisasam +
                "\n 4: " + flamiau);
        int sindyChoice = scanner.nextInt();

        switch (sindyChoice) {
            case 1:
                Sindy.addPokemon(pikachu);
                break;
            case 2:
                Sindy.addPokemon(glumanda);
                break;
            case 3:
                Sindy.addPokemon(bisasam);
                break;
            case 4:
                Sindy.addPokemon(flamiau);
                break;
            case 999:
                Sindy.addPokemon(mewto);
                break;
            default:
                System.out.println("Invalid choice: " + sindyChoice);
                break;
        }
        System.out.println(Sindy);
    }
}
