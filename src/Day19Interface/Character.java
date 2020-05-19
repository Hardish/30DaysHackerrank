package Day19Interface;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

//cannot create instance of interface same as abstract class.
//Interface can extend other interfaces
//implements interface and extends class --------> IMP
//only public as any one can access it
public interface Character {

    //you cannot change static final property. you cannot change in other class
    String base = "Character";  //has to be public only

    void attack();  //public by default
    void heal();
    public String getWeapon();

}
