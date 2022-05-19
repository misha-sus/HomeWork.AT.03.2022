package HomeWorkCollections.FamilyCats;

import HomeWorkCollections.Cat;
import HomeWorkCollections.interfaceCat.Strokable;

public class ThaiCat extends Cat implements Strokable {


    public ThaiCat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void stroke() {
        System.out.println("Поглаживать");
    }
}
