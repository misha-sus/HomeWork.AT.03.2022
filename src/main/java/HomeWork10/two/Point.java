package HomeWork10.two;

interface Colorable {
    void setColor(int color);
    int getColor();
}
class Point { int x, y; };
abstract class ColoredPoint extends Point implements Colorable {
    int color;
}

