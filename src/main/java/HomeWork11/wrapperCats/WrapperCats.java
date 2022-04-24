package HomeWork11.wrapperCats;

import HomeWork11.Cat;

public class WrapperCats {
    private Cat cat1;
    private Cat cat2;
    private Cat cat3;

    public WrapperCats(Cat cat1, Cat cat2) {
        this.cat1 = cat1;
        this.cat2 = cat2;
    }
    public WrapperCats(Cat cat1, Cat cat2,Cat cat3) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.cat3 = cat3;
    }

    public Cat getCat1() { return cat1; }

    public Cat getCat2() { return cat2; }

    public Cat getCat3() { return cat3; }
}
