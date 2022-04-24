package HomeWork11.FamilyCats;

import HomeWork11.Cat;
import HomeWork11.interfaceCat.Strokable;

public class SiameseCat extends Cat implements Strokable {

    public SiameseCat(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void stroke() {
        System.out.println("Поглаживать");
    }
}
