package exam02;

public class Student {
    //변수에 대한 정의. (=멤버 변수 정의 )
    int id; //학번
    String name; //학생명
    String subject; //전공과목

    //함수에 대한 정의. (=메서드)
    void study(){
        System.out.printf("학번: %d, 이름: %s, 전공과목: %s%n", id,name,subject);

        //void로 함수를 작성하면 return을 따로 명시하지 않는다.
    }
}
