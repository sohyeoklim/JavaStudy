package generic.test.ex1;

public class Container<V> {

    private V item;

    public boolean isEmpty() {
        return item == null;
    }

    public void setItem(V item) {
        this.item = item;
    }

    public V getItem() {
        return item;
    }
}
