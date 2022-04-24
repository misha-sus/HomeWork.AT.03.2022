package HomeWork11.FamilyCats;

import HomeWork11.Cat;
import HomeWork11.interfaceCat.WildCat;

public class Lion extends Cat implements WildCat {

    public Lion(String name, int weight) {
        super(name, weight);
    }
}
