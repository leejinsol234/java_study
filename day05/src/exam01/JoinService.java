package exam01;


public class JoinService {
    //private static JoinService instance  = new JoinService();
    //위와 같이 작성하면 사용하지 않아도 생성되는데 필요할 때만 생성되어야 하므로
    private static JoinService instance;
    private JoinService(){}

    public static JoinService getInstance(){
        if(instance == null){
            instance = new JoinService();
        }

        return instance;
    }

}
