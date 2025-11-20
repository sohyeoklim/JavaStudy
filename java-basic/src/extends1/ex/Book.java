package extends1.ex;

public class Book extends Item{
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print(); //부모클래스의 함수를 그대로 사용
        System.out.println("- " + this.author + ", isbn:" + this.isbn);
    }
}
