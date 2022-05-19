package HomeWorkStreamApi.preconditionObjects;

public abstract class Fruit {
    boolean isFresh;
    String toDo;

    public boolean isFresh() {
        return isFresh;
    }

    public void setFresh(boolean fresh) {
        isFresh = fresh;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "isFresh=" + isFresh +
                ", toDo='" + toDo + '\'' +
                '}';
    }
}
