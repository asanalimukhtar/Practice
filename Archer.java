public class Archer implements Character {
    private String name;
    private int health;

    public Archer(String name) {
        this.name = name;
        this.health = 120;
    }

    @Override
    public void attack() {
        System.out.println(name + " damage 30 health");
    }
}