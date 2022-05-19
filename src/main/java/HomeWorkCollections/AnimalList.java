package HomeWorkCollections;

import HomeWorkCollections.interfaceCat.Strokable;
import HomeWorkCollections.interfaceCat.WildCat;
import HomeWorkCollections.sortCatComparator.CatNameComparator;
import HomeWorkCollections.sortCatComparator.CatWeightComparator;
import HomeWorkCollections.wrapperCats.WrapperCats;

import java.util.*;

public class AnimalList {

    private final static String[] name = {"Пират", "Боливар", "Кристо", "Майк", "Джек", "Тонни", "Люци", "Грин", "Люк"};

    public static void main(String[] args) {

        /*
         * 1
         * Написать абстрактный класс Animal, отнаследоваться от него классами Cat и Dog.
         * Создать три List<>, 4 котика и 3 собачки.
         * В первый лист должна быть возможность сложить всех животных,
         * во второй - только котиков, в третий - только собачек.
         */

        List<Animal> animals = animalsGenerator(3, 4);
        List<Cat> cats = catsGenerator(4);
        List<Dog> dogs = dogsGenerator(3);

        /*
         * 2
         * Отнаследоваться от Cat классами Lion, Tiger, ThaiCat, SiameseCat, SiberianCat.
         * Добавить интерфейс Strokable с методом stroke() и реализовать его в последних трёх классах для котеек,
         * интерфейс WildCat сделать без методов и добавить первым двум классам.
         * Добавить по одному List, в который можно положить только диких кошек и кошек,
         * которых можно погладить.
         */

        List<WildCat> wildCats = new ArrayList<>();
        List<Strokable> strokablesCats = new ArrayList<>();

        /*
         * 3
         * Добавить коллекцию, в которую можно положить только уникальных кошек,
         * проверить, что двух разных кошечек туда положить нельзя.
         */

        HashSet<Cat> uniqueCats = new HashSet<>();

        /*
         * 4
         * Добавить коллекцию, в которой в ключах будут храниться хозяева кошек,
         * а в значениях будут храниться кошечки.
         */

        HashMap<OwnerCat, Cat> ownerCatHashMap = new HashMap<>();

        /*
         * 5
         * Первое задание со звёздочкой, как сделать так,
         * чтобы можно было в коллекции из 4 задания у одного и того же хозяина хранить несколько кошечек,
         * реализовать такое хранение.
         */

        HashMap<OwnerCat, WrapperCats> ownerCatsHashMap = new HashMap<>();
        ownerCatsHashMap.put(new OwnerCat(), new WrapperCats(new Cat("Bob", 2),
                                                             new Cat("Jones", 1)));

        /*
         * 6
         * Добавить котикам поле с весом, создать 5 котиков с разным весом,
         * положить в коллекцию и отсортировать их по весу.
         */

        List<Cat> catsSort = catsGenerator(5);
        Collections.sort(catsSort);
        catsSort.forEach(System.out::println);

        /*
         * 7
         * Второе задание со звёздочкой. Если вес у котиков одинаковый,
         * то нужно сортировать по кличке в алфавитном порядке. (реализовать через Comparator<T>)
         */

        System.out.println("<--------------------------->");
        Comparator<Cat> catsSortComparator = new CatWeightComparator().thenComparing(new CatNameComparator());
        List<Cat> catsSortNameAndWeight = catsGenerator(5);
        catsSortNameAndWeight.sort(catsSortComparator);
        catsSortNameAndWeight.forEach(System.out::println);

    }

    /**
     * @param numberCatsCreate количество создаваемых Cat
     * @return список созданых кошек
     */
    public static ArrayList<Cat> catsGenerator(int numberCatsCreate) {
        ArrayList<Cat> cats = new ArrayList<>();
        for (int i = 0; i < numberCatsCreate; i++) {
            int n = (int) (Math.random() * 9);
            cats.add(new Cat(name[n], new Random().nextInt(10) + 1));
        }
        return cats;
    }

    /**
     * @param numberDogsCreate количество создаваемых собак
     * @return список созданых собак
     */
    public static ArrayList<Dog> dogsGenerator(int numberDogsCreate) {
        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < numberDogsCreate; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    /**
     * @param numberDogsCreate количество создаваемых Dog
     * @param numberCatsCreate количество создаваемых Cat
     * @return список животных (собак и кошек)
     */
    public static ArrayList<Animal> animalsGenerator(int numberDogsCreate, int numberCatsCreate) {
        ArrayList<Animal> animals = new ArrayList<>();
        for (int i = 0; i < numberDogsCreate; i++) {
            animals.add(new Dog());
        }
        for (int i = 0; i < numberCatsCreate; i++) {
            int n = (int) (Math.random() * 9);
            animals.add(new Cat(name[n], 1));
        }
        return animals;
    }
}
