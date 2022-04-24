package HomeWork11.sortCatComparator;

import HomeWork11.Cat;

import java.util.Comparator;

public class CatNameComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}