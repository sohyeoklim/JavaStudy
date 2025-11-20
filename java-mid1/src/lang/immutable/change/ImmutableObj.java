package lang.immutable.change;

import com.sun.source.tree.UsesTree;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //setter 못맨듬

    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); //새로운 자신과 같은 클래스의 객체를 만들어서 반환해버림
    }
}
