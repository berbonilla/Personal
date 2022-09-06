public class Pet {
    float trustlevel;
    int petlevel;
    String name;
    boolean SP;

    
    public void Hayup(){
        System.out.println("---------------------------------------");
        System.out.println("NAME: " + name + "\n\nPet Level: " + petlevel);
        System.out.println("\nTrust Level: " + trustlevel+"\n\nSpirit: "+ SP );
        System.out.println("---------------------------------------");
    }

    public Pet(int PETlvl, float TRSTlvl,String PETname,boolean Spirit) {
        petlevel = PETlvl;
        trustlevel = TRSTlvl;
        name = PETname;
        SP = Spirit;
    }



}
