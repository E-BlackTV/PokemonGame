package at.wifi.codingacademy.PokemonGame;

import at.wifi.codingacademy.PokemonGame.models.Attacks;
import at.wifi.codingacademy.PokemonGame.models.Elements;
import at.wifi.codingacademy.PokemonGame.models.Player;
import at.wifi.codingacademy.PokemonGame.models.Pokemon;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Pokemon Initialization
        Pokemon pikachu = new Pokemon("Pikachu", Elements.ELECTRICITY, 80, 130, 15, null, false);
        Pokemon glumanda = new Pokemon("Glumanda", Elements.FIRE, 90, 120, 20, null, false);
        Pokemon bisasam = new Pokemon("Bisasam", Elements.EARTH, 140, 55, 45, null, false);
        Pokemon flamiau = new Pokemon("Flamiau", Elements.FIRE, 100, 115, 10, null, false);
        Pokemon mewto = new Pokemon("Mewto", Elements.MAGIC, 500, 1000, 200, Attacks.INSTANTDEATH, false);

        // Player Initialization
        Player Ash = new Player(1, 1);
        Player Sindy = new Player(1, 1);

        // Scanner for User Input
        Scanner scanner = new Scanner(System.in);

        // Ash's Pokemon Selection
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

        // Sindy's Pokemon Selection
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

        // Ash's Attack Selection
        System.out.println("Ash choose your Attacks for " + Ash.getSelectedPokemon() +
                "\n 1: " + Attacks.PUNCH +
                "\n 2: " + Attacks.SHOOT +
                "\n 3: " + Attacks.DISORIENTATE);

        int ashAttackChoice = scanner.nextInt();
        switch (ashAttackChoice) {
            case 1:
                // Set Attack and Health Multipliers for Ash's Pokemon
                Ash.setAttackMultiplier(1.2);
                Ash.setHealthMultiplier(0.9);
                break;
            case 2:
                Ash.setAttackMultiplier(1.4);
                Ash.setHealthMultiplier(0.8);
                break;
            case 3:
                Ash.setAttackMultiplier(0.5);
                Ash.setHealthMultiplier(1.2);
                break;
            default:
                System.out.println("Invalid choice: " + ashAttackChoice);
                break;
        }

        if (ashAttackChoice == 3) {
            // If Ash's Pokemon is disoriented
            System.out.println("Your Pokemon is disoriented");
            boolean disoriented = true;
        }

        while (disoriented) {
            Sindy.setAttackMultiplier(0.5);
            Sindy.setHealthMultiplier(0.5);
        }
    }
}