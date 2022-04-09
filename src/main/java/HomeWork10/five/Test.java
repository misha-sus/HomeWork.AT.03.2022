package HomeWork10.five;

import static HomeWork10.five.Test.Season.*;

public class Test {
    enum Season {
        WINTER("Зима"),
        SPRING("Весна"),
        SUMMER("Лето"),
        FALL("Осень");

        String season;

        Season(String season) {
            this.season = season;
        }

        @Override
        public String toString() {
            return season;
        }
    }


    public static void main(String[] args) {
        for (Season s : Season.values())
            System.out.println(s);

        System.out.println("-------6--------");

        System.out.println(WINTER);
        System.out.println(SPRING);
        System.out.println(SUMMER);
        System.out.println(FALL);
    }


}
