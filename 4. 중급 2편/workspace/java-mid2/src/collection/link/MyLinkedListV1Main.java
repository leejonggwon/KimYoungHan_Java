package collection.link;
public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();

        System.out.println("==데이터 추가==");
        System.out.println(list);

        list.add("a");
        System.out.println(list);

        list.add("b");
        System.out.println(list);

        list.add("c");
        System.out.println(list);
        System.out.println();

        System.out.println("==기능 사용==");
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(1) = " + list.get(1));              //1번 인덱스 item 값 //b
        System.out.println("list.indexOf('c') = " + list.indexOf("c"));  //"c"는 인덱스 2번에
        System.out.println("list.set(2, 'z') = " + list.set(2, "z"));    //2번인덱스에 z값 입력
        System.out.println(list);
        System.out.println();

        System.out.println("==범위 초과==");
        list.add("d");
        System.out.println(list);

        list.add("e");
        System.out.println(list);

        //범위가 초가해도 예외가 발생하지 않는다
        list.add("f");
        System.out.println(list);

    }
}
