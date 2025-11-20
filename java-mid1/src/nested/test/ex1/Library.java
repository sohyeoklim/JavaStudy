package nested.test.ex1;

public class Library {

    private Book[] books;
    private int count;

    public Library(int librarySize) {
        books = new Book[librarySize];
        count = 0;
    }

    public void addBook(String book, String author) {
        //검증 로직
        if(count >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직
        books[count++] = new Book(book, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }

    private static class Book {

        private String book;
        private String author;

        public Book(String book, String author) {
            this.book = book;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목: " + book + " 저자: " + author;
        }
    }
}
