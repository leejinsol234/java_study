package exam01;

public class Ex04 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        //try { //전가받은 예외 처리하기
            service.login("user01", "1234");
        //} catch (UserIdExecption | UserPwException e) {
        //   System.out.println(e.getMessage());
        //}
    }
}


