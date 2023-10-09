package exam01;

public class Student {
    static int id; //학번
    String name; //학생명
    String subject; //전공과목

    public Student(){}

    public Student(int _id, String _name, String _subject){//디폴트 생성자(기본 생성자)
                    //지역변수
        // 객체의 주소값을 반환한다.
        // (반환값을 따로 명시하지 않음, return X. 반환값은 무조건 객체의 주소값)
        // 객체가 생성된 이후에 해야될 작업을 작성한다.
        // 멤버 변수들이 변수가 된 시점
        // 주로 멤버 변수의 초기화 작업이 이루어짐.
        id = _id;
        name = _name;
        subject = _subject;
        //id,name,subject는 힙 영역/_id,_name,_subject 는 스택 영역
    }


    void showInfo(){
        System.out.printf("id=%d, name=%s, subject=%s%n",id,name,subject);
    }


}
