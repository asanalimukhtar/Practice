public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character warrior = characterFactory.createCharacter("warrior", "Artur");
        Character mage = characterFactory.createCharacter("mage", "Merlin");
        Character archer = characterFactory.createCharacter("archer", "Legolas");
        warrior.attack();
        mage.attack();
        archer.attack();
    }
}