package exam01;

public class LoginService {
    public void login(String userId, String userPw) /*throws UserIdExecption,UserPwException*/ {

        /*
        * userId - user01
        * userPw - 1234
        * */
//        try {
//            if (!userId.equals("user01")) {
//                throw new UserIdExecption("가입되지 않은 회원입니다.");
//            }
//
//            if (!userPw.equals("1234")) {
//                throw new UserPwException("비밀번호가 일치하지 않습니다.");
//            }
//
//            // id와 pw가 전부 일치하는 경우
//            System.out.println("로그인 성공!");
//
//        } catch (UserIdExecption | UserPwException e){ //또는 상위클래스로 작성 가능(다형성)
//            System.out.println(e.getMessage());
//        }

        if (!userId.equals("user01")) { //예외처리 미루기
            throw new UserIdExecption("가입되지 않은 회원입니다.");
        }

        if (!userPw.equals("1234")) {
            throw new UserPwException("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("로그인 성공!");

    }
}
