package HomeWorkStreamApi.preconditionObjects;

public class Orange extends Fruit{
    public void eatOrange (){
        System.out.println( "ем апельсин");
    }

    @Override
    public String toString() {
        return "Orange{" +
                "isFresh=" + isFresh +
                ", toDo='" + toDo + '\'' +
                '}';
    }
}
