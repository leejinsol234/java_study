package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        //클래스형 변수명 = new 생성자
        //s1은 main함수의 지역변수
        //s1은 참조 변수
        //s1은 스택에서 주소값으로 힙에 있는 자원(참조 자료형-int id,String name,String subject)에 접근
        //메모리를 생성해주는 연산자 new

        /*
        변수.속성명
        변수.함수명(...);
        */

        s1.id = 1000;
        s1.name="학생1";
        s1.subject="과목1";
        //값을 대입함으로써 메모리가 할당됨
        //id,name,subject는 힙 메모리(객체 전용 메모리)에 저장됨

        s1.study();
        System.out.println(System.identityHashCode(s1)); //객체의 주소값

        Student s2 = new Student();
        s2.id = 1001;
        s2.name = "학생2";
        s2.subject = "과목2";

        s2.study();
        System.out.println(System.identityHashCode(s2));

        Student s3 = s2; //s3의 주소값에 s2주소값이 대입됨.
        s3.name="학생3";
        s3.study();
        s2.study();
        System.out.println(System.identityHashCode(s3));
        System.out.println(s2 == s3); //s2와 s3의 주소값이 같다.

        s1 = null; //참조가 끊김. 참조가 끊긴 힙의 메모리는 Garbage Collector가 제거한다.
    }
}
