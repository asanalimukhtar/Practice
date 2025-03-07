public class Mage implements Character {
    String name;
    int health;

    public Mage(String name) {
            this.name = name;
            this.health = 100;
        }
        @Override
        public void attack() {
            System.out.println(name + " avaadacidabraa damage 30 health");
        }
}

