package Day19Interface;

public class Hero implements Character {

    public String weapon = "The Force";


    @Override
    public void attack() {
        System.out.println("The HERO attacks Enemy");
    }

    @Override
    public void heal() {
        System.out.println("The hero heals YOU!!!");
    }

    @Override
    public String getWeapon() {
        return weapon;
    }
}
