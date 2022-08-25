import java.lang.Math;

public class App {
    
    public static void main(String[] args) {

        int STRrandnum = (int)(5+Math.random()*10);
        int AGIrandnum = (int)(5+Math.random()*10);
        int INTrandnum = (int)(5+Math.random()*10);
        int LCKrandnum = (int)(5+Math.random()*10);
        int DEXrandnum = (int)(5+Math.random()*10);

        Character Brute = new Character();

        Brute.strength = STRrandnum;
        Brute.agility = AGIrandnum;
        Brute.intelligence = INTrandnum;
        Brute.luck = LCKrandnum;
        Brute.dexterity = DEXrandnum;
        Brute.name = "TheShy";
        Brute.sayMyName();
        Brute.sayMyStats();

        Character Warlock = new Character();

        Warlock.strength = STRrandnum;
        Warlock.agility = AGIrandnum;
        Warlock.intelligence = INTrandnum;
        Warlock.luck = LCKrandnum;
        Warlock.dexterity = DEXrandnum;
        Warlock.name = "Caps";
        Warlock.sayMyName();
        Warlock.sayMyStats();

        Character Rogue = new Character();

        Rogue.strength = STRrandnum;
        Rogue.agility = AGIrandnum;
        Rogue.intelligence = INTrandnum;
        Rogue.luck = LCKrandnum;
        Rogue.dexterity = DEXrandnum;
        Rogue.name = "Oner";
        Rogue.sayMyName();
        Rogue.sayMyStats();

        Character Priest = new Character();

        Priest.strength = STRrandnum;
        Priest.agility = AGIrandnum;
        Priest.intelligence = INTrandnum;
        Priest.luck = LCKrandnum;
        Priest.dexterity = DEXrandnum;
        Priest.name = "Hylissang";
        Priest.sayMyName();
        Priest.sayMyStats();

        Character Archer = new Character();

        Archer.strength = STRrandnum;
        Archer.agility = AGIrandnum;
        Archer.intelligence = INTrandnum;
        Archer.luck = LCKrandnum;
        Archer.dexterity = DEXrandnum;
        Archer.name = "Viper";
        Archer.sayMyName();
        Archer.sayMyStats();
    }
}
