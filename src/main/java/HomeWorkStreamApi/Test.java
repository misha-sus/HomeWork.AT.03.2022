package HomeWorkStreamApi;

import HomeWorkStreamApi.preconditionObjects.Apple;
import HomeWorkStreamApi.preconditionObjects.Fruit;
import HomeWorkStreamApi.preconditionObjects.Orange;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static HomeWorkStreamApi.preconditionObjects.FruitFilter.getStreamFruit;

public class Test {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        getStreamFruit().filter(Fruit::isFresh).forEach(System.out::println);

        //Задание 2
        System.out.println("\nЗадание 2");
        getStreamFruit().filter(fruit -> !(fruit.isFresh())).forEach(fruit -> {
            fruit.setToDo("Выкинуть в мусорку");
            System.out.println(fruit); });

        //Задание 3
        System.out.println("\nЗадание 3");
        getStreamFruit()
                .filter(fruit -> (fruit instanceof Orange) && fruit.isFresh())
                .forEach(fruit -> ((Orange) fruit).eatOrange());
        //Задание 4
        System.out.println("\nЗадание 4");
       List<Fruit> apples=  getStreamFruit()
                .filter(fruit -> (fruit instanceof Apple) && fruit.isFresh())
                .collect(Collectors.toList());
       apples.stream().limit(2).forEach(fruit -> ((Apple)fruit).makeJam());

        //Задание 5
        System.out.println("\nЗадание 5");
        List<Fruit> fruits = new ArrayList<>();
        readFile("src/main/resources/fruit.txt").forEach(fruit ->{
            if(fruit.equalsIgnoreCase("яблоко")){
                Apple apple = new Apple();
                apple.setFresh(true);
                fruits.add(apple);
            }else if(fruit.equalsIgnoreCase("апельсин")){
                Orange orange = new Orange();
                orange.setFresh(true);
                fruits.add(orange);
            }
        });
        fruits.forEach(System.out::println);

    }

    /**
     * Метод читает файл
     * @param fileName -  Путь до файла
     * @return         -  Список типа String
     */
    public static List<String> readFile(String fileName) {
        List<String> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader(fileName)) {
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            while (line != null) {
                list.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
