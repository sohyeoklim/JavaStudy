package extends1.ex;

public class Album extends Item{
    private String artist;

    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print(); //부모클래스의 함수를 그대로 사용
        System.out.println("- " + this.artist);
    }
}
