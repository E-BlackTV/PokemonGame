package at.wifi.codingacademy.PokemonGame.models;

public class Pokemon {
    protected String name;
    protected Elements element;
    protected int health;
    protected int damage;
    protected int defense;
    protected Attacks attack;

    //Konstruktor

    public Pokemon(String name, Elements element, int health, int damage, int defense, Attacks attack) {
        this.name = name;
        this.element = element;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.attack = attack;
    }


    //Methoden

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Elements getElement() {
        return element;
    }

    public void setElement(Elements element) {
        this.element = element;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public Attacks getAttack() {
        return attack;
    }

    public void setAttack(Attacks attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", element=" + element +
                ", health=" + health +
                ", damage=" + damage +
                ", defense=" + defense +
                ", attack=" + attack +
                '}';
    }
}
