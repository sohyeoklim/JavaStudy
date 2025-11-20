package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

    private int[] elementData = new int[10];
    private int size = 0;

    //값이 잘 들어갔는지 중복이 아닌지 확인하기 위해 boolean 타입을 반환
    //O(n)
    public boolean add(int value) {
        if(contains(value)) {
            return false;
        }

        elementData[size] = value;
        size++;
        return true;
    }

    //O(n)
    public boolean contains(int value) {
        for (int data : elementData) {
            if(data == value) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
                ", size=" + size +
                '}';
    }
}
