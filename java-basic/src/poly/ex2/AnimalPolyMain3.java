package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArray = {new Dog(), new Cat(), new Caw()};

        for (Animal animal : animalArray) {
            soundAnimal(animal);
        }
    }


    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 종료");
    }
}