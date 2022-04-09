package HomeWork10.one;
import java.util.ArrayList;
import java.util.List;

interface A {}
interface B extends A{}
interface C extends B{}

class Aa implements A,C {}
class Bb implements B,C {}
class Cc implements C {}

public class PaintedPoint {
    public static void main(String[] args) {
        Aa a = new Aa();
        Bb b = new Bb();
        Cc c = new Cc();

        List<C> cList = new ArrayList<>();
        cList.add(a);
        cList.add(b);
        cList.add(c);
    }
}

