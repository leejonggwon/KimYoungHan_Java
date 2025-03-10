package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //새로운 객체를 만들어서 반환한다
    //withXxx: 불변객체에서 값을 변경하는 경우 
    public ImmutableMyDate withYear(int newYear){
        return new ImmutableMyDate(newYear, month, day);
    }

    public ImmutableMyDate withMonth(int newMonth){
        return new ImmutableMyDate(year, newMonth, day);
    }

    public ImmutableMyDate withDay(int newDay){
        return new ImmutableMyDate(year, month, newDay);
    }


    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}



