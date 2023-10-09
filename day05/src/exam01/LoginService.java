package exam01;

public class LoginService {
    private static LoginService instance;
    private LoginService(){}//기본 생성자를 private으로 만들어줌으로써 통제가 가능해진다.

    public static LoginService getInstance(){
        if(instance == null){
            instance = new LoginService();
        }
        return instance;
    }

}
