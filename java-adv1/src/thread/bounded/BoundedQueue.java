package thread.bounded;

public interface BoundedQueue {
    void put(String data); //데이터 넣기

    String take(); //데이터 꺼내기
}
