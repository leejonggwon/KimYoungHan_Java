package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5; //수용량

    private Object[] elementData;
    private int size = 0; //리스트 크기

    //생성자
    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY]; //생성해서 넣는다
    }

    //생성자
    public MyArrayListV1(int initialCapacity){
        elementData = new Object[initialCapacity]; //배열의 크기를 직접정의
    }

    public int size(){
        return size; //사이즈 반환
    }

    //리스트에 데이터를 추가, 추가하면 +1 사이즈 증가
    public void add(Object e){
        elementData[size] = e;
        size++;
    }

    //index에 있는 항목을 조회기능
    public Object get(int index){
        return elementData[index];
    }

    //배열을 특정위치에 값을 변경한다
    public Object set(int index, Object element){
        Object oldValue = get(index); //조회한값을 oldValue에 넣는다(기존의값)
        elementData[index] = element; //새로운값을 배열에 넣는다
        return oldValue;
    }

    //몇 번 인덱스에 있는지 검색기능
    public int indexOf(Object o){
        for (int i = 0; i < size; i++) { //데이터 들어온 개수 만큼 리스트 순차 탐색한다
            if(o.equals(elementData[i])){
                return i; //인수와 같은 데이터가 있는 인덱스의 위치를 반환한다
            }
        }
        return -1; //데이터가 없으면 -1
    }

    //elementData를 출력할 것이다
    public String toString(){
        return Arrays.toString(                     //문자열 형태로 보기 좋게 변환
                Arrays.copyOf(elementData, size)) + //elementData 배열의 앞에서 size만큼 복사한다
                " size= " + size + ", capacity= " + elementData.length;
    }
}









