package HomeWorkCollections.FamilyCats;

import HomeWorkCollections.Cat;
import HomeWorkCollections.interfaceCat.Strokable;

public class SiberianCat extends Cat implements Strokable {

    public SiberianCat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void stroke() {
        System.out.println("Поглаживать");
    }
}
