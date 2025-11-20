package generic.ex5;

//T 클래스 타입의 정보를 저장 및 반환을 하는 클래스
public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
