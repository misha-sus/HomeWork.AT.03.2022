package HomeWorkStreamApi.preconditionObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FruitFilter {

    public static Stream<Fruit> getStreamFruit() {
        Apple apple1 = new Apple();
        apple1.setFresh(true);
        Apple apple2 = new Apple();
        apple2.setFresh(true);
        Apple apple3 = new Apple();
        apple3.setFresh(true);
        Apple apple4 = new Apple();
        apple4.setFresh(false);
        Apple apple5 = new Apple();
        apple5.setFresh(false);
        Orange orange1 = new Orange();
        orange1.setFresh(true);
        Orange orange2 = new Orange();
        orange2.setFresh(true);
        Orange orange3 = new Orange();
        orange3.setFresh(true);
        Orange orange4 = new Orange();
        orange4.setFresh(false);
        Orange orange5 = new Orange();
        orange5.setFresh(false);
        List<Fruit> fruitList = new ArrayList<>();
        fruitList.add(apple1);
        fruitList.add(apple2);
        fruitList.add(apple3);
        fruitList.add(apple5);
        fruitList.add(orange1);
        fruitList.add(orange2);
        fruitList.add(orange3);
        fruitList.add(apple4);
        fruitList.add(orange4);
        fruitList.add(orange5);
        return fruitList.stream();
    }



}
