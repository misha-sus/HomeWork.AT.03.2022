package HomeWorkStreamApi.preconditionObjects;

public class Apple extends Fruit{
    public void makeJam(){
        System.out.println("закатываю яблоки в банку");
    }

    @Override
    public String toString() {
        return "Apple{" +
                "isFresh=" + isFresh +
                ", toDo='" + toDo + '\'' +
                '}';
    }
}
