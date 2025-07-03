package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {

        MyArrayListV3 list = new MyArrayListV3();
        //마지막에 추가 //0(1)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);
        System.out.println();

        //원하는 위치에 추가
        System.out.println("addLast");
        list.add(3, "addList"); //0(1)
        System.out.println(list);
        System.out.println();

        System.out.println("addFirst");
        list.add(0,"addFirst"); //0(n)
        System.out.println("list = " + list);
        System.out.println();

        //삭제
        Object removed1 = list.remove(4); //remove Last 0(1)
        System.out.println("removed(4)= " + removed1); //삭제된 값 출력
        System.out.println(list);
        System.out.println();

        Object removed2 = list.remove(0);
        System.out.println("removed(0)= " + removed2);
        System.out.println(list);
        System.out.println();

    }
}
