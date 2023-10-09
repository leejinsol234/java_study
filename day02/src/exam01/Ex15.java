package exam01;

public class Ex15 {
    public static void main(String[] args) {
        int total = 0;

        for(int num=1; num<=100; num++){
//            if(num%2 ==1) {//홀수만 더하기
            if(num%2 == 0) { //continue로 짝수 건너띄기
               continue;
            }
            total += num;
//            if(num==50){
//                break;
//            }
        }
        System.out.println(total);
    }
}
