package exam01;

public class Ex03 {
    public static void main(String[] args) {
        try(MyResource myResource = new MyResource()){
//            if(myResource instanceof AutoCloseable){
//            AutoCloseable 인터페이스를 구현하는지가 기준
//            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
