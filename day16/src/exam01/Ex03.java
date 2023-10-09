package exam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex03 {
    private static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        IntStream.rangeClosed(1,20).forEach(Ex03::add);

        //partitioningBy() : true,false로 나눌 때(성별로 나누기처럼 두 가지 값으로만)
        Map<Boolean,List<Student>> students1 = students.stream()
                .collect(Collectors.partitioningBy(s -> s.getGender() == 'F'));

        //t,f값을 가지고 자료를 두 가지로 나누기
        List<Student> females = students1.get(true);
        List<Student> males = students1.get(false);

        System.out.println("----female----");
        females.stream().forEach(System.out::println);

        System.out.println("----males----");
        males.stream().forEach(System.out::println);
    }

    private static void add(int i){
        int grade = (int)(Math.random() * 3) + 1; //(0,1,2)+1
        int ban = (int)(Math.random() * 3) +1;
        char gender = (new Random()).nextBoolean() ? 'F':'M';
        students.add(new Student(grade,ban,gender,"학생"+i));
    }
}
