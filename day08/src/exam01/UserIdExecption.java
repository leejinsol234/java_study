package exam01;

public class UserIdExecption extends RuntimeException { //수행 중에
    //상속을 통해 예외 만들기
    public UserIdExecption(String message) {

        super(message);
    }

}
