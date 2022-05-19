package HomeWorkCollections.FamilyCats;

import HomeWorkCollections.Cat;
import HomeWorkCollections.interfaceCat.WildCat;

public class Lion extends Cat implements WildCat {

    public Lion(String name, int weight) {
        super(name, weight);
    }
}
