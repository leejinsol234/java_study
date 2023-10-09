package exam03;

public enum Transportation {
    BUS("버스",1450){
        @Override
        public int getTotal(int no) {
            return getBasicFare() * no;
        }
    }, //int ordinal(): 0
    SUBWAY("지하철",1250){
        @Override
        public int getTotal(int no) {
            return getBasicFare() * no;
        }
    }, //int ordinal(): 1
    TAXI("택시",4500){
        @Override
        public int getTotal(int no) {
            return getBasicFare() * no;
        }
    }; //int ordinal(): 2
    //생성자 매개변수

    private String title;
    private int basicFare; //기본요금



    //생성자 정의가 가능함, 생성자가 private이다.
    Transportation(String title,int basicFare){
        this.title = title;
        this.basicFare = basicFare;
    }

    public String getTitle(){ //getter를 통해 조회하기
        return title;
    }
    public int getBasicFare(){
        return basicFare;
    }

    public abstract int getTotal(int no); //Enum은 추상 클래스이므로 추상 메서드 정의도 가능하다


}
//Enum 클래스에 정의된 모든 상수가 Transportation 객체이다.

/*
* public enum Transportation extends java.lang.Enum {
    public static final Transportation BUS = new Transportation();//각각이 Enum 클래스의 하위 객체(정적 상수 객체)
    public static final Transportation SUBWAY = new Transportation();
    public static final Transportation TAXI= new Transportation();
}
* */
