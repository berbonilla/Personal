public class Character {
    int strength;
    int agility;
    int intelligence;
    int luck;
    int dexterity;
    String name;

    public void sayMyName() {
        System.out.println("Hello I am " + name + ",");
    }
    
    public void sayMyStats() {
        System.out.println("\nSTR: " + strength + " AGI: " + agility + " INT: " + intelligence + " LCK: " + luck + " DEX: " + dexterity + "\n");
    }
}
