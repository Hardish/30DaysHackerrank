package Day19Interface;

import java.util.Random;

public class StarWarsInterfacePractice {

    public static Character summonCharacter() {
        Random random = new Random();

        if(Math.abs(random.nextInt()) % 2 == 0) {
            return new Enemy();
        }else {
            return new Hero();
        }
    }
    public static void main(String[] args) {

        Enemy darthVader = new Enemy();
        Hero Obi_Wan_Kenobi = new Hero();


        darthVader.attack();;
        Obi_Wan_Kenobi.attack();
        darthVader.heal();
        Obi_Wan_Kenobi.heal();

        System.out.println("Enemy weapon: " +darthVader.getWeapon());
        System.out.println("Enemy weapon: " +Obi_Wan_Kenobi.getWeapon());

        Character spy = summonCharacter();  //can be Hero or Enemy
        spy.attack();
        spy.heal();
    }
}
