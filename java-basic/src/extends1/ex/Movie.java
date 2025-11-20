package extends1.ex;

public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void print() {
        super.print(); //부모클래스의 함수를 그대로 사용
        System.out.println("- " + this.director + ", isbn:" + this.actor);
    }
}