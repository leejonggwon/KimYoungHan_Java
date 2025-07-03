package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;


    public MyArrayListV3() {
        elementData = new Object[DEFAULT_CAPACITY];
    }


    public MyArrayListV3(int initialCapacity){
        elementData = new Object[initialCapacity];
    }

    public int size(){
        return size;
    }

    public void add(Object e){
        if(size == elementData.length){ //사이즈가 length에 도달한 상황이라면 배열을 키워준다(grow())
            grow();
        }

        elementData[size] = e;
        size++;
    }

    //코드 추가
    public void add(int index, Object e){
        if(size == elementData.length){ //사이즈초과하면 grow()를 통해서 배열크기를 초과한다
            grow();
        }
        shiftRightFrom(index);  //데이터 이동
        elementData[index] = e; //특정 index위치에 element를 넣는다
        size++;
    }

    //코드추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for(int i = size; i > index; i--){
            elementData[i] = elementData[i-1]; //앞에데이터를 뒤로 이동한다
        }
    }


    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index){
        return elementData[index];
    }

    public Object set(int index, Object element){
        Object oldValue = get(index);
        elementData[index] = element;
        return oldValue;
    }

    //코드 추가
    public Object remove(int index){
        Object oldValue = get(index); //삭제하는 위치값 반환
        shiftLeftFrom(index); //왼쪽으로 데이터 이동
        size--;
        elementData[size] = null; //마지막값은 남아있으므로 마지막은 비워줘야 한다
        return oldValue;
    }

    //코드 추가, 요소의 index 부터 마지막까지 왼쪽으로 밀기
    private void shiftLeftFrom(int index) {
        for(int i = index; i < size - 1; i++){
            elementData[i] = elementData[i + 1];

        }
    }


    public int indexOf(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        return Arrays.toString(
                Arrays.copyOf(elementData, size)) +
                " size= " + size + ", capacity= " + elementData.length;
    }
}









