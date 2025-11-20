package generic.ex5;

import generic.animal.Animal;

public class WildCardEx {

    //Box 클래스의 get 메서드 호출
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        //box 의 값을 t에 담아놓고 getName() 호출
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
}
