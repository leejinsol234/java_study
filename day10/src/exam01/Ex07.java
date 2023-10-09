package exam01;

public class Ex07 {
    public static void main(String[] args) {
        String str = "Apple,Orange,Melon,Mango,Apple";
        int pos = str.indexOf("Apple"); //왼쪽에서 오른쪽으로 검색
        System.out.println(pos); //0
        int pos2 = str.lastIndexOf("Apple"); //오른쪽에서 왼쪽으로 검색(예.확장자명 검색할 때)
        System.out.println(pos2); //25

        str = str.replace("Apple","Pineapple");
        System.out.println(str); //Pineapple,Orange,Melon,Mango,Pineapple
    }
}
