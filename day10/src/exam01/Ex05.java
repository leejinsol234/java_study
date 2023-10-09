package exam01;

public class Ex05 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        //StringBuffer sb2 = sb.append("ABC"); //StringBuffer는 생성된 객체의 주소값을 그대로 반환하므로(this)

        sb.append("ABC").append("DEF").append("GHI"); //메서드 체이닝(Method Chaining)으로 작성할 수 있음.
//        System.out.println(sb == sb2); //true
//        StringBuffer sb3 = sb2.append("DEF");
        String str = sb.toString();
        System.out.println(str); //ABCDEFGHI

        /*
        public synchronized StringBuffer append(Object obj) {
        toStringCache = null;
        super.append(String.valueOf(obj));
        return this;
        }*/
    }

}
