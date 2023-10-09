package exam01;

public class Ex09 {
    public static void main(String[] args) {
        String str= "";
        System.out.println("str.isEmpty(): "+str.isEmpty());

        String str1= "  ";
        System.out.println("str1.isEmpty(): "+str1.isEmpty());
        System.out.println("str1.trim().isEmpty(): "+str1.trim().isEmpty()); //(10버전까지)여백을 제거하고 비어있는지 확인
        System.out.println("str.isBlank: "+str1.isBlank()); //(11버전부터 가능)여백을 제거하고 비어있는지 확인
    }
}
