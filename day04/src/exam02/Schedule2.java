package exam02;

public class Schedule2 {
    private int year;
    private int month;
    private int day;

    public Schedule2(){
        this(2023, 9, 8);
    } //기본 생성자를 추가하여 오류를 없앨 수 있다.
      //생성자 메서드의 첫번째 줄에 정의되어야 한다.


    public Schedule2(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day; //인스턴스 자원의 day가 확실하므로 this생략
    }

    public void setDay(int day) {
        this.day = day; //지역변수인지 멤버변수인지 출처가 애매하므로 this를 작성해야 한다.
    }

    @Override
    public String toString() {

        return "Schedule2{" +
                "year=" + this.year + //대상이 명확할 때는 this를 생략할 수 있다.
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public void printThis(){
        System.out.println(this); //this.toString()
        System.out.println(System.identityHashCode(this));
    }
}
