package final1;

public class ConstructInit {

    final int value; //할당을 안해줬기 때문에 생성자를 통해서 할당해줘야함

    public ConstructInit(final int value) {
        this.value = value;
    }
}
