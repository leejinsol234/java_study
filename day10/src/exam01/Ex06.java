package exam01;

public class Ex06 {
    public static void main(String[] args) {
        String[] mobiles = {"010-0000-0000","010-1111-1111"};
        String[] names = {"name1","name2"};
        //이름(전화번호)

        //String.format 형식화된 문자열 만들기
        for(int i =0; i<names.length; i++){
            /*
            * %s: 문자열
            * %c: 문자 1개
            * %d: 정수
            * %f: 실수
            * %n: 줄 개행(\n)
            */
            String str = String.format("%s(%s)",names[i],mobiles[i]);
            System.out.println(str);
            //name1(010-0000-0000)
            //name2(010-1111-1111)
        }
    }
}
