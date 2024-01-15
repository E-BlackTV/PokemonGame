package at.wifi.codingacademy.PokemonGame.models;

public class Pokemon {
    // Attributes of the Pokemon
    protected String name;       // Name of the Pokemon
    protected Elements element;  // Element type of the Pokemon
    protected int health;        // Health points of the Pokemon
    protected int damage;        // Damage points of the Pokemon
    protected int defense;       // Defense points of the Pokemon
    protected Attacks attack;    // Type of attack of the Pokemon
    protected boolean disorient = false; // Tells if the Pokemon is currently disoriented

    // Constructor to initialize the Pokemon
    public Pokemon(String name, Elements element, int health, int damage, int defense, Attacks attack, boolean disorient) {
        this.name = name;
        this.element = element;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.attack = attack;
        this.disorient = disorient;
    }
    // Getter for the name of the Pokemon
    public String getName() {
        return name;
    }

    // Setter for the name of the Pokemon
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the element type of the Pokemon
    public Elements getElement() {
        return element;
    }

    // Setter for the element type of the Pokemon
    public void setElement(Elements element) {
        this.element = element;
    }

    // Getter for the health points of the Pokemon
    public int getHealth() {
        return health;
    }

    // Setter for the health points of the Pokemon
    public void setHealth(int health) {
        this.health = health;
    }

    // Getter for the damage points of the Pokemon
    public int getDamage() {
        return damage;
    }

    // Setter for the damage points of the Pokemon
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Getter for the defense points of the Pokemon
    public int getDefense() {
        return defense;
    }

    // Setter for the defense points of the Pokemon
    public void setDefense(int defense) {
        this.defense = defense;
    }

    // Getter for the type of attack of the Pokemon
    public Attacks getAttack() {
        return attack;
    }

    // Setter for the type of attack of the Pokemon
    public void setAttack(Attacks attack) {
        this.attack = attack;
    }

    public boolean isDisorient() {
        return disorient;
    }

    public void setDisorient(boolean disorient) {
        this.disorient = disorient;
    }

    // toString method to represent the Pokemon object as a string
    @Override
    public String toString() {
        return name + ": " +
                ", element = " + element +
                ", health = " + health +
                ", damage = " + damage +
                ", defense = " + defense +
                ", attack = " + attack +
                '}';
    }
}