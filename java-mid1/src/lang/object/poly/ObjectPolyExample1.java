package lang.object.poly;

import lang.object.ObjectMain;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        //obj.sound();
        //obj.move(); 컴파일 오류

        //객체에 맞는 다운캐스팅 필요
        if(obj instanceof Dog dog) {
            dog.sound();
            //원래는 ((Dog).obj).sound(); 형태인데 if(obj instanceof Dog dog) 이라고하면 자동 다운캐스팅이 된다.
        } else if(obj instanceof Car car) {
            car.move();
        }
    }
}
