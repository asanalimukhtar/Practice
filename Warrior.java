public class Warrior implements Character {
    String name;
    int health;
    public Warrior(String name) {
        this.name = name;
        this.health = 150;
    }

    @Override
    public void attack() {
        System.out.println(name + " attack with sword and damage 20 health");
    }
}