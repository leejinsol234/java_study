package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Student s1 = new Student(1000,"학생1","과목1");
        s1.showInfo();

        Student s2 = new Student(1001, "학생2", "과목2");
        s2.showInfo();
        s1.showInfo(); //static은 하나의 자원을 공유하게 된다.

    }
}
