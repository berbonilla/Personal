public class Character {
    // Attributes
    int strength;
    int agility;
    int intelligence;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name + "\n");
    }
    
    public void sayMyStats() {
        System.out.println("STR: " + strength + " AGI: "+ agility + " INT: " + intelligence + "\n");
    }

    public Character(int str, int agi, int intel, String characterName) {
        strength = str;
        agility = agi;
        intelligence = intel;
        name = characterName;
    }



}
