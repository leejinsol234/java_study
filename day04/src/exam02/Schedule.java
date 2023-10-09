package exam02;

public class Schedule {
    //정보은닉
    private int year;
    private int month;
    private int day;

    //get + 멤버 변수명 -> 값을 조회할 때
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }


    //set + 멤버 변수명-> 값을 지정할 때
    public void setYear(int _year){
        year = _year;
    }
    public void setMonth(int _month){
        month = _month;
    }
    public void setDay(int _day){ //캡슐화: 통제 가능하게 감싸놓음(통제 가능성). 메서드 내부에서 일어나는 사적인 영역
        if(month == 2 && _day > 28){
            _day = 28;
        }
        //코드 작성 가능
        day = _day;
        //코드 작성 가능하므로
        //통제 가능성
    }

    void showInfo(){
        System.out.printf("year=%d, month=%d, day=%d", year,month,day);
    }
}
