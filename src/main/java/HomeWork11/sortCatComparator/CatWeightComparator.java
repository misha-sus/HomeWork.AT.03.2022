package HomeWork11.sortCatComparator;

import HomeWork11.Cat;

import java.util.Comparator;

public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return Integer.compare(o1.getWeight(), o2.getWeight());
    }
}
