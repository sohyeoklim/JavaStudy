package poly.ex3;

public abstract class AbstractAnimal {

    public abstract void sound(); //상속 받는 자식 클래스는 반드시 오버라이딩 해줘야함

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
