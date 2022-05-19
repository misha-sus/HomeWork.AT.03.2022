package HomeWorkCollections.FamilyCats;

import HomeWorkCollections.Cat;
import HomeWorkCollections.interfaceCat.Strokable;

public class SiameseCat extends Cat implements Strokable {

    public SiameseCat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void stroke() {
        System.out.println("Поглаживать");
    }
}
