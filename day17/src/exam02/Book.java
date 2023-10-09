package exam02;

import java.io.Serializable;

public class Book implements Serializable { //Serializable(구현 내용이 없는 marker interface로 동의했음을 의미함)

    private static final long serialVersionUID = 100L; //직접 버전 관리하기
    private String title;
    private transient String author; //transient 직렬화 배제 -> null값으로 복구(역직렬화)됨.
    private String publisher;
    private int price; //직렬화할 때 없던 값

    private void method(){}//직렬화할 때 없던 값

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
}
