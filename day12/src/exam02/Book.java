package exam02;

import java.util.Objects;

public class Book implements Comparable<Book>{ // implements Comparable<Book> 정렬 기준 설정해주기
    private String title;
    private String author;
    private String publisher;

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher);
    }

    @Override
    public int compareTo(Book o) { //TreeSet내에서 사용하는 정렬기준
        //return title.hashCode() - o.title.hashCode(); //오름차순
                //기준이 되는 객체 - 비교 대상 객체 : (양수)오름차순
        //return  o.title.hashCode() - title.hashCode(); //내림차순
                //비교 대상 객체 - 기준이 되는 객체 : (음수)내림차순
        //return title.compareTo(o.title); //오름차순 String클래스에 정의된 기본 기능으로 compareTo()기본 기능
        return title.compareTo(o.title) * -1; //내림차순 (-1을 곱해서 음수로 만들었으므로)
        //return o.title.compareTo(title); //내림차순


    }
}
