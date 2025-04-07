package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("name= " + data1.name);
        System.out.println("A count= " + Data3.count);
        //Data3.count로 접근: static은 메서드영역에서 관리하므로 메서드영역에 있는 count 값이 하나 증가된다.

        Data3 data2 = new Data3("B");
        System.out.println("B count= " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count= " + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println("인스턴스를 통한 접근 " + data4.count);
        //인스턴스를 통한 접근 권장하지 않는다
        //static변수인데 인스턴스변수로 접근한것 같아보임

        //클래스를 통한 접근
        System.out.println("클래스를 통한 접근 " + Data3.count);
    }
}
