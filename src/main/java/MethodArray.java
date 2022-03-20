import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MethodArray {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5};
        int[] numbers1 = {5, 3, 1};
        /**
         * Метод equals сравнивает значение двух массивов
         * Метод equals в классе Arrays переопределен
         */
        System.out.println("Сравниваем значения двух массивов = " + (Arrays.equals(numbers, numbers1)));
        /**
         * Метод fill присваивает указанное значение типа данных
         * каждому элементу указанного диапазона указанного массива.
         */
        Arrays.fill(numbers, 0);
        System.out.println("Присваиваем значение кажому элемента массива " + (Arrays.toString(numbers)));

        /**
         * Метод HashCode Возвращает хэш-код на основе содержимого указанного массива.*/
        System.out.println("Возвращает хэш-код на основе содержимого указанного массива. " + (Arrays.hashCode(numbers)));


        /**
         Метод sort сортирует массив
         **/
        Arrays.sort(numbers1);
        System.out.println("Метод sort отсортировал массив" + (Arrays.toString(numbers1)));

        /**
         * binarySearch(int[] a, int key)
         * Ищет в указанном массиве целых чисел указанное значение*/
        System.out.println(Arrays.binarySearch(numbers1, 1));
        /**
         * 	copyOf(int[] original, int newLength)
         * Копирует указанный массив, усекая или дополняя нулями (при необходимости), чтобы копия имела указанную длину.*/

        int[] copy = {1,4,32,5};
        int [] copy1=Arrays.copyOf(copy,copy.length);
        System.out.println(Arrays.toString(copy1));

        /** метод parallelPrefix выполняет операцию над каждым элементом входного массива накопительным образом.*/
        Arrays.parallelPrefix(copy,(x,y) -> x+y);
        System.out.println(Arrays.toString(copy));

        /** Arrays.deepToString  Возвращает контент массива стрингой*/
        String DeepToString = Arrays.deepToString(new int[][]{numbers});
        System.out.println(DeepToString);



    }
}
