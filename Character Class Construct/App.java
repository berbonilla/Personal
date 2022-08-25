public class App {
    public static void main(String[] args) {

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        int random = (int)(Math.random()*range)+min;
     
        Character knight = new Character(random, random, random, "Lancelot");
        knight.sayMyName();
        knight.sayMyStats();

        Character mage = new Character(random, random, random, "Barang,");
        mage.sayMyName();
        mage.sayMyStats();

        Character thief = new Character((int)(5+Math.random()*30), (int)(5+Math.random()*30), (int)(5+Math.random()*30), "Gondar,");
        thief.sayMyName();
        thief.sayMyStats();

        Character rogue = new Character((int)(5+Math.random()*30), (int)(5+Math.random()*30), (int)(5+Math.random()*30), "Cardo,");
        rogue.sayMyName();
        rogue.sayMyStats();

        Character kawatan = new Character((int)(5+Math.random()*30), (int)(5+Math.random()*30), (int)(5+Math.random()*30), "BBM,");
        kawatan.sayMyName();
        kawatan.sayMyStats();
    }
}
