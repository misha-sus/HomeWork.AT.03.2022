package HomeWork8.four;

class Point {
    int x = 2;
}

class Test extends Point {
    double x = 4.7;

    void printBoth() {
        System.out.println(x + " " + super.x);
    }

    public static void main(String[] args) {
        Test sample = new Test();
        sample.printBoth();
        System.out.println(
//напишите здесь ваш код
                sample.x + " " + new Point().x
        );
    }
}

