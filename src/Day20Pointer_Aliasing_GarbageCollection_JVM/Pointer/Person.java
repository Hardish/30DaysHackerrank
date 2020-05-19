package Day20Pointer_Aliasing_GarbageCollection_JVM.Pointer;

import static Day20Pointer_Aliasing_GarbageCollection_JVM.Pointer.HairColor.*;

public class Person {

    HairColor Haircolor = BLACK;

    public Person()
    {

    }
    public static void main(String[] args) {

        Person peterParker = new Person();
        peterParker.Haircolor = PINK;     //it will change spiderMan also
        Person spiderMan = peterParker;  //Aliasing (point to same object)
        spiderMan.Haircolor = BLUE;      //it will change the peterParker also

        System.out.println("Haircolor of Peter Parker: " +peterParker.Haircolor);
        System.out.println("Haircolor of Spiderman: " +spiderMan.Haircolor);
    }
}
