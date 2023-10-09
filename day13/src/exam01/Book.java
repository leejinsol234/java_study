package exam01;

public record Book( //record 클래스는 생성자 매개변수를 사용할 수 있고 getter,toString(),equals와 hashcode가 이미 정의되어있다.
        int id,
        String title,
        String author,
        String publisher) {}
